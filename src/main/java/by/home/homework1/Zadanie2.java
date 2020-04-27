package by.home.homework1;

public class Zadanie2 {
    public static void main(String[] args) {

        int s = 1030700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int sut = (h - hour) / 24;
        int sutok = sut % 7;
        int week = (sut - sutok) / 7;
        System.out.println(week + " недель " + sutok + " суток "  + hour + " часов " + min + " минут " + sec + " секунд ");
    }

}
