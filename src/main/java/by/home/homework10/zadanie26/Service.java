package by.home.homework10.zadanie26;

import java.util.ArrayList;
import java.util.List;

public class Service {
    ClassMark classMark = new ClassMark();

    public void getInfo(){
        for (int i = 0; i < classMark.marks.size(); i++ ){
            String info = classMark.studentName.get(i) + " - " + classMark.marks.get(i);
            System.out.println(info);
        }
    }

    public void getBadPupils(){
       List<Integer> oh = new ArrayList<>();
       classMark.marks.removeAll(classMark.getBadMarks());
       oh.addAll(classMark.marks);
       getInfo();
    }
}
