package project1;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
			
			
			for(int s =1; s<=5-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		

	}
	
		
	}	


}