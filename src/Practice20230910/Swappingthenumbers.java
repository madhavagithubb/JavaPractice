package Practice20230910;

public class Swappingthenumbers {

	public static void main(String[] args) {

   int a= 2,b=4,c;
   
    c=b;
    b=a;
    a=c;
    System.out.println(a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a+" "+b);
       
   

	}

}
