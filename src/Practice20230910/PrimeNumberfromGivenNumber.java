package Practice20230910;

import java.util.Scanner;

public class PrimeNumberfromGivenNumber {

	public static void main(String[] args) {

     Scanner k = new Scanner(System.in);
     System.out.println("Write the number  ");
           double s = k.nextDouble();
           boolean Flag = true;
          for(int i=2;i<s/2;i++) {
        	  if(((s%i)==0)) {
        		  Flag = false;
        		  break;
        	  }
        	  else Flag = true;
          }
          if(Flag) {
        	  System.out.println("Value is prime number");
          }
          else System.out.println("Value is not prime number");
           

	}

}
