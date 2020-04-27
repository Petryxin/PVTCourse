package by.home.homework8.zadanie24;

public abstract class Appliances implements HouseholdAppliances {
    private int cost;
    private int manufacturer;
    private int guarantee;
    private int lifeTime;
    abstract void printState ();

    public void off() {

    }

    public void on() {

    }

    public int getCost() {
        return cost;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
}
