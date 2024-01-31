package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출전: dataA.vlaue = " + dataA.value);
        System.out.println("dataA="+dataA);
        changReference(dataA);
        System.out.println("메서드 호출후: dataA.vlaue = " + dataA.value);
    }

    static void changReference(Data dataX){
        System.out.println("dataX="+ dataX);
        dataX.value = 20;
    }
}
