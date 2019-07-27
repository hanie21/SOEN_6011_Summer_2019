import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class SinTest {

  @Test
  public void test() {
    double result = Mathematic.sin(0);
    assertEquals(0.0, result, 0);
  }

}
