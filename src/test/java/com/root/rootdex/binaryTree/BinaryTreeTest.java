package com.root.rootdex.binaryTree;

import com.root.rootdex.Service.BinaryTree.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {


    @Test
    public void binaryTest(){
        Node node = new Node();
        List<Integer> valuelist=new ArrayList<Integer>();

        // Filling the List
        //This should bee an
        // Add to Streams
        for(int i = 0; i < 5 ; i++){
            valuelist.add(ThreadLocalRandom.current().nextInt(1, 10 + 1));
        }

        // Filling the tree
        for(Integer value :valuelist){
            node.addValue(value);
        }
        System.out.println("Values in list are: ");
        for (Integer value : valuelist){
            System.out.print( value + " ");
        }

        node.printBinaryTree(node);
        node = node.invert(node);
        System.out.println( "Inverted Tree");
        node.printBinaryTree(node);
    }
}
