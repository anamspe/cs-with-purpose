// Write a program FunctionGrowth.java that prints a table of the values of 
// ln n, n, n ln n, n2, n3, and 2n for n = 16, 32, 64, ..., 2048. 
// Use tabs ('\t' characters) to line up columns.

public class FunctionGrowth {
  public static void main(String[] args) {
    System.out.println("log n \tn \tn log n \tn^2 \tn^3");
    for (long i = 2; i <= 2048; i *= 2) {
      System.out.print((int) Math.log(i));
      System.out.print('\t');
      System.out.print(i);
      System.out.print('\t');
      System.out.print((int) (i * Math.log(i)));
      System.out.print('\t');
      System.out.print(i * i);
      System.out.print('\t');
      System.out.print(i * i * i);
      System.out.println();
    }
  }
}
