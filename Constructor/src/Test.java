
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube1 = new Cube();
		System.out.println("The volume of the cube is " + cube1.getcubeVolume());
		Cube cube2 = new Cube(80, 90, 100);
		System.out.println("The volume of the cube is " + cube2.getcubeVolume());
	}
}