public class testThread extends Thread {

    void test1() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(500);

                } catch (Exception e) {
                    e.printStackTrace();
                }


                System.out.println("test1 start");
                int count = 21;

                while (true) {

                    System.out.println(count + "");
                    if (--count == 10) {
                        break;
                    }
                }

                System.out.println("test2 end ");

            }
        }

        );
        t.start();


    }

    int count = 10;

    @Override
    public void run() {
//        test1();
        System.out.println("run start");

        while (true) {

            System.out.println(count + "");
            if (--count == 0) {
                break;
            }
        }
        System.out.println("run end ");

    }

    public static void main(String[] args) {
        new testThread().start();
        new testThread().start();
        new testThread().start();
        new testThread().start();
        new testThread().start();
    }

}
