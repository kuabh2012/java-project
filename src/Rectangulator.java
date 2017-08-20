public class Rectangulator {

	public static void main (String[] args) {
		int length = Ineger.parseInt(args[0]);
		int width = Ineger.parseInt(args[1]);



		Rectangle myRectangle = new Rectangle(length,width);

		String output = String.format("*** your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n" , myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

		System.out.println(output);





	}


}
