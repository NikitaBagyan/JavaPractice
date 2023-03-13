package Exception;

public class Money {
    long amount;


    public Money(long amount) {
        this.amount = amount;
    }

    public long pay(long amount){

        if(this.amount>= amount){
           this.amount -= amount;
        }else
            throw new NotEnoughtMoneyException(this.amount,amount);
        return this.amount;
    }
}
