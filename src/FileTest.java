import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

    public static void main(String[] args) {

        File f = new File("Filetest.txt");
        if (f.exists()) {
            if (f.delete()) {
                System.out.println("delete success");
            } else {
                System.out.println("delete failedr");
            }

        }

        try {
            f.createNewFile();
            System.out.println("file create success");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fo = new FileOutputStream(f);
            byte buf[] = "dingkai is a good boy!!".getBytes();
            fo.write(buf);
            fo.close();
            System.out.println("file write okay");
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fi = new FileInputStream(f);
            byte[] buf = fi.readAllBytes();
//            String str = buf.toString();
            String str = new String(buf);
            System.out.println(str);
            System.out.println("file read okay");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("FileTest end ");

    }


}
