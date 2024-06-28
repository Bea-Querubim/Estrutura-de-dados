package testeArvores;

class Node {

    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;
    // Método para percurso em pré-ordem

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Método para percurso em in-ordem
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    // Método para percurso em pós-ordem
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Criando a árvore binária
        tree.root = new Node(1);
        tree.root.left = new Node(2); // esq 
        tree.root.right = new Node(3); //dir 
        tree.root.left.left = new Node(4); //esq.esq
        tree.root.left.right = new Node(5); //esq.dir
        tree.root.right.left = new Node(6); //dir.esq
        tree.root.right.right = new Node(7); //dir.dir

        System.out.println("Percurso em Pré-ordem:");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("Percurso em In-ordem:");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("Percurso em Pós-ordem:");
        tree.postOrder(tree.root);
    }
}
