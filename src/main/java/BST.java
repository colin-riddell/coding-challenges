
public class BST<T extends Comparable<T>> {

    private Node<T> root;

    private Node<T> addRecursive(Node<T> current, T value){
        if (current == null){
            return new Node<T>(value);
        }
        if (value.compareTo(current.getValue()) < 0) {
            current.setLeft(addRecursive(current.getLeft(), value));
        }
        else if(value.compareTo(current.getValue()) > 0) {
            current.setRight(addRecursive(current.getRight(), value));
        }
        else {
            return current;
        }
        return current;
    }

    public void add(T value) {
        root = addRecursive(root, value);
    }

    public void traverseInOrder(Node<T> node){
        if (node != null){
            traverseInOrder(node.getLeft());
            System.out.println(" " + node.getValue());
            traverseInOrder(node.getRight());
        }
    }

    private Node<T> findNodeRecursive(Node<T> current, T value){
        T currentValue = current.getValue();

        int compResult = value.compareTo(current.getValue());

        if (compResult < 0){
            return findNodeRecursive(current.getLeft(), value);
        } else if (compResult >0) {
            return findNodeRecursive(current.getRight(), value);
        }
        return current;
    }

    public Node<T> findNode(T value){
        return findNodeRecursive(root, value);
    }

    public Node<T> getRoot() {
        return root;
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(" " + node.getValue());
        }
    }
}
