public class Food {
   private String type;
   private int energy;
   private int x;
   private int y;

   public Food(String type, int energy, int x, int y) {
      this.type = type;
      this.energy = energy;
      this.x = x;
      this.y = y;
   }

   public String getType() {
      return type;
   }

   public int getEnergy() {
      return energy;
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   @Override
   public String toString() {
      return "Food[type=" + type + ", energy=" + energy + ", x=" + x + ", y=" + y + "]";
   }
}