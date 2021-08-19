package tr.edu.halic.ders1;

public class TestAnalyticTriangle {

	public static void main(String[] args) {
		Point p1 = new Point(3, 2);
		Point p2 = new Point(-5, 4);
		Point p3 = new Point(4, 1);

		AnalyticTriangle a = new AnalyticTriangle(p1, p2, p3);
		Triangle t = new Triangle();
		t.Area(3, 4, 5);
		t.Perimeter(3, 4, 5);
		System.out.println("Alan:" + t.GetArea());
		System.out.println("Cevre:" + t.GetPerimeter());
		System.out.println("1. kenar: " + Point.Distance(p1, p2));
		System.out.println("2. kenar: " + Point.Distance(p2, p3));
		System.out.println("3. kenar: " + Point.Distance(p1, p3));

		System.out.println("Ýki nokta arasýndaki uzaklýk: " + Point.Distance(p1, p2));
	}
}
