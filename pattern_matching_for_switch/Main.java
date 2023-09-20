public class Main {

    public static void main(String[] args) {

        stringTest(args[0]);

    }




    public static void declare(Object o) {
        switch (o) {
            case null ->  System.out.println("It's null!");
            case Integer i -> System.out.println("It's an integer!");
            case String s -> System.out.println("It's a string!");
            default -> System.out.println("Hmm ... Not sure what that is ...");
        }
    }

//    Case refinement example using "when"
    public static void stringTest(String text) {
        switch (text) {
            case null -> {}
            case String s
            when s.equalsIgnoreCase("YES") -> System.out.println("Awesome!");
            case String s
            when s.equalsIgnoreCase("NO") -> System.out.println("Shame :(");
            case String s -> System.out.println("Sorry, didn't catch that");
        }
    }
}