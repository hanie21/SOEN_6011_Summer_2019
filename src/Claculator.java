import java.util.Scanner;

/*
 * @author Hanieh Qasemi version 1.0.1.1 This class is a Calculator, which calculates the Gamma
 * Function. Gamma Function is used for Real or Natural Number.
 */
public class Claculator {

  /*
   * @Param : x is a parameter this is the function for calculating the Log Gamma Function, if it is
   * a positive number, it returns the positive but if it is the negative so it will return a
   * positive value
   * 
   * @return: tmp that is Log Gamma
   */
  private static double logGamma(double x) {
    /*
     * A tmp varible is defined here in order to have a temporary calculation. The calculation is
     * accord on calculating Log.
     */
    double tmp = (x - 0.5) * Mathematic.log(x + 4.5) - (x + 4.5);
    double ser =
        1.0 + 76.18009173 / (x + 0) - 86.50532033 / (x + 1) + 24.01409822 / (x + 2) - 1.231739516
            / (x + 3) + 0.00120858003 / (x + 4) - 0.00000536382 / (x + 5);
    return tmp + Mathematic.log(ser * Mathematic.sqrt(2 * Mathematic.PI));
  }

  /*
   * @Param : x is a parameter This function is used for calculating the exp of Log Gamma Function,
   * 
   * @return: is the exp of log Gamma x
   */
  public static double gamma(double x) {
    return Mathematic.exp(logGamma(x));
  }

  public static double beta(double x, double y) {
    double logBeta = logGamma(x) + logGamma(y) - logGamma(x + y);
    return Mathematic.exp(logBeta);
  }

  /*
   * This is the main function. It is needed that the user enter numbers to calculate Gamma. Error
   * handle is used here if the user enter the value out of range. If the user wants to stop the
   * program should enter the Zero number-> 0.
   * 
   * @return: The result is Gamma and Log Gamma x.
   */
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
  }
}
