package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeckOfСards {

    public static void main(String[] args) {

        Cards card1 = new Cards("kresti", "6");
        Cards card2 = new Cards("kresti", "7");
        Cards card3 = new Cards("kresti", "8");
        Cards card4 = new Cards("kresti", "9");
        Cards card5 = new Cards("kresti", "10");
        Cards card6 = new Cards("kresti", "valet");
        Cards card7 = new Cards("kresti", "dama");
        Cards card8 = new Cards("kresti", "korol");
        Cards card9 = new Cards("kresti", "tus");
        Cards card10 = new Cards("bubi", "6");
        Cards card11 = new Cards("bubi", "7");
        Cards card12 = new Cards("bubi", "8");
        Cards card37 = new Cards("bubi", "8");
        Cards card13 = new Cards("bubi", "9");
        Cards card38 = new Cards("bubi", "9");
        Cards card14 = new Cards("bubi", "10");
        Cards card15 = new Cards("bubi", "valet");
        Cards card16 = new Cards("bubi", "dama");
        Cards card17 = new Cards("bubi", "korol");
        Cards card18 = new Cards("bubi", "tus");
        Cards card19 = new Cards("Piki", "6");
        Cards card20 = new Cards("Piki", "7");
        Cards card39 = new Cards("Piki", "7");
        Cards card21 = new Cards("Piki", "8");
        Cards card22 = new Cards("Piki", "9");
        Cards card23 = new Cards("Piki", "10");
        Cards card24 = new Cards("Piki", "valet");
        Cards card25 = new Cards("Piki", "dama");
        Cards card26 = new Cards("Piki", "korol");
        Cards card27 = new Cards("Piki", "tus");
        Cards card28 = new Cards("Chervi", "6");
        Cards card29 = new Cards("Chervi", "7");
        Cards card30 = new Cards("Chervi", "8");
        Cards card31 = new Cards("Chervi", "9");
        Cards card40 = new Cards("Chervi", "9");
        Cards card32 = new Cards("Chervi", "10");
        Cards card33 = new Cards("Chervi", "valet");
        Cards card34 = new Cards("Chervi", "dama");
        Cards card35 = new Cards("Chervi", "korol");
        Cards card36 = new Cards("Chervi", "tus");

        List<Cards> cardsList = new ArrayList<>();

        cardsList.add(card1);
        cardsList.add(card2);
        cardsList.add(card3);
        cardsList.add(card4);
        cardsList.add(card5);
        cardsList.add(card6);
        cardsList.add(card7);
        cardsList.add(card8);
        cardsList.add(card9);
        cardsList.add(card10);
        cardsList.add(card11);
        cardsList.add(card12);
        cardsList.add(card13);
        cardsList.add(card14);
        cardsList.add(card15);
        cardsList.add(card16);
        cardsList.add(card17);
        cardsList.add(card18);
        cardsList.add(card19);
        cardsList.add(card20);
        cardsList.add(card21);
        cardsList.add(card22);
        cardsList.add(card23);
        cardsList.add(card24);
        cardsList.add(card25);
        cardsList.add(card26);
        cardsList.add(card27);
        cardsList.add(card28);
        cardsList.add(card29);
        cardsList.add(card30);
        cardsList.add(card31);
        cardsList.add(card32);
        cardsList.add(card33);
        cardsList.add(card34);
        cardsList.add(card35);
        cardsList.add(card36);
        cardsList.add(card37);
        cardsList.add(card38);
        cardsList.add(card39);
        cardsList.add(card40);

        Set<Cards> cardsSet = new HashSet<>(cardsList);
        for (Cards cards :cardsSet) {
            System.out.println(cards);

        }

    }
}



