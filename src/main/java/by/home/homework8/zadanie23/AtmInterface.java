package by.home.homework8.zadanie23;

import java.io.IOException;

public interface AtmInterface {
    int addMoney(int giveMoney);
    int withdrawMoney(int takeMoney) throws IOException;
    void balance() throws IOException;
}
