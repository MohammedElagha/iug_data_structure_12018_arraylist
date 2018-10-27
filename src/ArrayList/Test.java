/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Mohammed El-Agha
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        
        list.add("String");
        list.add("String 2");
        list.add("String 3");
        
        System.out.println(list.contains("String"));
        
        /////////////////
        
        ArrayList<Box> list2 = new ArrayList();
        
        Box box1 = new Box();
        box1.setSize(20.5);
        box1.setWeight(25);
        
        Box box2 = new Box();
        box2.setSize(22.5);
        box2.setWeight(30);
                
        Box box3 = new Box();
        box3.setSize(22.5);
        box3.setWeight(30);
        
        list2.add(box1);
        list2.add(box2);
        
        System.out.println(list.contains(box3));
    }
}
