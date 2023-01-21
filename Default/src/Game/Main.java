package Game;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard(100,10,"Elf","Stick",150,"Water");
        System.out.println(wizard.getFullInfo());
        wizard.levelUp();
        System.out.println(wizard.getFullInfo());

    }
}
