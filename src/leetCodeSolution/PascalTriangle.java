package leetCodeSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(generate(5));
		System.out.println(getRow(30));
	}
	static List<List<Integer>> rows = new ArrayList<List<Integer>>();
	

    public static List<List<Integer>> generate(int numRows) {
    	List<Integer> nums = new ArrayList<Integer>();
    	if(numRows==1) {
    		rows.add(nums);
    		nums.add(1);
    		Collections.reverse(rows);
    		return rows;
    	}
    	else if(numRows==2) {
    		rows.add(nums);
    		nums.add(1);
    		nums.add(1);
    	}
    	else {
    		int index = 1;
    		rows.add(nums);
    		for(int i=1;i<=numRows;i++) {  			
    			nums.add(index);
    			index = index*(numRows-i)/i;
    		} 		
    	}
        return generate(numRows-1);
    }
    
    public static List<Integer> getRow(int rowIndex) {
	    ArrayList<Integer> current = new ArrayList<Integer>();
	    current.add(1);
	    if (rowIndex == 0) {
	        return current;
	    }
	    List<Integer> previous = getRow(rowIndex-1);
	    for (int i = 1; i < rowIndex; i++) {
	        int num = previous.get(i - 1)
	                   + previous.get(i);
	        current.add(num);
	    }
	    current.add(1);
	    return current;
    }
    
}
