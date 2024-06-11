# Conditionals and Loops

## Control Flow
- The sequence of statements that are actually executed in a program
- Conditionals and loops enable us to choreograph control flow

## The `if` statement
Execute certain statements depending on the values of certain variables
- Evaluate a `boolean` expression.
- If `true`, execute a statement.
- The `else` option: if `false`, execute a different statement.

``` java
public class Flip 
{
  public static void main(String[] args) 
  {
    if (Math.random() < 0.5)
      System.out.println("Heads");
    else
      System.out.println("Tails");
  }
}
```

## Loops: the `while` statement
Execute certain statements repeatedly until certain conditions are met.
- Evaluate a `boolean` expression.
- If `true`, execute a sequence of statements.
- Repeat.

``` java
public class PowersOfTwo
{
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    int i = 0;
    int v = 1;
    
    while (i <= n)
    {
      System.out.println(v);
      i = i + 1;
      v = 2 * v;
    }
  }
}
```
## An alternative: the `for` loop

An alternative repetition structure. `Why? Can provide code that is more compact and understandable`
- Evaluate an `initialization` statement
- Evaluate a `boolean` expression
- If `true`, execute a `sequence of statements`, then execute a `increment statement`.
- Repeat.

``` java
public class PQfor
{
  public static void main(String[] args) 
  {
    int f = 0; g = 1;
    for (int i = 0; i <= 10; i++)
    {
      System.out.println(f);
      f = f + g;
      g = f - g;
    }
  }
}

*prints the Fibonacci sequence
```

## Nesting conditionals and loops
- Any "statement" within a conditional or loop may itself be a conditional or a loop statement.
- Enables complex control flows.
- Adds to challenge of debugging.

``` java
for (int t = 0; t < trials; t++>)
{
  int cash = stake;
  while (cash > 0 && cash < goal)               if-else statement 
    if (Math.random() < 0.5) cash++;      ←     within a while loop
    else                     cash--;            within a for loop
  if (cash == goal) wins++;
}
```


