package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomizedClassAsDataType  {
    public static void main(String[] args) {
        List<Student> set=new ArrayList<>();
        set.add(new Student(1,"Saurabh"));
        set.add(new Student(3,"Ajay"));
        set.add(new Student(2, "Sakshi"));
        
        System.out.println("Before:"+set);
        // Collections.sort(set);
        Collections.sort(set,new Comparator<Student>(){
            @Override
    public int compare(Student o1,Student o2) {
        return o1.rollNo-o2.rollNo;
    }
        });
        System.out.println("After:"+set);
    }
}
