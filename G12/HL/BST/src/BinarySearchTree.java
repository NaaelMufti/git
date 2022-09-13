public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree(String data) // could do with (Node root) or (String data)
    {
        Node root = new Node(data);
        this.root = root;
    }

    public BinarySearchTree(Node root) // passing the whole Node instead
    {
        this.root = root;
    }

    //public BinarySearchTree() {} // we don't want empty BST
    // bc don't want to check for empty BST

    public Node getRoot()
    {
        return root;
    }

    public void setRoot(Node root)
    {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void add(String data, Node root) // recursive method
    {
        Node newNode = new Node(data);
        if (root.getLeft() != null && data.compareToIgnoreCase(root.getData()) < 0)
        {
            add(data, root.getLeft());
        } else
        {
            System.out.println("--> Inserted" + data);
        }
    }
    public void inOrder(Node root) // have go give root in order to traverse
    {
        if(root.getLeft() != null) // if something to left, go left
        {
            inOrder(root.getLeft());
        }
        System.out.print(root + " "); // because have toString we can print Node // // visit //
        if(root.getRight() != null)
        {
            inOrder(root.getRight());
        }

    }
}
