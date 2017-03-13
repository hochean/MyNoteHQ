package charset;

import java.io.UnsupportedEncodingException;

/**
 * @author HaoQ
 */
public class CharsetConvert {

    public static void main(String[] args) {

        final String s1 = "你好";
        try {
            //GB2312 -> ISO-8859-1
            final String s2 = new String(s1.getBytes("GB2312"),"ISO-8859-1");
            System.out.println(s2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
