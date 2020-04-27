package by.home.homework8.zadanie24;

public class WaterVacuumCleaner extends VacuumCleaner {
    protected boolean water = false;
    public void onWater (){
        water = true;
    }
    public void offWater (){
        water = true;
    }
    public void waterWash(){
        if (water && state) {
            System.out.println("work with water");
        }else {
            System.out.println("Don't work with water ");
        }
    }

    public void on (){
        state = true;
    }
    public void off (){
        state = false;
    }


    public void printState(){
        if (state) {
            System.out.println("Work");
        }else {
            System.out.println("Don't work");
        }
    }
}
