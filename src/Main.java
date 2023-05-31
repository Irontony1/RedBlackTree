public class Main {
    public static void main(String[] args) {
        RedBlackTree<Integer> node = new RedBlackTree<>();

        node.insert(0);
        node.inorder();
        System.out.println("\n");
        node.insert(15);
        node.inorder();
        System.out.println("\n");
        node.insert(23);
        node.inorder();
        System.out.println("\n");
        node.insert(16);
        node.inorder();
        System.out.println("\n");
        node.insert(88);
        node.inorder();
        System.out.println("\n");
        node.insert(-8);
        node.inorder();
        System.out.println("\n");
        node.insert(-16);
        node.inorder();
        System.out.println("\n");
        node.insert(-36);
        node.inorder();


    }
}
