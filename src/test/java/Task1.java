import org.testng.annotations.*;

public class Task1
{
    private int numberOfTest = 0;
    @Test(description = "Task_1 TestNG", groups = {"Smoke", "Regression"})
    public void test1()
    {
        System.out.println(++numberOfTest + ": Test1");
    }
    @Test(description = "Test 2", groups = "Smoke")
    public void test2()
    {
        System.out.println(++numberOfTest + ": Test2");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println(++numberOfTest + ": BeforeClass annotation");
    }
}
