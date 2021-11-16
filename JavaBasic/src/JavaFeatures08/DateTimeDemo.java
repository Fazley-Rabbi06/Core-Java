package JavaFeatures08;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;

public class DateTimeDemo {
    void findDay(int year,int month,int day){
        LocalDate obj = LocalDate.of(year,month,day);;
        System.out.println(obj);



    }
    public static void main(String[] args) {
        DateTimeDemo obj =new DateTimeDemo();
        obj.findDay(2020,02,05);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        Instant i = Instant.now();
        System.out.println(i);
//        Instant x = Instant.now();
//        Duration d = Duration.between(i,x);
//        System.out.println(d);


    }
}
