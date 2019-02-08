package time;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Example {

    public static void main(String[] args) {
        long day = TimeUnit.DAYS.convert(Duration.ofHours(24));
        System.out.println(day == 1);

        // 1 天
        System.out.println(TimeUnit.DAYS.convert(Duration.ofHours(26)));

        // 1 分钟
        System.out.println(TimeUnit.MINUTES.convert(Duration.ofSeconds(60)));
    }

}
