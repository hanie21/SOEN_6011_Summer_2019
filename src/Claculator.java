import java.util.Scanner;

public class Claculator {


  private static double logGamma(double x) {
    double tmp = (x - 0.5) * Mathematic.log(x + 4.5) - (x + 4.5);
    double ser =
        1.0 + 76.18009173 / (x + 0) - 86.50532033 / (x + 1) + 24.01409822 / (x + 2) - 1.231739516
            / (x + 3) + 0.00120858003 / (x + 4) - 0.00000536382 / (x + 5);
    return tmp + Mathematic.log(ser * Mathematic.sqrt(2 * Mathematic.PI));
  }

  public static double gamma(double x) {
    return Mathematic.exp(logGamma(x));
  }

  public static double beta(double x, double y) {
    double logBeta = logGamma(x) + logGamma(y) - logGamma(x + y);
    return Mathematic.exp(logBeta);
  }

  // Calling the function Gamma till user exit
  public static void main(String[] args) {

    try {
      Scanner input = new Scanner(System.in);
      System.out.println("In order to exit press 0:");
      System.out.print("Enter a number:");
      int s = 0;
      while ((s = input.nextInt()) != 0) {
        System.out.println("Gamma(" + s + ") = " + gamma(Integer.valueOf(s)));
        System.out.println("log Gamma(" + s + ") = " + logGamma(Integer.valueOf(s)));
        System.out.print("Enter a number:");
      }

      System.out.println("You entered exit " + s);
    } catch (Exception e) {
      System.out.println("You entered the wrong input, the input can be any number subset of R ");
    }

    // System.out.println(Mathematic.cos(0));
  }
}
