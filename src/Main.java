public class Main {
    public static void main(String[] args) {
        Poinds2D poinds2D = new Poinds2D();
        poinds2D.getXY();
        System.out.println(poinds2D.toString());
        poinds2D.setX(1.1f);
        poinds2D.getXY();
        System.out.println(poinds2D.toString());

    }
}
