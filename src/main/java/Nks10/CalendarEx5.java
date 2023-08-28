package Nks10;

import java.util.Calendar;

public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2023, 7, 12);
        System.out.println(toStinrg(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println(toStinrg(date));
    }
    public static String toStinrg(Calendar date){
        return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "
        +date.get(Calendar.DATE) + "일";
    }
}
