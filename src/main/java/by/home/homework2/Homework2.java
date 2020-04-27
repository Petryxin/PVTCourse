package by.home.homework2;

public class Homework2 {
    public static void main(String[] args) {
        //Tasks 8
        long p = 1L;
        long s = 1L;
        while (s <= 3) {
            p *= s;
            s++;
        }
        System.out.println(p);

        //Task 10
        int a = 1234;
        int b;
        int sum = 0;
        while (a != 0){
            sum += a % 10;
            a = a / 10;
        }
        System.out.println(sum);

        // Task 11
        int i;
        int n = 133; //check's value
        int j = 0;
        for(i = 2; i * i <= n; i++){
            if(n % i == 0 ) {
                j = j + 1;
                System.out.println("число "+ n + " составное");
                break;
            }
        }
        if (j != 1) {
            System.out.println("число " + n + " простое");
        }


    }
}
