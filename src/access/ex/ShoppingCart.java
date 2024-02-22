package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        // 검증 로직
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다");
        }

        // 실행 로직

        // items[itemCount++] = item;

        items[itemCount] = item;
        itemCount++;

    }

    public void displayitems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명:" + item.getNaem() + ", 합계:" + item.gettotalPrice());
//            System.out.println("상품명: " + item.getNaem() + "합계:" + item.getPrice() * item.getQuantity());
        }
        System.out.println("전체 가격 합:" + calculatetotalPrict());

    }

    private int calculatetotalPrict(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.gettotalPrice();
        }
        return totalPrice;
    }

}
