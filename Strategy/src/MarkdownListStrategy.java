
public class MarkdownListStrategy implements ListStategy {

	@Override
	public void addListItem(StringBuilder sBuilder, String item) {
		sBuilder.append(" * ").append(item)
		.append(System.lineSeparator());
	}

}
