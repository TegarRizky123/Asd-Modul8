/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

public class theApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        Node siNode;
        
        siNode = new Node('D');
        tree.insert(siNode);
        
        siNode = new Node('B');
        tree.insert(siNode);
        
        siNode = new Node('A');
        tree.insert(siNode);
        
        siNode = new Node('C');
        tree.insert(siNode);
        
        siNode = new Node('F');
        tree.insert(siNode);
        
        siNode = new Node('E');
        tree.insert(siNode);
        
        siNode = new Node('G');
        tree.insert(siNode);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }
}

