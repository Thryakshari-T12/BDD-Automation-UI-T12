package com.stsi.cbus.bdd.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {


    public static String getCurrentDateinMMDDYYFormat(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String getYesterdayDateMMDDYYFormat() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.minusDays(1));
    }


    public static String getFromDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.minusDays(1));
    }


    public static String getrandomNumberOnDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mmddyyhhmmss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.minusDays(1));
    }

    public static String getCurrenteMonthCalendarDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        String date1 =  dtf.format(now.plusMonths(9));
        String date =   String.format("%tm", now).replaceAll("^0", "") +"/"
                + String.format("%td", now).replaceAll("^0", "") + "/"
                + String.format("%ty", now).replaceAll("^0", "");

        return date;

    }



    public static String getFutureMonthCalendarDate(int month){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        now = now.plusMonths(month);
        String date =   String.format("%tm", now).replaceAll("^0", "") +"/"
                + String.format("%td", now).replaceAll("^0", "") + "/"
                + String.format("%ty", now).replaceAll("^0", "");

        return date;

    }


    public static String getCurrentDateAndTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        return dtf.format(now) + " AM";

    }

    public static String getFutureDateAndTime(int noOfMonths){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusMonths(noOfMonths));
        return dtf.format(now.plusDays(1)) + " AM";



    }

}
