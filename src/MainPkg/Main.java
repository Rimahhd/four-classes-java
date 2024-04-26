package MainPkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGeometricObject SGO = new SimpleGeometricObject("red", true);
		System.out.println(SGO.toString());
		CircleFromSimpleGeometricObject CFSGO = new CircleFromSimpleGeometricObject();
		CFSGO.setColor("blue");
		CFSGO.setFilled(false);
		CFSGO.setRadius(10.2);
		System.out.println(CFSGO.toString());
		System.out.println(CFSGO.getArea());
		System.out.println(CFSGO.getAreaMethod2());
		System.out.println(CFSGO.getPerimeter());
		CFSGO.printCircle();
	}

}
