package MultipleParameter;

public class MultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red red = new Red();
		Green green = new Green();
		Blue blue = new Blue();
		Colour<Red, Green, Blue> colour = new Colour<>(red, green, blue);
	}

}
