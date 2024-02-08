package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BingData bingData = new BingData();
        System.out.println("Bingdata.count =" + bingData.count);
        System.out.println("Bingdata.bingData =" + bingData.data);

        // NullPointException
        System.out.println("BingData.bingData.value" + bingData.data.value);

    }
}
