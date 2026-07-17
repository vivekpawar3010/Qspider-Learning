package Tasks;

public class AreaCalculatorDriver {

	public static void main(String[] args) {
		AreaCalculator aCal = new AreaCalculatorImpClass();
		aCal.areaOfCircle(5);
		aCal.areaOfSquare(5);
		aCal.areaOfRectangle(5, 4);
		aCal.areaOfCube(5);
		aCal.areaOfTriangle(3, 4, 5);
	}

}
