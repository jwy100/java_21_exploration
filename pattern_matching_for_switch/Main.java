public class Main {


    public sealed interface Card permits Suit {

    }

    public enum Suit implements Card {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    public static void main(String[] args) {

        declareSuit(Suit.DIAMONDS);

    }



    public static void declareSuitExhaustive(Card o) {
        switch (o) {
            case Suit.HEARTS -> System.out.println("It's Hearts!");
            case Suit.SPADES -> System.out.println("It's Spades!");
            case Suit.CLUBS -> System.out.println("It's Clubs!");
            case Suit.DIAMONDS -> System.out.println("It's Diamonds!");
        }
    }

    // Hmm, exhaustive switch is not enforced for all Suits
    public static void declareSuit(Suit o) {
        switch (o) {
            case Suit.HEARTS -> System.out.println("It's Hearts!");
            case Suit.SPADES -> System.out.println("It's Spades!");
            case Suit.CLUBS -> System.out.println("It's Clubs!");
        }
    }

    public static void colonStyleSwitch(Object o) {
        switch (o) {
            case null ->  System.out.println("It's null!");
            case Integer i -> System.out.println("It's an integer!");
            case String s -> System.out.println("It's a string!");
            case Suit.HEARTS -> System.out.println("It's Hearts!");
            case Suit.SPADES -> System.out.println("It's Spades!");
            case Suit.CLUBS -> System.out.println("It's Clubs!");
            case Suit.DIAMONDS -> System.out.println("It's Diamonds!");

            default -> System.out.println("Hmm ... Not sure what that is ...");
        }
    }

//    Case refinement example using "when"
    public static void stringTest(String text) {
        switch (text) {
            case null -> {}
            case String s when s.equalsIgnoreCase("YES") -> {
                System.out.println("Awesome!");
            }
            case String s when s.equalsIgnoreCase("NO") -> {
                System.out.println("Shame :(");
            }
            case String s -> {
                System.out.println("Sorry, didn't catch that");
            }
        }
    }
}