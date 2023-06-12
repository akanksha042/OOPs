

public class CopyConstructor {
    public static void main(String args[])
{
    Student s1 = new Student();
    s1.name = "akanksha";
    s1.roll = 042;
    s1.password = "unknown";
    s1.marks[0] = 100;
    s1.marks[1] = 80;
    //s1.marks[2] = 50;
    //after copying s1 to s2 
    //i am changing the value of s1 marks
    //lets see does this reflect in s2 or not
    s1.marks[2] = 90;
    //it gets reflected cause we use this function 
    //which use referenece of the array 
    //pura array use nhi hua we use the reference of that array  



    Student s2 = new Student(s1);
    s2.password = "known";



    for(int i=0 ; i<3 ; i++){
        System.out.println(s2.marks[i]);
    }

}    
    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    //normal constructor
    Student(){
        marks = new int [3];
        System.out.println("constructor called here.....");

    }

}
