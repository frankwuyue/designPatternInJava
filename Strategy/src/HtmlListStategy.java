
public class HtmlListStategy implements ListStategy {

	@Override
	public void start(StringBuilder sBuilder) {
		sBuilder.append("<ul>").append(System.lineSeparator());
	}
	
	@Override
	public void addListItem(StringBuilder sBuilder, String item) {
		sBuilder.append("  <li>")
				.append(item)
				.append("</li>")
				.append(System.lineSeparator());
	}

	@Override
	public void end(StringBuilder sBuilder) {
		sBuilder.append("</ul>").append(System.lineSeparator());
	}
}
