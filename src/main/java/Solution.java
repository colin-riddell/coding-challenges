import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static String solution(long[] arr) {
        if (arr.length == 0){
            return "";
        }
        // create a new tree and performa levelInsert
        BST bst = new BST();
        bst.root = bst.levelInsert(arr, bst.root, 0);


        // get the total of the left and right
        long leftTotal = 0;
        long rightTotal = 0;

        if (bst.getRoot().getLeft() != null){
            leftTotal = bst.countRecursive(bst.getRoot().getLeft());
        }
        if (bst.getRoot().getRight() != null){
            rightTotal = bst.countRecursive(bst.getRoot().getRight());
        }

        if (leftTotal > rightTotal){
            return "Left";
        } else if (rightTotal > leftTotal){
            return "Right";
        } else {
            return "";
        }
    }

    static class Node {
        private Node left;
        private Node right;


        private long value;

        public Node(long value){
            this.value = value;
        }


        public Node getLeft(){
            return this.left;
        }

        public Node getRight(){
            return this.right;
        }

        public void setLeft(Node left){
            this.left = left;
        }

        public void setRight(Node right){
            this.right = right;
        }

        public Long getValue(){
            return this.value;
        }


    }

    static class BST {

        private Node root;

        public Node getRoot(){
            return this.root;
        }


        // Depth first add
        private Node addRecursive(Node current, Long value){
            if (current == null){
                return new Node(value);
            }
            if (value > current.getValue()) {
                current.setLeft(addRecursive(current.getLeft(), value));
            }
            else if (value < current.getValue()) {
                current.setRight(addRecursive(current.getRight(), value));
            }
            else {
                current.setRight(addRecursive(current.getRight(), value));
            }
            return current;
        }


        public void add(long value){
            this.root = addRecursive(root, value);
        }

        public void arrayAdd(long[] arr){
            for (long num : arr) {
                this.add(num);
            }
        }

        public long countRecursive(Node node){
            long result = node.getValue();

            if (node.getLeft()!= null){
                result += countRecursive(node.getLeft());
            }
            if (node.getRight() != null){
                result += countRecursive(node.getRight());
            }
            return result;

        }

        public Node levelInsert(long[] arr, Node root, int index){
            if (index < arr.length){
                root = new Node(arr[index]);

                root.setLeft(levelInsert(arr, root.getLeft(), 2 * index + 1));
                root.setRight(levelInsert(arr, root.getRight(), 2 * index + 2));

            }
            return root;
        }

    }
}

