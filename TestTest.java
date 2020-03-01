import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

   String message = "Hello";
   Fizz fizz = new Fizz(message);

   @Test
   public void testPrint() {
      assertEquals(message,fizz.print());
   }
}
