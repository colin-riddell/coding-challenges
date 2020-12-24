public class Main {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        bst.add(6);
        bst.add(4);
        bst.add(8);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        bst.traverseInOrder(bst.getRoot());

        Node<Integer> found = bst.findNode(3);
        System.out.println(found.getValue());

        BST<Pirate> pirateBST = new BST<>();
        Pirate p1 = new Pirate("Colin", "Riddell");
        Pirate p2 = new Pirate("Steve", "Mieklejohn");
        Pirate p3 = new Pirate("Sky", "Su");
        pirateBST.add(p3);
        pirateBST.add(p1);
        pirateBST.add(p2);

        BST<User> userBST = new BST<User>();
        User user = new User("C", "Riddell", 1);
        User user1 = new User("james", "bond", 2);
        User user2 = new User("peter", "snow", 3);
        User user3 = new User("joanne", "Riddell", 4);
        User user4 = new User("gordon", "lowrie", 5);
        userBST.add(user);
        userBST.add(user4);
        userBST.add(user2);
        userBST.add(user1);
        userBST.add(user3);



        int count = recursiveAdd(0, 0);


    }

    static int recursiveAdd(int acc, int index){
        if (index < 10){
            int ans = acc + index;
            index++;
            return recursiveAdd(ans, index);
        }
        return acc;
    }
}
