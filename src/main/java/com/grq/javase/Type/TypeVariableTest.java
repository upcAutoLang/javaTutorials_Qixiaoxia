package com.grq.javase.Type;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class TypeVariableTest<T extends  Number & Serializable & Comparable> {
    private T t;

    public static void main(String[] args) {

        try {
            Field field = TypeVariableTest.class.getDeclaredField("t");

            Type type = field.getGenericType();

            if (type instanceof TypeVariable) {
                // getBounds()
                TypeVariable tType = (TypeVariable) type;
                Type[] types = tType.getBounds();
                System.out.println("getBounds(): ");
                for (Type t : types) {
                    System.out.println("  " + t);
                }
                System.out.println("======================");
                // getGenericDeclaration()
                GenericDeclaration genericDeclaration = tType.getGenericDeclaration();
                System.out.println("getGenericDeclaration(): " + genericDeclaration);
                System.out.println("======================");
                // getName()
                String name = tType.getName();
                System.out.println("getName(): " + name);

            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}