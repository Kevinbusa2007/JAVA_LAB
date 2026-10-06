import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Run {
}

class TestSuite {
    @Run
    public void testOne() {
        System.out.println("Running test 1");
    }

    public void helperMethod() {
        System.out.println("Skipped");
    }

    @Run
    public void testTwo() {
        System.out.println("Running test 2");
    }
}

public class MiniTestRunner {
    public static void main(String[] args) {
        TestSuite suite = new TestSuite();
        Method[] methods = suite.getClass().getDeclaredMethods();
        int runCount = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Run.class)) {
                try {
                    method.invoke(suite);
                    runCount++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Total tests run: " + runCount);
    }
}