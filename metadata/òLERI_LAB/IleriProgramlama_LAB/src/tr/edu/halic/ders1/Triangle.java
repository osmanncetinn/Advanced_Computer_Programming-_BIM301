package tr.edu.halic.ders1;

public class Triangle {

	private double m_side1, m_side2, m_side3;

	// sides has been identified
	public Triangle() {
		m_side1 = 3;
		m_side2 = 4;
		m_side3 = 5;
	}

	public Triangle(double side1, double side2, double side3) {
		m_side1 = side1;
		m_side2 = side2;
		m_side3 = side3;

	}

	public void SetSide1(double side) {

		if (isValidTriangle(side, m_side2, m_side3) == false) {
			System.out.println("1.kenar hatasi");
			return;
		}

		m_side1 = side;
	}

	public double GetSide1() {
		return m_side1;
	}

	public void SetSide2(double side) {

		if (isValidTriangle(side, m_side1, m_side2) == false) {
			System.out.println("2.kenar hatasi");
			return;
		}
		m_side2 = side;
	}

	public double GetSide2() {
		return m_side2;
	}

	public void SetSide3(double side) {

		if (isValidTriangle(m_side1, m_side2, side) == false) {
			System.out.println("3.kenar hatasi");
			return;
		}
		m_side3 = side;
	}

	public double GetSide3() {
		return m_side3;
	}

	public boolean isValidTriangle(double side1, double side2, double side3) {

		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
			return false;
		return (side1 + side2 > side3) && (Math.abs(side1 - side2) < side3) && // abs mutlak deger temsil eder...
				(side2 + side3 > side1) && (Math.abs(side2 - side3) < side1) && (side1 + side3 > side2)
				&& (Math.abs(side1 - side3) < side1);
	}

	private double Perimeter(double m_side1, double m_side2, double m_side3) {

		return (m_side1 + m_side2 + m_side3);

	}

	private double Area(double m_side1, double m_side2, double m_side3) {

		double u;
		u = (m_side1 + m_side2 + m_side3) / 2;
		return (Math.sqrt((u * (u - m_side1) * (u - m_side2) * (u - m_side3))));
	}
	
	
}
