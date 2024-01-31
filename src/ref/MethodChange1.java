package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출전: a = " + a);
        changPrimitive(a);
        System.out.println("메서드 호출후: a = " + a);
    }

    static void changPrimitive(int x){
        x = 20;
    }
}
