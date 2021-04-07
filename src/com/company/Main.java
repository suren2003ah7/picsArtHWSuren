package com.company;
import com.company.lesson4.Lesson4;
import com.company.lesson4.Cat;
public class Main {

    public static void main(String[] args) {
        Lesson4 test =  new Lesson4();
        test.Sort();

        Cat barsik = new Cat();
        barsik.setName("Barsik");
        barsik.setLength(21);
        barsik.setGender('M');
        System.out.println();
        System.out.println("Name: " + barsik.getName());
        System.out.println("Age: " + barsik.getAge());
        System.out.println("Length: " + barsik.getLength());
        System.out.println("Gender: " + barsik.getGender());
        System.out.println("Hungry? " + barsik.isHungry());
        barsik.speak();
    }
}
