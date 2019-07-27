import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CosTest {

  @Test
  public void test() {
    double result = Mathematic.cos(0);
    assertEquals(1.0, result, 1);
  }

}
