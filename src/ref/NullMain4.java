package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BingData bingData = new BingData();
        bingData.data = new Data();
        System.out.println("Bingdata.count =" + bingData.count);
        System.out.println("Bingdata.bingData =" + bingData.data);

        // NullPointException
        System.out.println("BingData.bingData.value" + bingData.data.value);

    }
}
