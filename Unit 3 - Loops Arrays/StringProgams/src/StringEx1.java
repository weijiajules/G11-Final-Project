
import hsa.Console;

public class StringEx1 {

    public static void main(String[] args) {
        Console c = new Console();
        String phrase;
        char letter;
        int vowels = 0;
        c.print("enter a sentence to count the vowels >");
        phrase = c.readLine();
        phrase = phrase.toLowerCase();//permetaly convert to lower case
        for (int i = 0; i < phrase.length(); i++) {
            letter = phrase.charAt(i); //eacheletter1 at atime
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            }
        }
        c.println("there are " + vowels + " vowles in the sentance");
        //String phrase = "the quick brown fox";
        // String b = phrase.replaceAll ("fox","dog");
        //c.println(b);
        //c.println (phrase);

        //String b = "";
        //for (int i = phrase.length()-1; i >= 0; i--) {
        // b += phrase.charAt(i);
    }

    //c.println(b);
//c.println(b.equals (phrase));
}

// b+="hi";
//b+="there";
//c.print(b);
// int wc =phrase.indexOf("c");
//c.println ("c is at " +wc);
//String s = phrase.substring(0, 9);
// c.println(s);
        //.println(s.toUpperCase()); // String up = s.toUpperCase();
