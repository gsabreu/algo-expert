import java.util.Arrays;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		int[] closestNumbers = new int[2];
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int auxArrayOne = 0;
		int auxArrayTwo = 0;
		
		while(auxArrayOne < arrayOne.length && auxArrayTwo < arrayTwo.length){
			int first = arrayOne[auxArrayOne];
			int two = arrayTwo[auxArrayTwo];
			if(first < two) {
				current = two - first;
				auxArrayOne++;
			} else if (two < first){
				current = first - two;
				auxArrayTwo++;
			} else {
				return new int[] { first , two };
			}
			if (smallest > current){
				smallest = current;
				closestNumbers = new int[] {first , two};
			}
		}
		
    return closestNumbers;
  }
	
}
