package extends1.ex;

public class Album extends Item{

    public String artis;

    public Album(String name, int price, String artis) {
        super(name, price);
        this.artis = artis;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artis);
    }
}
