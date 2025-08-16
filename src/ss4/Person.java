package ss4;

import java.util.Scanner;

public class Person {

    private String name; // proteced
    private int age;

    public  Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 public void input(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhập vào tên: ");
     setName(sc.nextLine());

     System.out.println("Nhập vào tuổi: ");
     setAge(Integer.parseInt(sc.nextLine()));

 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
