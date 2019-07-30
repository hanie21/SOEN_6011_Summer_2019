public final class Mathematic {
  /*
   * @author Hanieh Qasemi. version 1.0.1.1. This is the mathematic class that all calculation is
   * used here.
   */

  /*
   * A constant that contain the value of Pi number.
   */
  public static final double PI = 3.141592653589793;

  /*
   * @param: x is a param.
   * 
   * @This function calculate exp
   * 
   * @return: the result is exp(x)
   */
  public static double exp(double x) {
    if (x < 0)
      return 1 / exp(-x);

    double result = 1;
    for (int i = 1; i < 1000; i++) {
      double d = 1;
      for (int j = 1; j <= i; j++) {
        d = d * x / j;
      }
      result += d;
    }
    return result;
  }

  /*
   * @param: x is a param.
   * 
   * @This function calculate log
   * 
   * @return: the result is log(x)
   */
  public static double log(double x) {
    if (x < 0)
      return Double.NaN;
    if (x == 0)
      return 1;
    double result = 0;
    for (int i = 1; i < 1000; i++) {
      int n = 2 * i - 1;
      double d = 1.0 / n;
      for (int j = 0; j < n; j++) {
        d = d * (x - 1) / (x + 1);
      }
      result += d;
    }
    return 2 * result;
  }

  /*
   * @param: x and a are the parameters.
   * 
   * @This function calculate log a and x
   * 
   * @return: the result is log(x,a)
   */
  public static double log(double x, double a) {
    return log(x) / log(a);
  }

  /*
   * @param: x and a are parameters.
   * 
   * @This function calculate power of x
   * 
   * @return: the result is power(x) of the value of a.
   */
  public static double pow(double x, int a) {
    double result = 1;
    if (a < 0) {
      x = 1 / x;
      a = -a;
    }
    for (int i = 0; i < a; i++) {
      result *= x;
    }
    return result;
  }

  public static double pow(double x, double a) {
    double result = exp(a * log(x));
    return result;
  }

  /*
   * @param: x is a param.
   * 
   * @This function calculate sqrt
   * 
   * @return: the result is sqrt(x)
   */
  public static double sqrt(double x) {
    if (x < 0)
      return Double.NaN;

    double result = x;
    int count = 0;
    while (result >= 10) {
      result = result / 10;
      count++;
    }
    if (result < 3)
      result = 1;
    else if (result < 7)
      result = 2;
    else
      result = 3;
    if (count % 2 == 1) {
      result *= 3;
    }
    for (int i = 0; i < count / 2; i++)
      result *= 10;

    for (int i = 1; i < 100; i++) {
      double a = (x - result * result) / (2 * result);
      result = (result + a) - a * a / (2 * (result + a));
    }
    return result;
  }

  /*
   * @param: x is a param.
   * 
   * @This function calculate sin
   * 
   * @return: the result is sin(x)
   */
  public static double sin(double x) {
    int sign = 1;
    if (x < -PI / 2)
      x = -x + PI;
    while (x > PI / 2) {
      x -= PI;
      sign = -sign;
    }
    double result = x;
    for (int i = 1; i < 1000; i++) {
      double d = i % 2 == 0 ? 1 : -1;
      int n = 2 * i + 1;
      for (int j = 1; j <= n; j++) {
        d *= x / j;
      }
      result += d;
    }
    return sign * result;
  }

  /*
   * @param: x is a param.
   * 
   * @This function calculate Cos
   * 
   * @return: the result is Cos(x)
   */
  public static double cos(double x) {
    int sign = 1;
    if (x < -PI / 2)
      x = -x + PI;
    while (x > PI / 2) {
      x -= PI;
      sign = -sign;
    }
    double result = 1;
    for (int i = 1; i < 1000; i++) {
      double d = i % 2 == 0 ? 1 : -1;
      int n = 2 * i;
      for (int j = 1; j <= n; j++) {
        d *= x / j;
      }
      result += d;
    }
    return sign * result;
  }

  /*
   * @param: x is a param.
   * 
   * @This function calculate tan
   * 
   * @return: the result is tan(x)
   */
  public static double tan(double x) {
    return sin(x) / cos(x);
  }

  public static double sinh(double x) {
    double result = x;
    for (int i = 1; i < 1000; i++) {
      double d = 1;
      int n = 2 * i + 1;
      for (int j = 1; j <= n; j++) {
        d = d * x / j;
      }
      result += d;
    }
    return result;
  }

  public static double cosh(double x) {
    double result = 1;
    for (int i = 1; i < 1000; i++) {
      double d = 1;
      int n = 2 * i;
      for (int j = 1; j <= n; j++) {
        d = d * x / j;
      }
      result += d;
    }
    return result;
  }

  public static double asin(double x) {
    if (x < -1 || x > 1)
      return Double.NaN;

    double result = x;
    for (int i = 1; i < 1000; i++) {
      double d = pow(x, i + 1) / (2 * i + 1);
      for (int j = 1; j <= i; j++) {
        d *= 0.5 * (2 * j - 1) * x / j;
      }
      result += d;
    }
    return result;
  }

  public static double acos(double x) {
    if (x < -1 || x > 1)
      return Double.NaN;
    return .5 * PI - asin(x);
  }
}
