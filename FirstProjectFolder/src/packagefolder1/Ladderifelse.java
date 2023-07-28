package packagefolder1;

public class Ladderifelse {
	public static void main(String[] args) {
		/*double marks = 80;
		if (marks > 75) {
			System.out.println("you will get distintion");
		} else if (marks > 60) {
			System.out.println("you will get first class");
		} else if (marks > 35) {
			System.out.println("you will get second class");
		} else {
			System.out.println("you will failed");
		}*/
	


int i=2013;

if(i%4==0) {
	
	System.out.println("Given year is leap year");
	
}

else if(i%100==0) {
	
	System.out.println("given year is not leap year");
	
	
}
else if(i%400==0) {
	
	System.out.println("Given year is leap year");
	
}
else {
	
	System.out.println("Above year is not leap year");
}}}