# Debugging

Debugging is 99% of program development in any programming language, even for experts.

- **Bug**: A mistake in a program.
- **Debugging**: The process of eliminating bugs.

Debugging is challenging because conditionals and loops *dramatically increase* the number of possible outcomes. Most programs contain *numerous* conditionals and loops, with nesting; but they provide structure that helps us understand our programs.

**Problem**: Factor a large integer *n*. <br>
**Application**: Cryptography.  
`Suprising fact: Security of internet commerce depends on difficulty of factoring large integers.`

**Method**:
- Consider each integer *i* less than *n*
- While *i* divides *n* evenly
  - Print *i* (it is a factor of *n*)
  - Replace *n* with *n/i*.

  ``` java
  public class Factors
  {
    public static void main(String[] args)
    {
      long n = Long.parseLong(args[0])    ← need terminating semi-colon
      for (i = 0; i < n; i++)             ← need terminating semi-colon / need to declare type of i / need to start variable at 2 (0 and 1 are not factors)
      {
        while (n % i == 0)                
          System.out.print(i + " ")       ← need terminating semi-colon / need braces
          n = n / i
      }
    }
  }
  ```
Is your program a legal Java program?
- Java compiler can help you find out.
- Find the *first* compiler error (if any) (mainly syntax)
- Repeat.
- Result: An executable Factors.class file

Does your legal Java program do what you want it to do?
- You need to run it to find out
- Find the *first* runtime error (if any)
- Fix and repeat.

Does your legal Java program ***always*** do what you want it to do?
- You need to test on many types of inputs to find out.
- Add trace code to find the first error.
- Fix the error.
- Repeat.

## Final code after debugging

``` java
public class Factors
{
  public static void main(String[] args)
  {
    long n = Long.parseLong(args[0]);
    for (i = 0; i < n; i++);   
    {
      while (n % i == 0)
      {
        System.out.print(i + " ");
        n = n / i;
      }            
    }
    if (n > 1) System.out.println(n);
    else       System.out.println();
  }
}
```

### Performance analysis
Is your working Java program fast enough to solve your problem?
- You need to test it on increasing problem sizes to find out.
- May need to change the algorithm to fix it.
- Repeat.

**Method** used so far:
- Consider each integer *i* less than *n*     ← `no need to check when i*i > n since all smaller factors already checked.`
- While *i* divides *n* evenly
  - Print *i* (it is a factor of *n*)
  - Replace *n* with *n/i*.

``` java
public class Factors
{
  public static void main(String[] args)
  {
    long n = Long.parseLong(args[0]);
    for (i = 0; i <= n/i; i++);    ← apply the change
    {
      while (n % i == 0)
      {
        System.out.print(i + " ");
        n = n / i;
      }            
    }
    if (n > 1) System.out.println(n);
    else       System.out.println();
  }
}
```

## Summary
Program development is a *four*-step process, with feedback.

- EDIT your program
- COMPILE your program to create and executable file (go back if there's `syntax errors`)
- RUN your program to test that it works as you imagined. (go back if there's `runtime errors` or `semantic errors`)
- TEST your program on realistic and real input data. (go back if there's `performance errors`)
<br><br>
- SUBMIT your program for independent testing and approval.