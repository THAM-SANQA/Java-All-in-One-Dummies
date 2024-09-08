
package book4.chap3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author thamsanqa 2024
 **/
public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        System.out.println(nums);
        System.out.println();
        
        String s;
        Iterator e = nums.iterator();
        while(e.hasNext()) {
        s = (String)e.next();
            System.out.println(s);
        }
        System.out.println();
        
        //UPDATING ELEMENTS
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        nums.set(3, "Quatro");
        System.out.println(nums);
        System.out.println();
    }
}
