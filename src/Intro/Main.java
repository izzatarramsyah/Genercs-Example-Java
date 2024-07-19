package Intro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
        public static void main(String[] args) {

        List object = new ArrayList(); // initilize list object without data type
        object.add("Circle"); // add object
        System.out.println(object.get(0)); // get first element
        //String circle = object.get(0); // should return error casting
        String circle = (String) object.get(0); // casting

    }
    
}
