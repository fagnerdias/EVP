package mergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

  public static Random rand = new Random();

  /**
   * requires: - 'array' is not null
   * ensures:  - returns a permutation of 'array' such that for each index 'i'
   *             and index 'j', if 'i' < 'j', 'array[i]' <= 'array[j]'.
   *           - 'array' is unchanged.
   **/
  public static int[] sort(int[] array) {
    return sort(array, 0, array.length - 1);
  }

  public static int[] sort(int[] array, int from, int to) {
    if (from >= to) {
      return new int[] { array[from] };
    }

    int m = (from + to) / 2;
    int[] left = sort(array, from, m);
    int[] right = sort(array, m + 1, to);

    int[] result = new int[left.length + right.length];
    int li = 0;
    int ri = 0;
    for (int i = 0; i < result.length; i++) {
      if (li < left.length
          && (ri >= right.length || left[li] < right[ri])) {
        result[i] = left[li];
        li++;
      } else {
        result[i] = right[ri];
        ri++;
      }
    }

    return result;
  }

  public static boolean isSorted(int[] array) {
    for(int i = 1; i< array.length; i++) {
    	if(array[i] < array[i-1]) {
    		return false;
    	}
    }
    return true;
  }

  public static boolean isPermutation(int[] arrayA, int[] arrayB) {
    if(arrayA.length != arrayB.length)
    	return false;
    for(int i = 0; i < arrayA.length; i++) {
    	for(int j = 0; j< arrayB.length; j++) {
    		if(arrayA[i] == arrayB[j]){
    			break;
    		}
    		if(j == arrayB.length-1) {
    			return false;
    		}
    	}
    }
    return true;
  }

  public static int[] generate(int length) {
	  int[] arrayAleatorio = new int[length];
	    for(int i = 0; i < length; i++) {
	    	arrayAleatorio[i] = rand.nextInt(100);
	    }
	    return arrayAleatorio;
  }

  public static boolean test(int[] array) {
    try {
      int[] arrayA = sort(array);
      return isSorted(arrayA) && isPermutation(arrayA, array);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public static void main(String[] arg) {
    for (int i = 0; i < 1000; i++) {
      int[] array = generate(rand.nextInt(30) + 1);
      if (!test(array)) {
        System.out.println("Array: " + Arrays.toString(array));
        System.exit(0);
      }
    }
    System.out.println("Done.");
  }

}
