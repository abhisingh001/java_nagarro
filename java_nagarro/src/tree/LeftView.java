/**
 * @author Abhishek Singh
 * last update  2:45 PM 29/02/20
 **/
package tree;
import org.jetbrains.annotations.NotNull;

import java.util.*;
public class LeftView {
    public static class Node{
        int data;
        Node lChild=null;
        Node rChild=null;
        Node(int key)
        {
            this.data=key;
        }
    }
    public static void inoderPrint(Node root){
        if(root==null){
            return;
        }
        else{
            System.out.print(root.data+" ");
            inoderPrint(root.lChild);
            inoderPrint(root.rChild);
        }
    }
    public static void levelOrder(@NotNull Queue<Node> l){
        if(l.isEmpty()){return;}
        Queue<Node> l1=new LinkedList<Node>();
        while(!l.isEmpty()){
            Node temp=l.poll();
            System.out.print(temp.data+" ");
            if(temp.lChild!=null)
            {
                l1.add(temp.lChild);
            }
            if(temp.rChild!=null){
                l1.add(temp.rChild);
            }

        }
        levelOrder(l1);

    }
    public static void leftView(Queue<Node> l){
        if(l.isEmpty()){return;}
        Queue<Node> l1=new LinkedList<Node>();
        System.out.print(l.peek().data+" ");
        while(!l.isEmpty()){
            Node temp=l.poll();

            if(temp.lChild!=null)
            {
                l1.add(temp.lChild);
            }
            if(temp.rChild!=null){
                l1.add(temp.rChild);
            }

        }
        leftView(l1);

    }

    public static void main(String[] args) {
        //Starts coding
        //Scanner sc=new Scanner(System.in);
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
        /*inoderPrint(root);
        System.out.println();
        Queue<Node> l=new LinkedList<Node>();
        l.add(root);
        levelOrder(l);
        System.out.println();*/
        Queue<Node> l3=new LinkedList<Node>();
        l3.add(root);
        leftView(l3);


    }
}
