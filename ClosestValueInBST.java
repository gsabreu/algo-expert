class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    	return findClosestValueinBst(tree, target, Double.MAX_VALUE);
	}

	public static int findClosestValueinBst(BST tree, int target, double closest) {
		BST bstAux = tree;
		while (bstAux != null) {
			if (Math.abs(target - closest) > Math.abs(target - bstAux.value)) {
				closest = bstAux.value;
			}
			if (target < bstAux.value) {
				bstAux = bstAux.left;
			} else if (target > bstAux.value) {
				bstAux = bstAux.right;
			} else {
				break;
			}
		}
		return (int) closest;
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
