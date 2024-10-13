package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int target=5;

        /*
         * by conventional way
         */
        for (int i =0; i <arr.length-1; i++) {
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(i +" and "+ j +" are the indices whose values sum to the target");
                }
            }
        }

        /*
         * by Optimized way
         */

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " and " + i + " are the indices whose values sum to the target");
            }

            // Store current element with its index
            map.put(arr[i], i);
        }

        /*
         * Output will be:
         * 1) 0 and 3
         * 2) 1 and 2
         */
    }
}