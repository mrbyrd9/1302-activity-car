/* Decompiler 10ms, total 77ms, lines 15 */
package carActivity;

public class SmallCar extends Car {
   private int weight;

   public SmallCar(int yr, String brand, String type, int mpgH, int mpgC, int wgt) {
      super(yr, brand, type, mpgH, mpgC);
      this.weight = wgt;
   }

   public String toString() {
      return super.toString() + "\t" + this.weight;
   }
}
