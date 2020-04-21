package java_0421.PartB.QB1;

public class BST {
    public class Node {
        Integer value;
        Node parent;
        Node left;
        Node right;

        public Node(Integer value) {
            this.value = value;
            this.parent = null;
            this.left = null;
            this.right = null;
        }
    }

	Node root;

	public Integer oddNodeSum() {
		//TODO: Implement this function
		Integer output = supportMethod(root);
		return output;
	}

	private Integer supportMethod(Node root) {
	    // Except the sum of the leaf node
		Integer sum = 0;
		if (root.left != null && root.right == null) {
			sum += root.value + supportMethod(root.left);
		} else if (root.left == null && root.right != null) {
			sum += root.value + supportMethod(root.right);
		} else if (root.left != null && root.right != null) {
			sum += supportMethod(root.left) + supportMethod(root.right);
		} else {
			sum += 0;
		}
		return sum;
	}

	public BST() {
		root = null;
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
            root = new Node(value);  // no parent = root is empty
            return true;
        }
		Node parent = null;
		Node current = root;
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

        Node newNode = new Node(value);

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