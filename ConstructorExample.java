public class ConstructorExample {
    public static  void main(String args[]){
        Student s2 = new Student();
        Student s1 = new Student("akanksha");
        System.out.println(s1.name);
        Student s3 = new Student(21);
        System.out.println(s3.roll);

    }
}

    class Student{
        String name ;
        int  roll;

        //Non parameterized constructor
        Student (){
            System.out.println("constructor is called 1  ...");
        }

        //parameterized Constructor
        Student(String name){
            System.out.println("constructor is called 2 .......");
            this.name =  name;
        }


        Student (int roll){
            this.roll = roll;

        }

        
    }


