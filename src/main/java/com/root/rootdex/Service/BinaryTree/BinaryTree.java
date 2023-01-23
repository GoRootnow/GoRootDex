package com.root.rootdex.Service.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BinaryTree {

    Node Root;
    public BinaryTree (){}

    void init(){
        Node node = new Node();
        List<Integer> valuelist=new ArrayList<Integer>();

        // Filling the List
        for(int i = 0; i < 10 ; i++){
            valuelist.add(ThreadLocalRandom.current().nextInt(1, 10 + 1));
        }
    }

}
