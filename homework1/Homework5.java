class Homework5 {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        // t.hour = 13;
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 23)
            return;
        this.second = second;
    }
}
