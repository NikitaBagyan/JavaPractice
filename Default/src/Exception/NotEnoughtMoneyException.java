package Exception;

public class NotEnoughtMoneyException extends Error{
    public NotEnoughtMoneyException(long got, long expected){
        System.out.println("not enought money got,"+ got + "expected" + expected);

    }
}
