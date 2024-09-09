package org.example.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class GenericSuperClassTest {
    public static void main(String[] args) {
        Class<?> c = Base.class;
        TypeVariable<?>[] typeParameters = c.getTypeParameters();
        for (TypeVariable<?> typeParameter : typeParameters) {
            System.out.println(typeParameter + ",上限 " + typeParameter.getBounds()[0]);
        }

        Class<Sub> clazz = Sub.class;
        Type gs = clazz.getGenericSuperclass();
        ParameterizedType gt = (ParameterizedType) gs;
        Type[] actualTypeArguments = gt.getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println(actualTypeArgument);
        }
    }
}

class Base<T extends Number>{

}

class Sub extends Base<Integer>{
}