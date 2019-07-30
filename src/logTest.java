import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class logTest {
  /*
   * @author Hanieh Qasemi version 1.0.1.1 This is a test case for Log This check the requirements
   * for Log function.
   */
  @Test
  public void LogTest() {
    double result = Mathematic.log(-1);
    assertEquals(Double.NaN, result, 0);
  }
}
