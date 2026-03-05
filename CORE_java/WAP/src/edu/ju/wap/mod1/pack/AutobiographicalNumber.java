/**
 * 
 */
package edu.ju.wap.mod1.pack;

/**
 * 
 */
public class AutobiographicalNumber {
	  public boolean isAutobiographical(String number) {

	        int length = number.length();
	        int[] count = new int[length];

	        // Count frequency of digits
	        for (int i = 0; i < length; i++) {
	            int digit = number.charAt(i) - '0';

	            if (digit < length) {
	                count[digit]++;
	            }
	        }

	        // Compare positions
	        for (int i = 0; i < length; i++) {
	            int digit = number.charAt(i) - '0';

	            if (digit != count[i]) {
	                return false;
	            }
	        }

	        return true;
	    }
}
