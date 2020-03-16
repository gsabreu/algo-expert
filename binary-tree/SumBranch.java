class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> sumList = new ArrayList<Integer>();
		sumBranchValue(root, 0, sumList);
    return sumList;
  }
	
	public static void sumBranchValue(BinaryTree node, Integer runningSum, List<Integer> sumList){
		if (node == null) return;
		
		runningSum = runningSum + node.value;
		if (node.left == null && node.right == null){
			sumList.add(runningSum);
			return;
		}
		
		sumBranchValue(node.left, runningSum, sumList);
		sumBranchValue(node.right, runningSum, sumList);

	}
}
