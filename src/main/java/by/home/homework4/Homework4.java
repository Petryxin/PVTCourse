package by.home.homework4;

public class Homework4 {
    public static void main(String[] args) {
        //Zadanie 18 + this code counts oll symbol
        String text = "Сочинение? На свободную тему!- было не о чем:'кот - собака' украл сосиску; а собака - кот смотрел" +
                " Что дальше ().";
        int sumSymbol = 0;
        char[] symbol;
        symbol = text.toCharArray();
        int i = 0;
        while (i < symbol.length) {
            if ((symbol[i] > 32 && symbol[i] < 48) || (symbol[i] > 57 && symbol[i] < 65)) {
                sumSymbol++;
            } else if ((symbol[i] > 90 && symbol[i] < 97) || (symbol[i] > 122 && symbol[i] < 127)) {
                sumSymbol++;
            } else if ((symbol[i] > 127 && symbol[i] < 184) && (symbol[i] > 184 && symbol[i] < 188)) {
                sumSymbol++;
            }
            i++;
        }
        System.out.println(sumSymbol);

        //Zadanie 19

        String text1 = " В  голевуде хорошо, дома лучше, но лучше всего у бабушки . ";
        int sumOfWord = 0;
        for (int s = 0; s < text1.length(); s++) {
            if (text1.charAt(s) != ' ' && text1.charAt(s) != ',' && text1.charAt(s) != '.') {
                if (s != text1.length() - 1) {
                    if (text1.charAt(s + 1) == ' ' || text1.charAt(s + 1) == ',' || text1.charAt(s + 1) == '.') {
                        sumOfWord++;
                    }
                }
            }
        }
        System.out.println(sumOfWord);

        //Zadanie 20

        String compositeText = "";
        for (int s = 0; s < text1.length(); s++) {
            if (text1.charAt(s) != ' ' && text1.charAt(s) != ',' && text1.charAt(s) != '.') {
                if (s != text1.length() - 1) {
                    if (text1.charAt(s + 1) == ' ' || text1.charAt(s + 1) == ',' || text1.charAt(s + 1) == '.') {
                        compositeText += text1.charAt(s);
                    }
                }
            }
        }
        System.out.println(compositeText);
        }
    }