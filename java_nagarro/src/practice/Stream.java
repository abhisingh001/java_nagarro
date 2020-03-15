/**
 * @author Abhishek Singh
 * last update  11:51 PM 04/03/20
 **/
package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        //Starts coding
        List<Integer> number = Arrays.asList(2,3,4,5);
        number.stream().map(x -> x*x).collect(Collectors.toList()).forEach(y->System.out.println(y));

    }
}
