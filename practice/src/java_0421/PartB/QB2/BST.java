package java_0421.PartB.QB2;

public class BST {
    public class Node {
        Integer value;
        Node parent;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.parent = null;
            this.left = null;
            this.right = null;
        }
    }

	Node root;

    public BST() {
        root = null;
    }

	public Integer leastCommonAncestor(int x, int y) {
		// TODO: Implement this method
		Integer output = supportMethod(x, y, root);
		return output; // remove after implementation
	}

	private Integer supportMethod(int x, int y, Node node) {
        //generally speaking,leastCommonAncestor has itself,
        // but it don't include itself
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		if(min == node.value || max== node.value){
			return node.parent.value;
		}
		if(min > node.value){
			return supportMethod(x, y, node.right);
		}
		if(max< node.value){
			return supportMethod(x, y, node.left);
		}
		if(min < node.value && max > node.value){
			return node.value;
		}
		return null;
	}

	public Node find(int value) {
		Node current = root;
		while(current != null) {
			if(current.value.compareTo(value) < 0) {
				current = current.right;
			}else if (current.value.compareTo(value) > 0){
				current = current.left;
			}else if(current.value.compareTo(value) == 0) {
				return current;
			}
		}
		return null;
	}
	
	/**
	 * This implementation of insert follows the pseudo code in the lecture slide.
	 * Node that we did not use recursion here.
	 * 
	 * @param value value of inserted node
	 * @return inserted node (not the entire tree)
	 */
    public boolean insert(int value) {
        if (root==null){
            root = new BST.Node(value);  // no parent = root is empty
            return true;
        }
        BST.Node parent = null;
        BST.Node current = root;
        while (current != null) {
            if(current.value.compareTo(value) < 0) {
                parent = current;
                current = current.right;
            }else if (current.value.compareTo(value) > 0){
                parent = current;
                current = current.left;
            }else {
                return false;
            }
        }

        BST.Node newNode = new BST.Node(value);

        if(parent.value.compareTo(value) < 0) {
            parent.right = newNode;
            newNode.parent = parent;
        }else if(parent.value.compareTo(value) > 0) {
            parent.left = newNode;
            newNode.parent = parent;
        }
        return true;
    }
}