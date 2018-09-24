package com.grq.javase.Type;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class ClassTest {
    private ClassTest classTest;

    public static void main(String[] args) throws NoSuchFieldException {
        Field field = ClassTest.class.getDeclaredField("classTest");
        Type type = field.getGenericType();
        System.out.println("classTest: ");
        System.out.println("  type class: " + type.getClass());
        System.out.println("  type info: " + type.toString());
    }
}
