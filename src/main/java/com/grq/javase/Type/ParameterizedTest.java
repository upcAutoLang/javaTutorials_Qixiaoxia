package com.grq.javase.Type;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class ParameterizedTest<T> {
    private Map<String, Integer> map = null;
    Map.Entry<String, Integer> entry = null;

    public static void main(String[] args) {
        try {
            Field field = ParameterizedTest.class.getDeclaredField("map");
            // 获取 type 类型
            Type type = field.getGenericType();
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                // 获取泛型中的实际类型，可能会存在多个泛型
                Type[] types = parameterizedType.getActualTypeArguments();
                System.out.println("getActualTypeArguments(): " );
                for(Type obj : types) {
                    System.out.println("  " + obj);
                }
                System.out.println("======================");

                // 获取声明泛型的类或者接口，也就是泛型中<>前面的那个值
                Type rawType = parameterizedType.getRawType();
                System.out.println("getRawType(): " + rawType);
                System.out.println("======================");

                // 获取到内部类的“拥有者”
                Type ownerType = parameterizedType.getOwnerType();
                System.out.println("getOwnerType(): " + ownerType);
                System.out.println("----");
                Field entryField = ParameterizedTest.class.getDeclaredField("entry");
                ParameterizedType entryFieldType = (ParameterizedType) entryField.getGenericType();
                Type entyrFieldOwnerType = entryFieldType.getOwnerType();
                System.out.println("entry.getOwnerType(): " + entyrFieldOwnerType);

            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
