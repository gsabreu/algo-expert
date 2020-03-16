import java.util.ArrayDeque;

class Program {
  public static void invertBinaryTree(BinaryTree tree) {
		ArrayDeque<BinaryTree> binaryQueue = new ArrayDeque<BinaryTree>();
		binaryQueue.addLast(tree);
		while (binaryQueue.size() > 0) {
			BinaryTree currentNode = binaryQueue.pollFirst();
			if (currentNode == null) {
				continue;
			}

			invertSide(currentNode);
			if (currentNode.left != null) {
				binaryQueue.addLast(currentNode.left);
			}

			if (currentNode.right != null) {
				binaryQueue.addLast(currentNode.right);
			}

		}
  }
	
	private static void invertSide(BinaryTree tree) {
		BinaryTree aux = tree.left;
		tree.left = tree.right;
		tree.right = aux;
	}

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
}
