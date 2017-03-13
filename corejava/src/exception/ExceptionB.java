package exception;

/**
 * @author HaoQ
 */
public class ExceptionB extends ExceptionA {

    private static final long serialVersionUID = 3636622876605599731L;

    public static void main(String[] args) {
        //输出 ExampleA 、里氏代换原则[能使用父类型的地方一定能使用子类型]
        /*
        对于try里面发生的异常，他会根据发生的异常和catch里面的进行匹配(怎么匹配，按照catch块从上往下匹配)，
        当它匹配某一个catch块的时候，他就直接进入到这个catch块里面去了，后面在再有catch块的话，它不做任何处理，直接跳过去，全部忽略掉。
         */
        try {
            throw new ExceptionB();
        } catch (ExceptionA e) {
            System.out.println("ExampleA");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
