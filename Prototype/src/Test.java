class Point
{
  public int x, y;
  
  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
}

class Line
{
  public Point start, end;
  
  public Line(Point start, Point end)
  {
    this.start = start;
    this.end = end;
  }

  public Line deepCopy()
  {
	  Point nStart = new Point(start.x, start.y);
	  Point nEnd = new Point(end.x, end.y);
    return new Line(nStart, nEnd);
  }
}

class DemoTest {
	public static void main(String[] args) {
		Point a = new Point(33, 55);
		Point b = new Point(77, 99);
		Line x = new Line(a, b);
		Line y = x.deepCopy();
		System.out.println(x);
		System.out.println(y);
	}
}