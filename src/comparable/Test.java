/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Mohammed El-Agha
 */
public class Test {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setSize(20.5);
        box1.setWeight(25);
        
        Box box2 = new Box();
        box2.setSize(22.5);
        box2.setWeight(30);
        
        System.out.println(box1.compareTo(box2));
        
        ArrayList<Box> list = new ArrayList();
        list.add(box1);
        list.add(box2);
        Collections.sort(list);
    }
}
