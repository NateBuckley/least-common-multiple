package com.revature;

public class MainDriver {

	public static void main(String[] args) {
		long[] test1 = {5, 4, 6, 46, 54, 12, 13, 17};
		long[] test2 = {46, 54, 466, 544};
		long[] test3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		long[] test4= {13, 6, 17, 18, 19, 20, 37};
		
		System.out.println(lcmOfArray(test1));
		System.out.println(lcmOfArray(test2));
		System.out.println(lcmOfArray(test3));
		System.out.println(lcmOfArray(test4));
	}
	
	private static long lcmOfArray(long[] array) {
		long lcm = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < array.length; i++) {
 
                if (array[i] == 0) {
                    return 0;
                }
                else if (array[i] < 0) {
                    array[i] = array[i] * (-1);
                }
                if (array[i] == 1) {
                    counter++;
                }
                
                if (array[i] % divisor == 0) {
                    divisible = true;
                    array[i] = array[i] / divisor;
                }
            }
            
            if (divisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
            
            if (counter == array.length) {
                return lcm;
            }
        }
	}
}
