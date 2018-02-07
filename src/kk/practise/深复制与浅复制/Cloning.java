package kk.practise.深复制与浅复制;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author kangkai on 2017/12/7.
 */
class Int {
    private int i;
    public Int(int ii) { i = ii; }
    public void increment() { i++; }
    public String toString() {
        return Integer.toString(i);
    }
}
public class Cloning {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 0; i < 10; i++ )
            v.addElement(new Int(i));
        System.out.println("v: " + v);
        Vector v2 = (Vector)v.clone();
// Increment all v2's elements:
        for(Enumeration e = v2.elements();
            e.hasMoreElements(); )
            ((Int)e.nextElement()).increment();
// See if it changed v's elements:
        System.out.println("v: " + v);
    }
}

