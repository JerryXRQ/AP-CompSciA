import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldJUnitTest
{
    @Test
    public void evaluatesExpression()
    {
        String expected = "hello world";
        String actual = HelloWorld.displayMessage();
        assertEquals(expected, actual);
    }
}
