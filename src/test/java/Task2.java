import org.testng.annotations.*;

import java.lang.reflect.Method;


public class Task2
{
    @Test(description = "This test validates different kinds of attributes/variables of @Test annotation", enabled = true, groups = "Regression", priority = 1)
    public void test1(Method method)
    {
        Test test1 = method.getAnnotation(Test.class);
        System.out.println("Description is: " +test1.description());
        System.out.println("Priority: " + test1.priority());
        System.out.println("Test of attributes here");
    }
    @Test(description = "Test2", groups = "Smoke")
    public void test2()
    {
        System.out.println("This is test 2");
    }
    @BeforeClass(description = "This is run before the class is run")
    public void beforeClass()//Method method)
    {
        //BeforeClass beforeMethod = method.getAnnotation(BeforeClass.class);
        //System.out.println("Description: " + beforeMethod.description());
    }
    @Test(description = "Test3", groups = "Regression")
    public void test3()
    {
        System.out.println("This is test 3");
    }
    @Test(description = "Test4", groups = "Smoke")
    public void test4()
    {
        System.out.println("This is test 4");
    }
}
