package Day06.demo;

import java.util.HashSet;
import java.util.Set;

public class Demo8 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>(); //Collection Set ko quan ly vi tri index
        names.add("Name 2");
        names.add("Name 3");
        names.add("Name 4");
        names.add("Name 1");
        for(String name : names){
            System.out.println(name);
        }
    }
}
