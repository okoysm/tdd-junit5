package money;

public class Sum implements Expression {
    public Money augend; // 被加算量（足される数）
    public Money addend; // 加数（足す数）

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
