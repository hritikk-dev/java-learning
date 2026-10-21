// java 25 code new version of java released in september 2026

// import java.util.Scanner;
// void main(){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter 2 numbers ");
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     IO.println(sum(a,b));
//     System.out.println(sum(a,b));
//     sc.close();
// }

// int sum(int a, int b){
//     return a+b;
// }

class Student{
    String name;
    int age;
    Student(){
        name = "Hritik";
        age = 20;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        IO.print(this.name + " ");
        IO.print(this.age + " ");
        IO.println();
    }
}

void main(){
    Student s1 = new Student("Shohan",15);
    Student s2= new Student();

    s2.display();
    s1.display();

    sum(1,2);

}

void sum(int a, int b){
    System.out.println(a+b);
}