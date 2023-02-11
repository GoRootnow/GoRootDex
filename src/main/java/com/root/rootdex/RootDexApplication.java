package com.root.rootdex;

import com.root.rootdex.Service.BinaryTree.Node;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RootDexApplication {

    public static void main(String[] args) {
        SpringApplication.run(RootDexApplication.class, args);

        // to do: Put this code on BinaryTree class
        /*
        Node node = new Node();
        List<Integer> valuelist=new ArrayList<Integer>();

        // Filling the List
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
        */
    }


}
