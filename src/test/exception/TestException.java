package test.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author HaoQ
 */
public class TestException {

    //public static void main(String[] args) {
    //
    //    try{
    //        int a[] = new int[2];
    //        System.out.println("access element three "+a[3]);
    //    }catch (ArrayIndexOutOfBoundsException  e){
    //        System.out.println("Exception thrown: "+e);
    //    }
    //
    //    System.out.println("out of block");
    //}
//---------------------------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//
//        /*
//         * 执行结果
//         * IOException thrown: java.io.FileNotFoundException: usr\test (系统找不到指定的路径。)
//         * catch
//         *
//         * FileNotFoundException继承IOException
//         */
//        try{
//            FileInputStream file = new FileInputStream("usr/test");
//            byte x = (byte) file.read();
//        }catch(IOException e){
//            System.out.println("IOException thrown: "+e);
//        }catch (NullPointerException n){
//            System.out.println("NullPointerException thrown:"+n);
//        }
//
//        System.out.println("catch");
//    }
//---------------------------------------------------------------------------------------------------------

    //public static void main(String[] args)throws NullPointerException,IOException {
    //    /*
    //     *执行结果
    //     *Exception in thread "main" java.io.FileNotFoundException: usr\test (系统找不到指定的路径。)
    //     *at java.io.FileInputStream.open0(Native Method)
    //     *
    //     * 异常被抛出，中断执行，并打印堆栈信息
    //     */
    //    FileInputStream file = new FileInputStream("usr/test");
    //    byte x=(byte)file.read();
    //}
//---------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws Exception{
        /*
         * 执行结果
         * Exception in thread "main" java.lang.Exception: exception
         * at test.exception.TestException.main(TestException.java:58)
         * ...
         *
         * 异常被抛出，并打印了堆栈信息
         */
        throw new Exception("exception");
    }
}
