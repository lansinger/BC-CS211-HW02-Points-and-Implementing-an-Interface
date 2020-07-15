/* Diane Lansinger
 * CS 211
 * HW02
 * Building Java Programs: p. 720, Exercise 20
 * 
 * Skeleton code by James Livingston, Bellevue College Adjunct Instructor
 * Adapted by Diane Lansinger
 *
 * A client program that deals with simple points.
 * Minimal version, to accompany immutable Point class.
 */

public class PointMainMin {
   public static void main(String[] args) {
      // create two Point objects
      Point p1 = new Point(7, 2);
      Point p2 = new Point(4, 3);
   
      // print each point and its distance from the origin
      System.out.println("p1 is " + p1);
      System.out.printf("distance from origin = %3.2f\n",
                            p1.distanceFromOrigin());
   
      System.out.println("p2 is " + p2);
      System.out.printf("distance from origin = %3.2f\n",
                            p2.distanceFromOrigin());

      // compare the two points and return the values by y-major order
      System.out.println("The y-major order of these two points is: ");
      if (p1.compareTo(p2) > 0){
         System.out.println("Lowest order: " + p1.toString());
         System.out.println("Highest order: " + p2.toString());
      }else if (p1.compareTo(p2) < 0){
         System.out.println("Lowest order: " + p2.toString());
         System.out.println("Highest order: " + p1.toString());
      }else{
         System.out.println("These points are equal in y-order.");
      }       
   }
}
