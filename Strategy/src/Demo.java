import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
//		TextProcessor textProcessor = new TextProcessor(OutputFormat.MARKDOWN);
//		textProcessor.appendList(Arrays.asList("list","array","map"));
//		System.out.println(textProcessor.toString());
//		
//		textProcessor.clear();
//		
//		textProcessor.setTextProcessor(OutputFormat.HTML);
//		textProcessor.appendList(Arrays.asList("list","array","map"));
//		System.out.println(textProcessor.toString());
		
		TextProcessor<MarkdownListStrategy> tProcessor = new TextProcessor<>(MarkdownListStrategy::new);
		tProcessor.appendList(Arrays.asList("alpha","beta","gamma"));
		System.out.println(tProcessor.toString());
		
		TextProcessor<HtmlListStategy> tProcessor2 = new TextProcessor<>(HtmlListStategy::new);
		tProcessor2.appendList(Arrays.asList("alpha","beta","gamma"));
		System.out.println(tProcessor2.toString());
	}
}
