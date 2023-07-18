package NKs7;

public class TimeTest {
    public static void main(String[] args) {
        Times t = new Times(12, 35, 30);
        System.out.println(t);
//        t.hour = 13; // 에러! 변수 hour의 접근 제어자가 private이므로 접근 불가
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}

class Times {
    private int hour, minute, second;

    Times(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
