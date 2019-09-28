import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;



public class Demo {
	public static StateMachine<States, Events> buildMachine() throws Exception {
		StateMachineBuilder.Builder<States, Events> stateMachineBuilder = StateMachineBuilder.builder();
		
		stateMachineBuilder.configureStates()
		.withStates()
		.initial(States.OFF_HOOK)
		.states(EnumSet.allOf(States.class));
		
		stateMachineBuilder.configureTransitions()
		.withExternal()
			.source(States.OFF_HOOK)
			.event(Events.CALL_DIALED)
			.target(States.CONNECTING)
			.and()
		.withExternal()
			.source(States.OFF_HOOK)
			.event(Events.STOP_USING_PHONE)
			.target(States.ON_HOOK)
			.and()
		.withExternal()
			.source(States.CONNECTING)
			.event(Events.HUNG_UP)
			.target(States.OFF_HOOK)
			.and()
		.withExternal()
			.source(States.CONNECTING)
			.event(Events.CALL_CONNECTED)
			.target(States.CONNECTED)
			.and()
		.withExternal()
			.source(States.CONNECTED)
			.event(Events.HUNG_UP)
			.target(States.OFF_HOOK)
			.and()
		.withExternal()
			.source(States.CONNECTED)
			.event(Events.LEFT_MESSGE)
			.target(States.OFF_HOOK)
			.and()
		.withExternal()
			.source(States.CONNECTED)
			.event(Events.PLACED_ON_HOLD)
			.target(States.ON_HOLD)
			.and()
		.withExternal()
			.source(States.ON_HOLD)
			.event(Events.TAKEN_OFF_HOLD)
			.target(States.CONNECTED)
			.and()
		.withExternal()
			.source(States.ON_HOLD)
			.event(Events.HUNG_UP)
			.target(States.OFF_HOOK);
		return stateMachineBuilder.build();
	}
	
	public static void main(String[] args) throws Exception {
		StateMachine<States, Events> machine = buildMachine();
		machine.start();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			State<States, Events> state = machine.getState();
			System.out.println("The phone is now " + state.getId());
			System.out.println("Please select a trigger: ");
			
			List<Transition<States, Events>> transitions = machine.getTransitions()
					.stream()
					.filter(t -> t.getSource() == state)
					.collect(Collectors.toList());
			for (int i = 0;i<transitions.size(); i++) {
				System.out.println(i + ":" + transitions.get(i).getTrigger().getEvent());
			}
			boolean parseOK = false;
			int choice = 0;
			do {
				try {
					System.out.println("Please enter your choice.");
					choice = Integer.parseInt(console.readLine());
					parseOK = choice >= 0 && choice < transitions.size();
				}
				catch (Exception e) {
					parseOK = false;
					System.err.println(e.getStackTrace());
				}
			}while(!parseOK);
			
			machine.sendEvent(transitions.get(choice).getTrigger().getEvent());
			
			if(machine.getState().getId() == States.ON_HOOK) {
				break;
			}
		}
		System.out.println("we are done.");
		
	}
}
