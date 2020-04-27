package by.home.homework8.zadanie23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBalanceCard {
    File file = new File("C:\\Users\\Артем\\Desktop\\balanceCard.txt");

    public void writeBalance() throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(22);
        fileOutputStream.close();


    }


    public void readBalance() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);

        fileInputStream.read();



        }

    }

