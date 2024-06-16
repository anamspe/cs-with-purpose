public class RandomWalkers {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    int totalSteps = 0;
    
    for (int i = 1; i <= trials; i++) {
      int x = 0;
      int y = 0;
      int steps = 0;

      while (Math.abs(x) + Math.abs(y) < r) {
        double random = Math.random();

        if (random < 0.25) x++;
        else if (random < 0.5) y++;
        else if (random < 0.75) x--;
        else y--;

        steps++;
      }
      totalSteps += steps;
    }

    double avgSteps = (double) totalSteps / trials;
    System.out.println("Average number of steps = " + avgSteps);
  }
}
