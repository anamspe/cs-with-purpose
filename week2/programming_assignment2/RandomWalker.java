public class RandomWalker {

  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);

    int x = 0;
    int y = 0;
    System.out.println("(" + x + ", " + y + ")"); // print starting coordinates

    int steps = 0; 
    
    while ((Math.abs(x) + Math.abs(y)) < r) {
      double random = Math.random();

      if (random < 0.25) x++;
      else if (random < 0.5) y++;
      else if (random < 0.75) x--;
      else y--;

      steps++;
      System.out.println("(" + x + ", " + y + ")");
    }

    System.out.println("steps = " + steps);
  }
}