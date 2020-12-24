import java.util.List;

public class DagNode<T> {
    List<DagNode> successors;
    T value;

    public DagNode(List<DagNode> successors, T value) {
        this.successors = successors;
        this.value = value;
    }

    public DagNode() {
    }

    public void addSuccessor(DagNode successor){
        this.successors.add(successor);
    }

    public List<DagNode> getSuccessors() {
        return successors;
    }

    public void setSuccessors(List<DagNode> successors) {
        this.successors = successors;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
