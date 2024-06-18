package Practice20230910;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestNumber {

	public static void main(String[] args) {

      int[] k = {5,7,8,4,48,67};
    Set<Integer> s = new HashSet<Integer>();
    int total=0;
    
    for(int s1:k) {
    	s.add(s1);
    	total++;
    }
    Arrays.sort(k);
    System.out.println(k[total-2]);
    
    
    

	}

}
