package by.home.homework8.zadanie22;

public class MainForTime {
    //create object 1. Input format -  second-minute-hour
    //create object 2. - //-
    //create object 3. Input format -  only seconds
    public static void main(String[] args) {
        ServiceForTime time1 = new ServiceForTime(4, 6,7);
        ServiceForTime time2 = new ServiceForTime(5,6,7);
        ServiceForTime time3 = new ServiceForTime(56);
        time1.allSeconds();
        time1.outputSumOfSeconds();
        time2.allSeconds();
        time2.outputSumOfSeconds();
        time1.compare(time2);
        time1.outputCompareObjects();

    }
}
