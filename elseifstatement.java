package javtutorials;

public class elseifstatement {

public static void main(String[] args){
		
		// if more than one condition use else if statement
		
		int a=90;
		
		if(a<33) {
			System.out.println("You failed your exam");
		}
		else if (a>=33 & a<40) {
			System.out.println("Your grade is E");
			
		}else if (a>=40 & a<50) {
	System.out.println("Your grade is D");
	
}else if (a>=50 & a<60) {
	System.out.println("Your grade is C");
	
}else if (a>=60 & a<70) {
	System.out.println("Your grade is B");
	
}else if (a>=70 & a<80) {
	System.out.println("Your grade is A");
	
}else if  (a>=80 & a<90) {
	System.out.println("Your grade is A+");
	
}else   {
	System.out.println("Your grade is O");
	
}
}

}
