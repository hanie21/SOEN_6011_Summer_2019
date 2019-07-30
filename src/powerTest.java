import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class powerTest {

  /*
   * @author Hanieh Qasemi version 1.0.1.1 This is a test case for Power This check the requirements
   * for Power function.
   */
  @Test
  public void test() {
    double result = Mathematic.pow(2, 2);
    assertEquals(4.0, result, 0);
  }


}
