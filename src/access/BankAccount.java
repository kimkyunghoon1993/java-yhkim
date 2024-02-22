package access;

public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit (입금)
    public void deposti(int amount){
        if (isAmoutValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액 입니다.");
        }

    }

    // public 메서드: withdraw (출금)
    public void withdraw(int amount){
        if(isAmoutValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: getBalance (잔액 확인)
    public int getBalance(){
        return  balance;
    }

    private boolean isAmoutValid(int amount){
        // 금액이 0 보다 켜야함
        return amount > 0;
    }

}
