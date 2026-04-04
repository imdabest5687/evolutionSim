import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main(String[] args) {
      String[] foodType = {"apple", "banana", "mango"};

      Random random = new Random();
      String randomFoodType = foodType[random.nextInt(foodType.length)];

      Food food1 = new Food(randomFoodType, 6, 5, 5);
      System.out.println(food1.getType());

      Food food2 = new Food("apple", 2, 4, 4);

      World world = new World(50, 50);
      world.addFood(food1);
      world.addFood(food2);
      System.out.println(world.getFoods());

      Creature beast = new Creature("beast", "brown", 5, 8, 6, 2, 2, 0);
      world.addCreature(beast);
      System.out.println(world.getCreatures());
      System.out.println(world.getFoods());

      for (int i = 0; i < 3; i++) {
         System.out.println(textStyles.RED + "---" + textStyles.BOLD + textStyles.GREEN + textStyles.ITALIC + " Round "
            + (i + 1) + textStyles.RESET + textStyles.RED + " ---" + textStyles.RESET);
         world.update();
         System.out.println("------------");
         System.out.println(world.getCreatures());
         System.out.println("------------");
         System.out.println(world.getFoods());
         System.out.println("------------");

         if (!(i == 2)) {
            try {
               TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
               System.out.println("Thread was interrupted.");
            }
         }
      }
   }
}