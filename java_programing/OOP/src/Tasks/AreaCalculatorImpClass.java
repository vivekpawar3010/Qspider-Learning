package Tasks;

public class AreaCalculatorImpClass implements AreaCalculator{

	public AreaCalculatorImpClass() {
		System.out.println("This is the area Calculator!");
	}
	
	public void areaOfCircle(double rad) {
		double area = 2 * PI * rad;
		System.out.println("The Area of Given Ciricle is " + area);
	}
	public void areaOfSquare(double len) {
		double area = len * len;
		System.out.println("The Area of Given Square is " + area);
	}
	public void areaOfRectangle(double w, double l) {
		double area = w * l;
		System.out.println("The Area of Given Rectangle is " + area);
	}
	public void areaOfCube(double len){
		double area = len * len * len;
		System.out.println("The Area of Given Cube is " + area);
	}
	public void areaOfTriangle(double s1, double s2, double s3) {
		double s = (s1 + s2 + s3)/2;
		double total = s * (s - s1) * (s- s2) * (s - s3);
		double area = Math.sqrt(total);
		System.out.println("The Area of Given Ciricle is " + area);
	}

}
