package com.grq.javase.Type;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.List;

public class GenericArrayTypeTest<T> {
    private T[] t;
    private List<String>[] listArray;

    public static void main(String[] args) {

        try {
            Field fieldT = GenericArrayTypeTest.class.getDeclaredField("t");
            Type typeT = fieldT.getGenericType();
            GenericArrayType tArrayType = (GenericArrayType) typeT;
            System.out.println("\"T[]\" getGenericComponentType(): " + tArrayType.getGenericComponentType());
            System.out.println("======================");

            Field fieldListArray = GenericArrayTypeTest.class.getDeclaredField("listArray");
            Type typeListArray = fieldListArray.getGenericType();
            GenericArrayType tListArrayType = (GenericArrayType) typeListArray;
            System.out.println("\"List<String>[]\" getGenericComponentType(): " + tListArrayType.getGenericComponentType());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
