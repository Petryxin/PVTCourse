package by.home.homework8.zadanie22;

public class ServiceForTime {
    private int second;
    private int minute;
    private int hour;
    private int sumOfSeconds;
    private boolean resultOfCompare;
    public ServiceForTime (){
    }

    //constructor 1 - get all seconds
    public ServiceForTime(int sec) {
        second = sec;
    }

    //constructor 2 - get second-minute-hour
    public ServiceForTime(int h, int min, int sec){
        second = sec;
        minute = min;
        hour = h;
    }

    //method 1 - count all seconds in object
    public int allSeconds(){
        sumOfSeconds = (hour * 3600) + (minute * 60) + second;
        return sumOfSeconds;
    }

    //method 2 - compares two object how  compareTo in String
    public boolean compare (ServiceForTime o){
        if (o.allSeconds() == o.allSeconds()) {
            return resultOfCompare = true;
        }else{
            return resultOfCompare = false;
        }
    }

    //method 3 for output data
    public  void outputSumOfSeconds(){
        System.out.println("There are " + sumOfSeconds + " seconds");
    }

    //method 4 for output compare object
    public void outputCompareObjects(){
        if (resultOfCompare){
            System.out.println("Objects have the same amount of the seconds ");
        }else {
            System.out.println("Objects haven't the same amount of the seconds");
        }
    }
}
