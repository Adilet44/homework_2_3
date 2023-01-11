public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("ваш счет пополнен , ваш настоящий счет" + getAmount());
    }

    public void withDraw(double sum) throws LimitException {
        if ((amount - sum) < 0) {
            throw new LimitException("у вас не достаточно средств" + getAmount(), getAmount());
        }
        amount -= sum;
    }
}
