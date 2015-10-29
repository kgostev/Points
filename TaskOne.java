
public class TaskOne {

	private static String path;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		path = ">v<>>>v^~><><~><><";
		findPosition(1, 0);
	}

	private static void findPosition(int x, int y) {
		short xDirection = 1;
		short yDirection = 1;

		for (int i = 0; i < path.length(); i++) {
			switch (path.charAt(i)) {
			case '>':
				x += 1*xDirection;
				break;
			case '<':
				x -= 1*xDirection;
				break;
			case '^':
				y -= 1*yDirection;
				break;
			case 'v':
				y += 1*yDirection;
				break;
			case '~':
				xDirection *= -1;
				yDirection *= -1;
				break;
			}
		}
		System.out.println("x:" + x + " y:" + y);
	}

}
