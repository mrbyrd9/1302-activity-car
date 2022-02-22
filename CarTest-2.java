/* Decompiler 9ms, total 88ms, lines 22 */
package carActivity;

public class CarTest {
   public static void main(String[] args) {
      Car car1 = new Car(2007, "Ford", "Taurus", 26, 18);
      Car car2 = new Car(1920, "Toyota", "Corolla", 42, 30);
      SmallCar car3 = new SmallCar(2016, "Chevy", "Spark", 41, 38, 1000);
      header();
      System.out.println(car1.toString());
      System.out.println(car2.toString());
      System.out.println(car3.toString());
   }

   public static void header() {
      System.out.println("-------------------------------------------------------");
      System.out.println("year\tmake\tmodel\t\t\tMPG");
      System.out.println("-------------------------------------------------------");
      System.out.println("\t\t\t\tHighway\t\tCity");
      System.out.println("-------------------------------------------------------\n");
   }
}
