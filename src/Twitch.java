import java.util.*;
import java.util.Scanner;
public class Twitch {
    public static void main(String[] args) {
     Scanner userinput=new Scanner(System.in);
     System.out.println("Give your firstname and secondname of your channel: ");
     String firstname=userinput.nextLine();
     String lastname=userinput.nextLine();
     Twitch_creator_pass twitch_add=new Twitch_creator_pass(firstname,lastname);
    }
}
