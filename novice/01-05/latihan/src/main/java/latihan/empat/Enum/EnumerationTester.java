package latihan.empat.Enum;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

   public static void mulai() {
      Enumeration days;
      Vector dayNames = new Vector();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}