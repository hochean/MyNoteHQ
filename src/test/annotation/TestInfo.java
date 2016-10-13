package test.annotation;

import test.annotation.AnnotationTest.TestAnnotation;

/**
 * @author HaoQ
 */
class TestInfo {

    @TestAnnotation(name = "公司名称")
    private String company;

    @TestAnnotation(name = "职位")
    private String position;

}
