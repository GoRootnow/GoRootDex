package com.root.rootdex.Service.BinaryTree;


import java.util.LinkedList;

public class Node {

    private Integer value = null;

    private Node nodeLeft;

    private Node nodeRight;

    public Node(){}

    public void addValue(Integer newValue){


        if(this.value == null){
            nodeRight = new Node();
            nodeLeft = new Node();
            this.value = newValue;
        }
        else if(this.value <= newValue && this.nodeRight.value == null){
            nodeRight.addValue(newValue);
        }
        else{
            nodeLeft.addValue(newValue);
        }
    }

    public Integer getValue() {
        return value;
    }

    public Node getNodeRight() {
        return this.nodeRight;
    }

    public Node getNodeLeft() {
        return this.nodeLeft;
    }

    public void  setNodeRight(Node nodeRight) {
        this.nodeRight= nodeRight;
    }

    public void  setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }
    public Node invert(Node node) {
        if (node == null)
            return node;

        /* recursive calls */
        Node left = invert(node.getNodeLeft());
        Node right = invert(node.getNodeRight());

        /* swap the left and right pointers */
        Node burbuja =left;
        node.setNodeLeft(right);
        node.setNodeRight(burbuja);
        return node;
    }

    public static void printBinaryTree(Node root)
    {
        LinkedList<Node> treeLevel = new LinkedList<Node>();
        treeLevel.add(root);
        LinkedList<Node> temp = new LinkedList<Node>();
        int counter = 0;
        int height = heightOfTree(root) - 1;
        // System.out.println(height);
        double numberOfElements
                = (Math.pow(2, (height + 1)) - 1);
        // System.out.println(numberOfElements);
        while (counter <= height) {
            Node removed = treeLevel.removeFirst();
            if (temp.isEmpty()) {
                printSpace(numberOfElements
                                / Math.pow(2, counter + 1),
                        removed, counter);
            }
            else {
                printSpace(numberOfElements
                                / Math.pow(2, counter),
                        removed, counter);
            }
            if (removed == null) {
                temp.add(null);
                temp.add(null);
            }
            else {
                temp.add(removed.getNodeLeft());
                temp.add(removed.getNodeRight());
            }

            if (treeLevel.isEmpty()) {
                System.out.println("");
                System.out.println("");
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }
        }
    }

    public static void printSpace(double n, Node removed, int counter)
    {
        for (; n > 0; n--) {
            System.out.print("\t");
        }
        if (removed == null) {
            System.out.print(" ");
        }
        else {
            System.out.print("["+counter+"]"+ removed.getValue());
        }
    }

    public static int heightOfTree(Node root)
    {
        if (root == null) {
            return 0;
        }
        return 1
                + Math.max(heightOfTree(root.getNodeLeft()),
                heightOfTree(root.getNodeRight()));
    }
}


