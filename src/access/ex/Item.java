package access.ex;

public class Item {
    private String naem;
    private int price;
    private int quantity;

    public Item(String naem, int price, int quantity) {
        this.naem = naem;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNaem(){
        return naem;
    }

    // ShoppingCart 클래스에서 직접 계산 할수 있게 할수 있다 getPrice 와 getQuantity 를 사용한다면
    // 그러나 본인 데이터는 본인이 수정 하는 것이 가장 좋다
    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public int gettotalPrice(){
        return price * quantity;
    }
}
