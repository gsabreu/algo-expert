import java.util.Arrays;
class Program {
  public static int binarySearch(int[] array, int target) {
		Arrays.sort(array);
		return findPosition(array, target, 0, array.length -1);
  }
	
	public static int findPosition(int[] array, int target, int left, int right){
		while(left <= right){
			int mid = (left +right) /2;
			int potencialMatch = array[mid];
			if(potencialMatch == target){
				return mid;
			} else if(target < potencialMatch){
				right = mid - 1;
			} else{
				left = mid +1;
			}
		}
		return - 1;
	}
}
