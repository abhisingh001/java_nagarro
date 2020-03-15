/**
 * @author Abhishek Singh
 * last update  3:38 PM 29/02/20
 **/
/*BinaryTreeTo2WayLinkedList*/
package tree;

public class BTo2WLL {
    public static Lnode head=null;
    public static Lnode lastNode=head;

    public static class Node{
        int data;
        Node lChild=null;
        Node rChild=null;
        Node(int key)
        {
            this.data=key;
        }
    }
    public static class Lnode{
        int data;
        Lnode forward=null;
        Lnode backward=null;
        Lnode(int data){
            this.data=data;
        }
    }
    public static void addNode(int key){
        if(head==null){
            Lnode temp=new Lnode(key);
            head=temp;
            lastNode=head;
            return;
        }
        else {
            addL(lastNode,key);
            lastNode=lastNode.forward;
        }

    }
    public static void addL(Lnode l,int key){
        Lnode temp=new Lnode(key);
        l.forward=temp;
        temp.backward=l;

    }
    public static void conversionBtoL(Node root){
        if(root==null){
            return;
        }
        conversionBtoL(root.lChild);
        addNode(root.data);
        conversionBtoL(root.rChild);

    }

    public static void main(String[] args) {
        //Starts coding
        Node root=new Node(100);
        root.lChild=new Node(90);
        root.rChild=new Node(80);
        root.lChild.lChild=new Node(70);
        root.lChild.rChild=new Node(60);
        root.rChild.lChild=new Node(50);
        root.rChild.rChild=new Node(40);
        root.rChild.lChild.lChild=new Node(30);
        root.rChild.lChild.rChild=new Node(20);
        root.rChild.rChild.lChild=new Node(10);
        root.rChild.rChild.rChild=new Node(0);


        conversionBtoL(root);

        Lnode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.forward;
        }





    }
}
