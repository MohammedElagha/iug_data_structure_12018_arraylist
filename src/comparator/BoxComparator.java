/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.util.Comparator;

/**
 *
 * @author Mohammed El-Agha
 */
public class BoxComparator implements Comparator<Box> {

    @Override
    public int compare(Box b1, Box b2) {
        return (int) (b1.getSize() - b2.getSize());
    }
    
}
