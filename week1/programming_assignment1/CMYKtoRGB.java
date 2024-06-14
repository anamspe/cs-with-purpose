// Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using these mathematical formulas:
// white = 1 - black
// red = 255 x white x (1 - cyan)
// green =  255 x white x (1 - magenta)
// blue =  255 x white x (1 - yellow)


public class CMYKtoRGB {
  public static void main(String[] args) {
    double cyan = Double.parseDouble(args[0]);
    double magenta = Double.parseDouble(args[1]);
    double yellow = Double.parseDouble(args[2]);
    double black = Double.parseDouble(args[3]);

    double white = 1 - black;
    double red = Math.round(255 * white * (1 - cyan));
    double green = Math.round(255 * white * (1 - magenta));
    double blue = Math.round(255 * white * (1 - yellow));

    System.out.println("red = " + (int) red);
    System.out.println("green = " + (int) green);
    System.out.println("blue = " + (int) blue);
  }
  
}
