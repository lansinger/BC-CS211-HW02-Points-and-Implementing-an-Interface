/* Diane Lansinger
 * CS 211
 * HW02
 * Building Java Programs: p. 720, Exercise 20
 * 
 * Adapted for CS211 from Building Java Programs, 4th Edition,
 * by Stuart Reges and Marty Stepp
 * adapted by James Livingston, Bellevue College Adjunct Instructor
 * further adapted by Diane Lansinger
 *
 * Represents a time span of elapsed hours and minutes.
 * Simple implementation using only total minutes as state.
 */

public class TimeSpan implements Comparable<TimeSpan> {
   private int totalMinutes;

   // Constructs a time span with the given interval.
   // pre: hours >= 0 && minutes >= 0
   public TimeSpan(int hours, int minutes) {
      totalMinutes = 0;
      add(hours, minutes);
   }
   
   // Adds the given interval to this time span.
   // pre: hours >= 0 && minutes >= 0
   public void add(int hours, int minutes) {
      totalMinutes += 60 * hours + minutes;
   }

   // Returns a String for this time span such as "6h15m".
   public String toString() {
      return (totalMinutes / 60) + "h"
             + (totalMinutes % 60) + "m";
   }

   // Gets TimeSpan value in minutes
   public int getTimeSpan(){
      return totalMinutes;
   }

   // Compares time spans by length.
   // A shorter time span is "less than" a longer timespan.
   public int compareTo(TimeSpan other){
      if (other.getTimeSpan() < this.getTimeSpan()){              
         return -1;
      }
      else if (other.getTimeSpan() == this.getTimeSpan()){
            return 0;            
      }
      else { //other.getTimeSpan() > this.getTimeSpan()
         return 1;
      }
   }
}
