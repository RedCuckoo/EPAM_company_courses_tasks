package org.company.tester;

import org.company.tester.annotations.Before;
import org.company.tester.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public void run(Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Constructor<?> constructor = clazz.getConstructor();
        final Object object = constructor.newInstance();
        final Method[] methods = clazz.getDeclaredMethods();

        List<Method> testMethods = getMethodsByAnnotation(Test.class, methods);
        List<Method> beforeMethods = getMethodsByAnnotation(Before.class, methods);
        for(Method testMethod : methods){
            for(Method beforeMethod : beforeMethods){
                beforeMethod.invoke(object);
            }
            testMethod.invoke(object);
        }


    }

    private List<Method> getMethodsByAnnotation(Class<? extends Annotation> annotation, Method[] methods) {
        final ArrayList<Method> tempMethods = new ArrayList<Method>();
        for(Method method : methods){
            if(method.isAnnotationPresent(annotation)){
                tempMethods.add(method);
            }
        }
        return tempMethods;
    }
}
