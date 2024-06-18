package Practice20230910;

import java.util.Calendar;

public class ReversetheString {

	public static void main(String[] args) {

    Calendar c = Calendar.getInstance();
    String d =  c.getTime().toString();
    System.out.println(d);
    String temp = "";
    for(int i=0;i<d.length();i++) {
    	temp = d.charAt(i)+temp;
    }
    System.out.println(temp);
    
    StringBuilder j = new StringBuilder();
    j.append(d);
    System.out.println(j.reverse());
     
     
	}
}
