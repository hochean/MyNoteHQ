package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author HaoQ
 */
class AnnotationTest {
    @Retention(RetentionPolicy.RUNTIME)
    @interface TestAnnotation {
        String name() default "";
    }
}
