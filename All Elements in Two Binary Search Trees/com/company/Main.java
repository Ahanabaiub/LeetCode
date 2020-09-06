package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    Node root1,root2;
    public static void main(String[] args) {

       Main ob=new Main();

       ob.generatetree();

    }

    void generatetree()
    {
        int[] ar={1,2,3,4,5,6,7,8,9,10,11};
        Arrays.sort(ar);

        root1=constractTree(ar,0,ar.length-1);

        int[] ar2={40,30,45,75,62,88,96,41};
        root2=constractTree(ar2,0,ar2.length-1);

        System.out.println(new solution().getAllElements(root1,root2));

    }

    Node constractTree(int[] ar,int start, int end)
    {
        if(start>end)
            return null;

        int mid=(start+end)/2;
        Node node=new Node(ar[mid]);

        node.left=constractTree(ar,start,mid-1);
        node.right=constractTree(ar,mid+1,end);

        return node;
    }

}


class Node
{
    int value;
    Node left;
    Node right;

    Node(int value)
    {
        this.value=value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


}

class solution
{

    List<Integer> elements=new ArrayList<>();

    public List<Integer> getAllElements(Node root1, Node root2) {


        travarseTrees(root1);
        travarseTrees(root2);

        Collections.sort(elements);
        return elements;

    }

    void travarseTrees(Node node)
    {
        if(node==null)
        {
            return;
        }

        travarseTrees(node.left);

        elements.add(node.value);

        travarseTrees(node.right);

    }

}


