import java.util.Scanner;
public class Twitch_creator_pass {
    private String firstname_channel;
    private String lastname_channel;
    private String creator_password;
    private String creator_theme;
    private int lengthofpassword=12;
    private String twitch_extension="twitch.tv";

   // constructor for channel name
    public Twitch_creator_pass(String firstname_channel,String lastname_channel)
    {
        this.firstname_channel=firstname_channel;
        this.lastname_channel=lastname_channel;
        this.twitch_extension=twitch_extension;
        System.out.println("Twitch channel name: "+this.firstname_channel+this.lastname_channel+this.twitch_extension);
        this.creator_theme=setcreator_theme();
        System.out.println("Creator theme: "+this.creator_theme);
        this.creator_password=password_for_pass(lengthofpassword);
        System.out.println("your password for twitch creator pass:"+this.creator_password);
    }
   // Theme for the twitch creator
    private String setcreator_theme()
    {
        System.out.println("Enter the Desirable theme for twitch pass \n select 1 === Games\n select 2 === IRL\n select 3 === Music\n select 4 === Esports\n select 5 === Creative");
        Scanner input = new Scanner(System.in);
        int themeoption=input.nextInt();
        if (themeoption==1)
        {
            return "Games";
        }
        else if (themeoption==2)
        {
            return "IRL";
        }
        else if (themeoption==3)
        {
            return "Music";
        }
        else if (themeoption==4)
        {
            return "Esports";
        }
        else if (themeoption==5)
        {
            return "Creative";
        }
        else
        {
            return "Set the creator theme";
        }
    }
    private String password_for_pass(int lengthofpassword)
    {
      String passwordcontainer="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*_";
      char [] password =new char[lengthofpassword];
       for (int i=0;i<lengthofpassword;i++)
       {
           int rand=(int)(Math.random()*passwordcontainer.length());
           password[i]=passwordcontainer.charAt(rand);
       }
        return new String(password);
    }
}
