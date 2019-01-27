package picture;

public class square extends quadangle {

    public square() {
        System.out.println("construct square");
    }


    @Override
    public void draw() {
        System.out.println("this is square draw");
    }

    public static void main(String[] args) {
        triangle tri = new triangle();
        tri.draw();


        square squ = new square();
        quadangle quad = (quadangle) squ;
        squ.draw();


    }
}
