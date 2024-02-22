package poly.diamond;

public class DiamonMain {
    public static void main(String[] args) {
        InterFaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterFaceB b = new Child();
        b.methodB();
        b.methodCommon();

    }
}
