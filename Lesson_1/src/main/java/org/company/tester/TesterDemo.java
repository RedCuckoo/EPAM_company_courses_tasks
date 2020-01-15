package org.company.tester;

import java.lang.reflect.InvocationTargetException;

public class TesterDemo {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final TestRunner runner = new TestRunner();
        runner.run(MyTest.class);

    }
}
