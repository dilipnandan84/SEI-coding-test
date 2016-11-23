package com.dns.sei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DeDup {

    
    /**
	 * Remove Duplicates with 'Arrays'.
	 * @return Integer[]
	 */
    public Integer[] removeDuplicates(Integer[] inputArr) {
    	long start = System.nanoTime();
        int count = 0;
        Integer[] interimArray = new Integer[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            boolean exists = false;
            for (int j = 0; j < interimArray.length; j++) {
                if (interimArray[j]!=null && interimArray[j] == inputArr[i]) {
                    exists = true;
                }
            }
            if (!exists) {
                interimArray[count] = inputArr[i];
                count++;
            }
        }
        final Integer[] finalArray = new Integer[count];
        System.arraycopy(interimArray, 0, finalArray, 0, count);
        long end = System.nanoTime();
        System.out.println("--Time Consumed removeDuplicates--"+(end-start));
        return finalArray;
    } 
    
    /**
   	 * Remove Duplicates with 'HashMap'.
   	 * @return Integer[]
   	 */
       public Integer[] removeDuplicatesHashMap(Integer[] inputArr) {
    	  long start = System.nanoTime();
    	  Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
           for (int i = 0; i < inputArr.length; i++) {
               if (!resultMap.containsKey(inputArr[i]))
                   resultMap.put(inputArr[i], inputArr[i]);
           }
           long end = System.nanoTime();
           System.out.println("--Time Consumed removeDuplicatesHashMap--"+(end-start));
           return (Integer[])resultMap.keySet().toArray(new Integer[resultMap.keySet().size()]);
       } 
       
       
    /**
   	 * Remove Duplicates with 'TreeSet'.
   	 * @return Integer[]
   	 */
       public Integer[] removeDuplicatesTreeSet(Integer[] inputArr) {
    	   long start = System.nanoTime();
    	   Set<Integer> resultSet = new TreeSet<Integer>();
           resultSet.addAll(Arrays.asList(inputArr));
           long end = System.nanoTime();
           System.out.println("--Time Consumed removeDuplicatesHashSet--"+(end-start));
           return (Integer[])resultSet.toArray(new Integer[resultSet.size()]);
       } 
    
    
}

