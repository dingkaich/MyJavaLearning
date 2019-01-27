import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testMap {

    public static void main(String[] args) {

        Map<String, Integer> testmap = new HashMap();
        testmap.put("1", 1);
        testmap.put("2", 2);
        testmap.put("3", 3);
        testmap.put("4", 4);

//        Set<String, Integer> a = testmap.entrySet()
////        Iterator<String, Integer> it = testmap.forEach();
//        for (int i = 0; i < testmap.size(); i++) {
//            testmap.entrySet()
//        }

        Set<String> keyset = testmap.keySet();
        Iterator<String> iter = keyset.iterator();
        while (iter.hasNext()) {

            String key = (String) iter.next();
            Integer value = testmap.get(key);
            System.out.println(key + ":" + value);

        }


    }


}
