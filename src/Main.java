public class Main {
    public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(20000.0);
    boolean chek = false;
    while (chek==false){
        try {
            account.withDraw(6000);
            System.out.println("успешно выводены , ваш оставщий счет" + account.getAmount());
        }catch (LimitException le ) {
            System.out.println(le.getMessage());
          account.withDraw(le.getRemainingAmount());
            System.out.println("было снято вся сумма , текущий счет: " + account.getAmount());
            chek=true;
        }
    }
    }
}