public class Creature {

   private String animal;
   private String color;
   private int speed;
   private int strength;
   private int totalEnergy;
   private int x;
   private int y;
   
   public Creature(String animal, String color, int speed, int strength, int totalEnergy, int x, int y) {
      this.animal = animal;
      this.color = color;
      this.speed = speed;
      this.strength = strength;
      this.totalEnergy = totalEnergy;
      this.x = x;
      this.y = y;
   }
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }

   public int getTotalEnergy() {
      return totalEnergy;
   }

   public int getSpeed() {
      return speed;
   }
   
   @Override
   public String toString() {
      return "Creature[animal=" + animal + ", color=" + color + ", speed=" + speed + ", strength=" + strength + ", energy=" + totalEnergy + ", x=" + x + ", y=" + y + "]";
   }
   
   public void move(int add_x, int add_y, int energyUsed) {
      x += add_x;
      y += add_y;
      totalEnergy -= energyUsed;
   }

   public void addEnergy(int energyAddition) {
      totalEnergy += energyAddition;
   }
   
   

}