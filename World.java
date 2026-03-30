import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class World {

   private int width;
   private int height;
   
   private List<Creature> creatures;
   private List<Food> foods;
   
   
   public World(int width, int height) {
      this.width = width;
      this.height = height;
      creatures = new ArrayList<>();
      foods = new ArrayList<>();
   }
   
   public void addCreature(Creature creature) {
      creatures.add(creature);
   }
   
   public void addFood(Food food) {
      foods.add(food);
   }
   
   public List<Creature> getCreatures() {
      return creatures;
   }
   
   public List<Food> getFoods() {
      return foods;
   }
   
   public void update() {
      for (Creature a : creatures) {
         int speed = a.getSpeed();
         int dx = ThreadLocalRandom.current().nextInt(-speed, speed + 1);
         int dy = ThreadLocalRandom.current().nextInt(-speed, speed + 1);
         a.move(dx, dy, 2);
      }

      for (Creature a : creatures) {
         for (int i = 0; i < foods.size(); i++) {
            Food b = foods.get(i);

            if (a.getX() == b.getX() && a.getY() == b.getY()) {
               a.addEnergy(b.getEnergy());
               foods.remove(i);
               break;
            }
         }
      }

      for (int i = creatures.size() - 1; i >= 0; i--) {
         Creature a = creatures.get(i);
         if (a.getTotalEnergy() < 1) {
            creatures.remove(i);
         }
      }
      
   }

}