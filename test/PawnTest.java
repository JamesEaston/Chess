import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PawnTest {
  @Test
  public void createsPawn() {
    Pawn p = new Pawn(0, 1, true);
    assertNotNull("Pawn() should create pawn", p);
  }
  @Test
  public void failExample() {
    assertEquals(1,2);
  }
}

