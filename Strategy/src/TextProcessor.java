import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStategy>{
	private StringBuilder stringBuilder = new StringBuilder();
	private LS listStategy;
	
	public TextProcessor(Supplier<? extends LS> cSupplier) {
		listStategy = cSupplier.get();
	}

	public void appendList(List<String> items) {
		listStategy.start(stringBuilder);
		for (String item : items) {
			listStategy.addListItem(stringBuilder, item);
		}
		listStategy.end(stringBuilder);
	}
	
	public void clear() {
		stringBuilder.setLength(0);
	}
	
	@Override
	public String toString() {
		return stringBuilder.toString();
	}
}
