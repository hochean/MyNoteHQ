package test.annotation;

import java.lang.reflect.Field;

import test.annotation.AnnotationTest.TestAnnotation;

/**
 * @author HaoQ
 */
public class TestMain {
    public static void main(String[] args) {

        Field[] fields = TestInfo.class.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
            if (field.isAnnotationPresent(TestAnnotation.class)) {
                TestAnnotation testAnnotation = field.getAnnotation(TestAnnotation.class);
                System.out.println("field:" + field.getName() + ",annotation:" + testAnnotation.name());
            }
        }
    }
}
