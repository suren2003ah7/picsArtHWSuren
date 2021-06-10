package com.company.lesson9;

public class StudentService {
    public static void printNames(Student[] students){
        for (Student h:students){
            System.out.println(h.getName());
        }
    }

    public static void printMaleStudents(Student[] students){
        for (Student h:students){
            if (h.getGender() == 'm'){
                h.printInfo();
            }
        }
    }

    public static void printBigBrainFemaleStudents(Student[] students){
        for (Student h:students){
            if (h.getGender() == 'f' && h.getMark() > 50.4){
                h.printInfo();
            }
        }
    }

    public static void minimalMarkStudent(Student[] students){
        Student s = students[0];
        for (int i = 1; i < students.length; i++){
            if (s.getMark() > students[i].getMark()){
                s = students[i];
            }
        }
        s.printInfo();
    }

    public static void biggestMale(Student[] students){
        Student s = null;
        for (int i = 0; i < students.length; i++){
            if (students[i].getGender() == 'm'){
                if (s == null){
                    s = students[i];
                    continue;
                }
                if (s.getYear() > students[i].getYear()){
                    s = students[i];
                }
            }
        }
        s.printInfo();
    }

    public static void sortByMark(Student[] arr){
        int x = 0;
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0; i < arr.length - 1 - x; i++){
                if (arr[i].getMark() > arr[i+1].getMark()){
                    Student z = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = z;
                    b = true;
                }
            }
            x++;
        }
        for (Student i:arr){
            i.printInfo();
        }
    }

    public static void sortFemaleByYear(Student[] arr1){
        int x = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i].getGender() == 'f'){
                count++;
            }
        }
        Student arr[] = new Student[count];
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i].getGender() == 'f'){
                arr[x] = arr1[i];
                x++;
            }
        }
        x = 0;
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0; i < arr.length - 1 - x; i++){
                if (arr[i].getYear() > arr[i+1].getYear()){
                    Student z = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = z;
                    b = true;
                }
            }
            x++;
        }
        for (Student i:arr){
            i.printInfo();
        }
    }
}
