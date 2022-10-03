package project1;

public class practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rating =8;
		  if (rating>=1 && rating<=3) {
			  System.out.println("rating is below");
		  }
		  else if (rating>=4 && rating<=6) {
		  System.out.println("rating is good");
		  }
		  else if (rating>=7 && rating <=8){
			  System.out.println("rating is best!!!");
		  
		  }else {
			  System.out.println("rating must between 1-10");
		  }
		  
		  int survey = 2;
		  if (survey>=1 && survey<=5) {
			  System.out.println("survey is below");
		  }
		  else if (survey>=6 && survey<=8) {
			  System.out.println("survey is average");
		  }
		  else if (survey>=9 && survey<=12) {
			  System.out.println("survey is good");
		  }
		  else if (survey>=13 && survey<=15) {
			  System.out.println("survey is best");
		  }
		  else if (survey>=16 && survey<=20) {
			  System.out.println("survey is excellent");
		  }else {
			  System.out.println("survey is between 1-20");
		  }
		  // for loop
		  for(int i=0; i<=5; i++) {
			  System.out.println("survey is below");
		  }
		  //number up to 50 
		  for(int b=0; b<=50; b++) {
			  System.out.println(b);
			  
		  }
		  for (int c=0; c<=50; c=c+5) {
			  System.out.println(c);
			  // finding even number
		  }
		  for( int number1=1; number1<=50; number1++) {
		  if (number1%2==0) {
			  System.out.println("number : "+number1+" is even");
		  }else {
			  System.out.println("number : "+number1+" is odd");
		  }
			 for(int m=0; m<=100;m++) {
				 if( m%2==0) {
					 System.out.println("number : "+m+" is even");
				 }
				 else {
					 System.out.println("number : "+number1+" is odd");
				 }
				 for(int n=10; n<=50; n++) {
					 if ( n%2==0) {
						 System.out.println("number : "+n+" is even");
						 
					 }
					 else {
						 System.out.println("number : "+n+" is odd");
					 }
				 }
			 }
			  
		  }
		  }

	}


