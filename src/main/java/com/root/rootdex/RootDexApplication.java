package com.root.rootdex;

import com.root.rootdex.Service.BinaryTree.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RootDexApplication {

    public static void main(String[] args) {
        //SpringApplication.run(RootDexApplication.class, args);



        valuelist.add(6);
        valuelist.add(5);
        valuelist.add(4);
        valuelist.add(7);

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
