package by.home.homework1;

public class Zadanie7 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        int a = 3;
        int b = 6;
        int c = 11;
        int d = 3;

        int e = 15;
        int f = 50;

        if((b + d) <= e && a <= f && c <= f){
            System.out.println("Houses have enough place");
        }else if((a + d) <= e && b <= f && c <= f){
            System.out.println("Houses have enough place");
        }else if((b + c) <= e && a <= f && d <= f){
            System.out.println("Houses have enough place");
        }else if((a + c) <= e && b <= f && d <= f){
            System.out.println("Houses have enough place");
        } else if((b + d) <= f && a <= e && c <= e){
            System.out.println("Houses have enough place");
        }else if((a + d) <= f && b <= e && c <= e){
            System.out.println("Houses have enough place");
        }else if((b + c) <= f && a <= e && d <= e){
            System.out.println("Houses have enough place");
        }else if((a + c) <= f && b <= e && d <= e){
            System.out.println("Houses have enough place");
        }else {
            System.out.println("Houses don't have enough place");
        }
        }
    }