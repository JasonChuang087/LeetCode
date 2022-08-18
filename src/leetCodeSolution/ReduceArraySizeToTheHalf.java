package leetCodeSolution;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ReduceArraySizeToTheHalf {

	public static void main(String[] args) {
		int arr[] = {3,3,3,3,5,5,5,2,2,7};
		minSetSize(arr);
	}
	
    public static int minSetSize(int[] arr) {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	// count number frequency
    	for(Integer i:arr) {
    		map.put(i, map.getOrDefault(i, 0) + 1);
    	}
    	
    	// sort map by value
		Map<Integer, Integer> result = map.entrySet().stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    	Set<Integer> set = new HashSet<Integer>();
    	int mid = arr.length/2;
        Iterator<Map.Entry<Integer,Integer>> iterator = result.entrySet().iterator();
        
        // add number to set while frequency <= mid 
        while (iterator.hasNext()) {
            Entry<Integer, Integer> entry = iterator.next();
            set.add(entry.getKey());
            mid = mid-entry.getValue();
            if(mid<=0) {
            	break;
            }        
        }
    	return set.size();
    }

}
