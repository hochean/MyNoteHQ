package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author HaoQ
 */
public class FileTest {

    public static void main(String[] args) throws IOException {

        final Student student = Student.builder().age(20).name("haoqian").arr(new String[]{"a","b","c"}).build();

        final String filePath = "/Users/hochean/Downloads/hochean.txt";
        //final String filePath = "/Users/hochean/Downloads/aaa/hochean.txt";

        BufferedWriter bw = null;
        try {
            final File file = new File(filePath);
            if (!file.getParentFile().exists()) {
                boolean b = file.getParentFile().mkdirs();
                System.out.println("创建父目录: " + b);
            }
            if (file.exists()) {
                boolean b = file.delete();
                System.out.println("删除文件: " + b);
            } else {
                //file.mkdirs();
                boolean b = file.createNewFile();
                System.out.println("创建文件: " + b);
            }
            bw = new BufferedWriter(new FileWriter(file, true));
            //bw.write("hochean is a beauty\n哈哈哈");
            bw.write(student.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }

    }
}
