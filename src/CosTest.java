import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CosTest {
  /*
   * @author Hanieh Qasemi version 1.0.1.1 This is a test case for Cos This check the requirements
   * for Cos function.
   */
  @Test
  public void test() {
    double result = Mathematic.cos(0);
    assertEquals(1.0, result, 1);
  }

}
