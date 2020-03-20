import java.util.Arrays;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    Arrays.sort(array);
		int arraySize = array.length;
		if(arraySize >= 3){
			return new int[] { array[arraySize - 3], array[arraySize - 2] ,array[arraySize -1]};
		}
		throw new IllegalArgumentException();
  }
}
