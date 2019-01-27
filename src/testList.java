import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testList {

    public static void main(String[] args) {
        List<String> testlist = new ArrayList<>();
        testlist.add("dingkai");
        testlist.add("is");
        testlist.add("a");
        testlist.add("good");
        testlist.add("boy");

        System.out.println(testlist);
        System.out.println("====");
        for (int i = 0; i < testlist.size(); i++) {
            System.out.println(testlist.get(i));
        }
        System.out.println("====");
        Iterator<String> it = testlist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


}
