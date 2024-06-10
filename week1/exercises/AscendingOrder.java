public class AscendingOrder {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    int min1 = Math.min(num1, num2);
    int lower = Math.min(min1, num3);

    int max1 = Math.max(num1, num2);
    int higher = Math.max(max1, num3);

    int sum = num1 + num2 + num3;
    int middle = sum - lower - higher;

    System.out.println("The given numbers in ascending order are: " + lower + ", " + middle + ", and " + higher + ".");
    
  }
}
