package selenium;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new RemoteCalculator();
		System.out.println(cal.add(1,2,3));
		System.out.println(cal.sub(3,4));
		System.out.println(cal.mul(5,6,1,2));

	}

}
