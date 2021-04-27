package Day06.demo;

import java.util.HashMap;
import java.util.Map;

public class Demo9 {
    public static void main(String[] args) {
        Map<String, Object> students = new HashMap<String, Object>();
        students.put("id", "st01");
        students.put("name", "Kevin");
        students.put("age", 20);
        students.put("status", true);

        for (String key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }
    }
}
