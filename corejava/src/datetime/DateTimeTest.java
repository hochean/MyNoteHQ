package datetime;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author HaoQ
 */
public class DateTimeTest {

    public static void main(String[] args) {

        //***获取年月日小时分钟秒***//

        System.out.println("年月日 小时 分钟 秒");
        //Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        //月会比真实月份少1，从0开始=_=
        System.out.println(calendar.get(Calendar.MONTH));//0-11
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        System.out.println("--------------------");

        //Java8
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());//1-12
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        System.out.println("------------------");
        //***取得从1970年1月1日0时0分0秒到现在的毫秒数***//
        System.out.println("1970年1月1日0时0分0秒到现在的毫秒数");

        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(Clock.systemDefaultZone().millis());

        System.out.println("-----------------");
        //****取得当月的最后一天***//
        System.out.println("当月的最后一天");

        Calendar time = Calendar.getInstance();
        System.out.println(time.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println("-----------------");
        //***格式化日期***//
        /*
        利用java.text.DataFormat 的子类（如SimpleDateFormat类）中的format(Date)方法可将日期格式化。
        Java 8中可以用java.time.format.DateTimeFormatter来格式化时间日期
        */
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = new Date();
        System.out.println(oldFormatter.format(date1));

        // Java 8
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(newFormatter));

        System.out.println("-----------------");
        //***昨天的当前时刻***//
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
        System.out.println("++++");
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
        System.out.println("-----------------");

    }
}
