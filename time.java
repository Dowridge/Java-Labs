import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import java.util.TimeZone;
import java.util.Calendar;
public final class time {

 

   private long overallAverage = -1;
   private long buyAverage = -1;
   private long sellAverage = -1;
   private long buyingQuantity;
   private long sellingQuantity;



   public final String toString() {
   
   
      java.util.TimeZone tz = java.util.TimeZone.getTimeZone("EST");
      java.util.Calendar c = java.util.Calendar.getInstance(tz);
      //formatter.setTimeZone(TimeZone.getTimeZone("US/Central"));
      //return String.format("\nItem Name: %s,\nOverall Average: %d gp, \nBuying Average: %d gp, \nSelling Average: %d gp",
         // overallAverage, buyAverage, sellAverage);
      
      System.out.println(c.get(java.util.Calendar.HOUR_OF_DAY)+":"+ c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));
      String a =  String.format("Hour: %s", (c.get(java.util.Calendar.HOUR_OF_DAY)));
      return String.format("our: %s"," %s", (c.get(java.util.Calendar.HOUR_OF_DAY)), c.get(java.util.Calendar.MINUTE));
   }
}