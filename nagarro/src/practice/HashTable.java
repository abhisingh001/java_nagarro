/**
 * @author Abhishek Singh
 * last update  11:36 PM 04/03/20
 **/
package practice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable {

    public static void main(String[] args) {
        //Starts coding
        Hashtable<Character,Integer> h=new Hashtable<>();
        String s="abcdeabcdjdhdh";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else {
                h.put(c,1);
            }

        }
        Set ss=h.entrySet();
        Iterator it=ss.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
