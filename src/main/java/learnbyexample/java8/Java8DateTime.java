package learnbyexample.java8;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Java8DateTime {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static void main(String[] args) throws Exception {

        long ttl;
        String ttlCont = "30";
        Object ttlval = "-5";
        String sinBinTtl = ttlval.toString();
        try {
            ttl = Integer.parseInt(sinBinTtl);
        } catch (NumberFormatException ex) {
            System.out.println("error");
            ttl = Integer.parseInt(ttlCont);
        }

        long ttl1 = TimeUnit.MINUTES.toSeconds(ttl);
        Math.signum(ttl);
        System.out.println("ttl1" + ttl1);
        boolean isPositive = Math.signum(ttl) == 1.0f;
        System.out.println("Math.signum(ttl)" + Math.signum(ttl));
        System.out.println("isPositive" + isPositive);


        String date = "20180215";
        LocalDateTime dt = LocalDateTime.now();
        Date sqlDate = new Date(simpleDateFormat.parse(date).getTime());
        System.out.println(date);
        System.out.println(dt);

        System.out.println(Timestamp.valueOf(dt));
        System.out.println(Timestamp.valueOf(sqlDate.toLocalDate().atStartOfDay()));

        Object ssaas = -1;
        long dff = (Integer) ssaas;
        System.out.println(dff);

        System.out.println("sqlDate" + sqlDate.toLocalDate());
        System.out.println("nasir" + LocalDateTime.now());
    }
}
