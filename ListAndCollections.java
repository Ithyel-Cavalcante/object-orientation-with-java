package com.mycompany.list.and.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ListAndCollections {

    public static void main(String[] args) {
        ArrayList<Integer> batatas = new ArrayList();

        batatas.add(50);
        batatas.add(45);
        batatas.add(5);
        batatas.add(14);
        batatas.add(17);
        batatas.add(37);

        Collections.sort(batatas, Collections.reverseOrder());

        for (Integer batata : batatas) {
            System.out.println(batata);
            
        }

    }
}
