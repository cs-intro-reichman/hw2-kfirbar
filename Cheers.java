//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String text = args[0];
            int times = Integer.parseInt(args[1]);
            text = text.toUpperCase();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                String letters = "AEFHILMNORSX";

                // if (c is one of the characters in letters) {
                if (letters.indexOf(c) != -1) {
                        System.out.println("Give me an " + c + ": " + c + "!");
                } else {
                        System.out.println("Give me a " + c + ": " + c + "!");
                }
                
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < times; i++) {
                System.out.println(text + "!!!");
            }
        }
}
