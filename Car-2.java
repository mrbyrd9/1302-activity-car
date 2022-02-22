/* Decompiler 21ms, total 282ms, lines 70 */
package carActivity;

public class Car {
   private String make;
   private String model;
   private int year;
   private int mpgHwy;
   private int mpgCity;

   public Car(int yr, String brand, String type, int mpgH, int mpgC) {
      this.year = yr;
      this.make = brand;
      this.model = type;
      this.mpgHwy = mpgH;
      this.mpgCity = mpgC;
   }

   public void setYear(int yr) {
      this.year = yr;
   }

   public int getYear() {
      return this.year;
   }

   public void setMake(String brand) {
      this.make = brand;
   }

   public String getMake() {
      return this.make;
   }

   public void setModel(String type) {
      this.model = type;
   }

   public String getModel() {
      return this.model;
   }

   public void setMpgHwy(int mpgH) {
      this.mpgHwy = mpgH;
   }

   public int getMpgHwy() {
      return this.mpgHwy;
   }

   public void setMpgCity(int mpgC) {
      this.mpgCity = mpgC;
   }

   public int getMpgCity() {
      return this.mpgCity;
   }

   public String toString() {
      return this.year + "\t" + this.make + "\t" + this.model + "\t\t" + this.mpgHwy + "\t\t" + this.mpgCity;
   }

   public boolean isAntique(int currentYear) {
      int minYear = currentYear - 45;
      return this.year < minYear;
   }

   public static void main(String[] args) {
   }
}
