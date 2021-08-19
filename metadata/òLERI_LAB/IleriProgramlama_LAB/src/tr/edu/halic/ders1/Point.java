package tr.edu.halic.ders1;

public class Point {

	private int m_x, m_y;

	public Point(int x, int y) {

		// points has been identified
		m_x = x;
		m_y = y;
	}

	public void SetX(int x) {
		m_x = x;
	}

	public int GetX() {
		return m_x;
	}

	public void SetY(int y) {
		m_y = y;
	}

	public int GetY() {
		return m_y;
	}

	public static double Distance(Point p1, Point p2) {

		// distance calculate of between two points
		return Math.sqrt((Math.pow((p1.m_x - p2.m_x), 2) + (Math.pow((p1.m_y - p2.m_y), 2))));
	}

}
