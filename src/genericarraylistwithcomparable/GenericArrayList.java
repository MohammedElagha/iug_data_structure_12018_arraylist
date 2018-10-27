/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericarraylistwithcomparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Mohammed El-Agha
 */
public class GenericArrayList<E> {

    private int size = 0;
    private Object[] elements;
    
    public GenericArrayList(){
        elements = new Object[1];
    }
    
    public void add(E object) {
        if(size == 0) {
            elements[0] = object;
            size = size + 1;
        } else {
            size = size + 1;
            elements = Arrays.copyOf(elements, size);
            elements[size - 1] = object;
        }
    }
    
    public E get(int index) {
        return (E) elements[index];
    }
    
    public void remove(int index){
        int j = index + 1;
        
        for(int i = index ; j < size ; i++) {
            elements[i] = elements[j];
            j = j + 1;
        }
        
        size = size - 1;
        elements = Arrays.copyOf(elements, size);
    }
    
    public int size() {
        return size;
    }
    
    public boolean contains(E object) {
        if(object instanceof Comparable) {
            for(int i = 0 ; i < size ; i++) {
                if(((Comparable) object).compareTo(elements[i]) == 0) {
                    return true;
                }
            }
        } else {
            for(int i = 0 ; i < size ; i++) {
                if(elements[i].equals(object)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        GenericArrayList<String> list = new GenericArrayList();
        
        list.add("string 1");
        list.add("string 2");
        list.add("string 3");
        list.remove(2);
        
        System.out.println(list.size());
    }
    
}
