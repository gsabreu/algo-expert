class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    int[] aux = array;
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < aux.length; j++){
				if(array[i] + aux[j] == targetSum){
					return new int[] { array[i], aux[j] };
				}
			}
		}
    return new int[] {};
  }
}
