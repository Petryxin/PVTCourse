package by.home.homework8.zadanie24;

public class RobotVacuumCleaner extends VacuumCleaner {

    public void on (){
        state = true;
    }
    public void off (){
        state = false;
    }


    @Override
    void waterWash() {

    }

    public void printState(){
        if (state) {
            System.out.println("Work");
        }else {
            System.out.println("Don't work");
            }
        }
    }

