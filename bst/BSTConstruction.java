class BSTConstruction {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      return this.insert(this, value);
    }
		
		private BST insert(BST node, int value){
			if(node == null){
				node = new Program.BST(value);
			}
			else if(node.value > value){
				node.left = insert(node.left, value);
			}
			else {
				node.right = insert(node.right, value);
			}
			return node;
		}

    public boolean contains(int value) {
      return this.contains(this, value);
		}
		
		private boolean contains(BST node, int value){
				if(node == null) return false;
				if(node.value ==  value) return true;
				else if (node.value > value) {
					return contains(node.left, value);
				}
      	return contains(node.right, value);
			}

    public BST remove(int value) {
      return remove(this, value);
    }
		
		private BST remove(BST node, int value){
			if(node == null) return node;
			
			if(value < node.value){
				node.left = remove(node.left, value);
			} else if (value > node.value){
				node.right = remove(node.right, value);
			} else {
				
				if (node.left == null && node.value == value) return node.right;
				else if(node.right == null  && node.value == value) return node.left;
				
				node.value = this.inOrderSucessor(node.right);
				node.right = this.remove(node.right, node.value);
			}
			return node;
		}
		
		private int inOrderSucessor(BST node){
			int minimum = node.value;
			while(node.left != null){
				minimum = node.left.value;
				node = node.left;
			}
			return minimum;
		}
  }
