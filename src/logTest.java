import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class logTest {

  @Test
  public void LogTest() {
    double result = Mathematic.log(-1);
    assertEquals(Double.NaN, result, 0);
  }
}
