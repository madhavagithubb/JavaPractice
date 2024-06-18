package Practice20230910;

public class PyramidPattern {

	public static void main(String[] args) {

			
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
			
		
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>0;j--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<5;i++) {
			for(int k=5-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
			
		
		for(int i=0;i<5;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=5-i;j>0;j--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
			
				
		
		
	
		
		
		
		
		}
	}
