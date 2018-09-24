package com.grq.javase.Type;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public class WildcardTypeTest {
    private List<? extends Number> listNum;
    private List<? super String> listStr;

    public static void main(String[] args) {

        try {
            Field fieldNum = WildcardTypeTest.class.getDeclaredField("listNum");
            Type typeNum = fieldNum.getGenericType();
            if (typeNum instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) typeNum;
                Type[] types = parameterizedType.getActualTypeArguments();
                if (types[0] instanceof WildcardType) {
                    WildcardType wType = (WildcardType) types[0];
                    Type[] upperTypes = wType.getUpperBounds();
                    System.out.println("listNum: ");
                    if(upperTypes != null || upperTypes.length <= 0) {
                        System.out.println("  upperBounds: ");
                        for (Type t : upperTypes) {
                            System.out.println("    " + t);
                        }
                    } else {
                        System.out.println("  upperBounds: null");
                    }

                    Type[] lowerTypes = wType.getLowerBounds();
                    if(lowerTypes != null || lowerTypes.length <= 0) {
                        System.out.println("  lowerBounds: ");
                        for (Type t : lowerTypes) {
                            System.out.println("    " + t);
                        }
                    } else {
                        System.out.println("  lowerBounds: null");
                    }
                }
            }

            System.out.println("======================");

            Field fieldList = WildcardTypeTest.class.getDeclaredField("listStr");
            Type typeList = fieldList.getGenericType();
            if (typeNum instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) typeList;
                Type[] types = parameterizedType.getActualTypeArguments();
                if (types[0] instanceof WildcardType) {
                    WildcardType wType = (WildcardType) types[0];
                    Type[] upperTypes = wType.getUpperBounds();
                    System.out.println("listNum: ");
                    if(upperTypes != null || upperTypes.length <= 0) {
                        System.out.println("  upperBounds: ");
                        for (Type t : upperTypes) {
                            System.out.println("    " + t);
                        }
                    } else {
                        System.out.println("  upperBounds: null");
                    }

                    Type[] lowerTypes = wType.getLowerBounds();
                    if(lowerTypes != null || lowerTypes.length <= 0) {
                        System.out.println("  lowerBounds: ");
                        for (Type t : lowerTypes) {
                            System.out.println("    " + t);
                        }
                    } else {
                        System.out.println("  lowerBounds: null");
                    }
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}