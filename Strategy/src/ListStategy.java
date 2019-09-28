
public interface ListStategy {
	default void start(StringBuilder sBuilder) {};
	void addListItem(StringBuilder sBuilder, String item);
	default void end(StringBuilder sBuilder) {};
}
