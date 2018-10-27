/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericarraylistwithcomparable;

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
        
        GenericArrayList<Box> list = new GenericArrayList();
        list.add(box1);
        list.add(box2);
        
        Box box3 = new Box();
        box3.setSize(22.5);
        box3.setWeight(301);
        
        System.out.println(list.contains(box3));
    }
}
