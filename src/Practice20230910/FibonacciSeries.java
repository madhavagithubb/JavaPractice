package Practice20230910;

public class FibonacciSeries {

	public static void main(String[] args) {

		int total = 10;
       int n1=0,n2=1,n3;
       for(int i=2; i<total;i++) {
    	   n3=n1+n2;
    	   System.out.println(n3);
    	   n1=n2;
    	   n2=n3;
       }
	}

}
