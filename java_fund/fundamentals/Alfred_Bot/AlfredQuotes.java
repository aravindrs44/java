import java.util.Date ;

public class AlfredQuotes {
  public String basicGreeting()  {
    return "Hello, lovely to see you. How are you?";
  }

  public String guestGreeting(String name, String dayPeriod)  {
    return "Good " + dayPeriod + ", Master " + name;
  }

  public String dateAnnouncement()  {
    Date date = new Date();
    return "The current time is " + date;
  }

  public String respondBeforeAlexis(String conversation)  {
    if(conversation.contains("Alexis") == true)  {
      return "Who is this Alexis you speak of?";
    }  else if(conversation.contains("Alfred") == true) {
      return "At your service. As you wish, naturally.";
    }  else {
      return "Right. Goodbye Master Bruce.";
    }
  }
}