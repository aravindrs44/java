import java.util.HashMap;
import java.util.Set;

public class Songs {
  public static void main(String[] args) {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("You've been 'Hoi'sted", "Hoi Hoi");
    trackList.put("Hunka Hunka", "Hunka Dunka Hunka");
    trackList.put("Buy You a Drank", "Baby girl, what's your name");
    trackList.put("Never Gonna Give You Up", "We're no strangers to love");

    System.out.println(trackList.get("Hunka Hunka"));

    Set<String> keys = trackList.keySet();
    for(String key : keys) {
      String track = key;
      String lyrics = trackList.get(key);
      System.out.println(track + " : " + lyrics);
    }
  }
}

