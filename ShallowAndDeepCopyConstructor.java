public class ShallowAndDeepCopyConstructor {


   
    public static void main(String args[])
{
    Student s1 = new Student();
    s1.name = "akanksha";
    s1.roll = 042;
    s1.password = "unknown";
    s1.marks[0] = 100;
    s1.marks[1] = 80;
    s1.marks[2] = 50;
    //after copying s1 to s2 
    //i am changing the value of s1 marks
    //lets see does this reflect in s2 or not
    // we will use deep copy
    
 



    Student s2 = new Student(s1);
    s2.password = "known";
    s1.marks[2] = 90;
    //here we can't see any changes because of deep copy constructor



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

    //shallow copy constructor 
    /* 
     * ismai changes reflect hote hai s2 mai 
     */
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }


    //deep copy constructor
    /*
     * ismai hum naya obj create karenge 
     * and because of that changes will not reflect in s2 
     */
    Student(Student s1){
        marks  = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i=0 ; i<marks.length ;i++){
            this.marks[i] = s1.marks[i];

        }
       
    }

    //normal constructor
    Student(){
        marks = new int [3];
        System.out.println("constructor called here.....");

    }

}


