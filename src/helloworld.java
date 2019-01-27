import picture.square;

public class helloworld {

    public helloworld() {
        s1 = "helloworld";
        System.out.println("go to 构造函数");
    }

    public helloworld(String name) {
        // 这个构造器仅有一个参数：name
        s1 = name;
    }

    int avg(int number, int number1) throws Exception {

        if (number < 0 | number1 < 0) {
            throw new Exception("数值太小了");
        }

        if (number > 100 | number1 > 100) {
            throw new Exception("数值太大了");
        }

        return (number + number1) / 2;
    }

    void testpicture() {
        square sa = new square();
    }


    static String s1;

    public static void main(String[] args) {
        String s2 = "java";
        System.out.println(s1);
        System.out.println(s2);


        if (s1 != s2) {
            System.out.println("false");
            System.out.println(s2.length());
        }

        System.out.println("hello world");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好1");

            case 'C':
                System.out.println("良好2");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);

        helloworld a = new helloworld();

        try {

            int age = Integer.parseInt("20L");
            System.out.println(age);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            helloworld hw = new helloworld();
            hw.testpicture();
            int result = hw.avg(111, 2);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("the end");
    }
}






