public class Creature {
   private String animal;
   private String color;
   private int speed;
   private int strength;
   private int totalEnergy;
   private int x;
   private int y;
   private int age;

   public Creature(String animal, String color, int speed, int strength, int totalEnergy, int x, int y, int age) {
      this.animal = animal;
      this.color = color;
      this.speed = speed;
      this.strength = strength;
      this.totalEnergy = totalEnergy;
      this.x = x;
      this.y = y;
      this.age = age;
   }

   public String getAnimal() {
      return animal;
   }

   public String getColor() {
      return color;
   }

   public int getSpeed() {
      return speed;
   }

   public int getStrength() {
      return strength;
   }

   public int getTotalEnergy() {
      return totalEnergy;
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   public int getAge() {
      return age;
   }

   @Override
   public String toString() {
      return "Creature[animal=" + animal + ", color=" + color + ", speed=" + speed + ", strength=" + strength
         + ", energy=" + totalEnergy + ", x=" + x + ", y=" + y + ", age=" + age + "]";
   }

   public void move(int add_x, int add_y, int energyUsed) {
      x += add_x;
      y += add_y;
      totalEnergy -= energyUsed;
   }

   public void addEnergy(int energyAddition) {
      totalEnergy += energyAddition;
   }

   public void loseEnergy(int energyRemoval) {
      totalEnergy -= energyRemoval;
   }

   /*public Creature reproduce(String animal, String color, int speed, int strength, int totalEnergy, int x, int y) {
      Creature a = new Creature(animal, color, speed, strength, totalEnergy, x, y);
      return a;
   }*/

   public Creature reproduce() {
      return new Creature(animal, color, speed, strength, 10, x, y, 0);
   }
}