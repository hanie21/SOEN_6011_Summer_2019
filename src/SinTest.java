import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class SinTest {

  /*
   * @author Hanieh Qasemi version 1.0.1.1 This is a test case for Sin This check the requirements
   * for Sin function.
   */
  @Test
  public void test() {
    double result = Mathematic.sin(0);
    assertEquals(0.0, result, 0);
  }

}
