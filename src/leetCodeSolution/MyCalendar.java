package leetCodeSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalendar obj = new MyCalendar();
		boolean param_1 = obj.book(37,50);
		System.out.println(param_1);
		System.out.println(date);
		param_1 = obj.book(33,50);
		System.out.println(param_1);
		System.out.println(date);
		param_1 = obj.book(4,17);
		System.out.println(param_1);
		System.out.println(date);
		param_1 = obj.book(37,48);
		System.out.println(param_1);
		System.out.println(date);
	}
	
    public MyCalendar() {
        
    }
    
    static List<Integer> date = new ArrayList<Integer>();
    
    public boolean book(int start, int end) {
    	if(date.size()==0) {
    		date.add(start);
    		date.add(end);
    		return true;
    	}
    	else if (date.get(date.size()-1)<=start) {
			date.add(start);
			date.add(end);
			return true;
		}
    	else {
    		int index = Collections.binarySearch(date, start);    		
    		if(index>=0) {
    			if(index==0) {
    				if(end>date.get(0)) {
    					return false;
    				}
    				else {
    					date.add(0,start);
    					date.add(1,end);
    					return true;    					
    				}
    			}
    			else if(index%2==0) {
    				return false;
    			}
    			else {
    				if(date.get(index+1)>=end) {
    					date.add(start);
    					date.add(end);
    					Collections.sort(date);
    					return true;
    				}
    				else {
    					return false;
    				}
    			}
    		}
    		else {
    			index += 1;
    			index = Math.abs(index);
    			if(index==0) {
    				if(end>date.get(0)) {
    					return false;
    				}
    				else {
    					date.add(0,start);
    					date.add(1,end);
    					return true;    					
    				}
    			}
    			else if(index%2==1) {
    				return false;
    			}
    			else {
    				if(date.get(index)>=end) {
    					date.add(start);
    					date.add(end);
    					Collections.sort(date);
    					return true;
    				}
    				else {
    					return false;
    				}
    			}
    			
    		}
    		
    	}
    }

}
