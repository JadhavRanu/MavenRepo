package packagefolder1;

public class Ifelse {
	

	public static void main(String[] args) {
		
	
		int a = 60;
		int b = 20;
		int c = 50;
		int d = 100;{

		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println(a + " a is greater");
				} else {
					System.out.println(d + " d is greater");
				}

			}

		} else {
			if (b > c) {
				if (b > d) {
					System.out.println(b + " b is greater");
				} else {
					System.out.println(d + " d is greater");
				}

			} else {
				if (c > d) {
					System.out.println(c + " c is greater");

				} else {
					System.out.println(d + " d is greater");
				}
			}
		}
}}}
	

	