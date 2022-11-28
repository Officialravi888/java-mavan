package org.example;
import java.util.ArrayList;
import java.util.List;
public class Generics {
    public static void main(String[] args) {
        System.out.println((method(2, 8, 5)));
    }
    static<T>List<T>method(T a1, T a2, T a3){
        List<T>list=new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a2);

        return list;
    }


}
