import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite @SelectClasses(CartTest.class) @IncludeTags("regression")
public class RegressionSuiteTest {
}
