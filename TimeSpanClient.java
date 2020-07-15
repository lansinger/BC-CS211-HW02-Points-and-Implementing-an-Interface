/* Diane Lansinger
 * CS 211
 * HW02
 * Building Java Programs: p. 720, Exercise 20
 * 
 * Skeleton code by James Livingston, Bellevue College Adjunct Instructor
 * Adapted by Diane Lansinger
 *
 * TimeSpanClient: a simple test client for the TimeSpan class
 * Shows creation of an instance object, displaying that object,
 * adding hours and minutes to that object, and showing the result.
 */
 public class TimeSpanClient {
    public static void main(String[] args) {
        int h1 = 13, m1 = 30;
        TimeSpan t1 = new TimeSpan(h1, m1);
        System.out.println("New object t1: " + t1);
        
        h1 = 3; m1 = 40;
        System.out.println("Adding " + h1 + " hours, " + m1 + " minutes to t1");        
        t1.add(h1, m1);
        System.out.println("New t1 state: " + t1);

        int h2 = 3, m2 = 45;
        TimeSpan t2 = new TimeSpan(h2, m2);
        System.out.println("");
        System.out.println("New object t2: " + t2);

        // compare the two timespans and return the values, shortest first
        System.out.println("Comparing the two timespans, shortest vs longest: ");
        if (t1.compareTo(t2) > 0){
            System.out.println("Shortest: t1 " + t1.toString());
            System.out.println("Longest: t2 " + t2.toString());
        }else if (t1.compareTo(t2) < 0){
            System.out.println("Shortest: t2 " + t2.toString());
            System.out.println("Longest: t1 " + t1.toString());
        }else{
            System.out.println("These timespans are equal in length.");
        }       
    }
}