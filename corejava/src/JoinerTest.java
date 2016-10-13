import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Joiner拼接字符串
 *
 * on()方法指定拼接符号
 * 三种格式的参数：迭代对象、数组、多个单一的拼接对象
 * skipNulls()方法指定当为空时跳过
 *
 * @author HaoQ
 */
public class JoinerTest {

    public static void main(String[] args) {
        JoinerTest j = new JoinerTest();
        j.test1();
        j.test2();
        j.test3();
        j.test4();
        j.test5();
    }

    /*
    Joiner.on(",").join(Iterator<> it);  迭代对象
     */
    private void test1(){
        List<String> list = Lists.newArrayList();
        for(int i=0;i<5;i++){
            list.add("element"+i);
        }

        String s = Joiner.on("-").join(list);
        System.out.println(s);
    }

    /*
    Joiner.on("-").join(Object[] obj);  数组
     */
    private void test2(){
        String[] stringArray = {"a","b","c"};
        String s = Joiner.on("-").join(stringArray);
        System.out.println(s);
    }

    /*
    Joiner.on("/").join(first,second,third...);  多个单一的拼接对象
     */
    private void test3(){
        String s = Joiner.on("-").join("1","2","3");
        System.out.println(s);
    }

    /*
    换类型
     */
    private void test4(){
        List<Integer> l = Lists.newArrayList(11,12,13);
        System.out.println(Joiner.on("-").join(l));
    }

    /*
    用skipNulls()方法指定当为空时跳过，不指定情况下为空则报错
     */
    private void test5(){
        List<String> l = Lists.newArrayList("21",null,"22");
        System.out.println(Joiner.on("-").skipNulls().join(l));
    }
}
