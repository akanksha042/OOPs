public class StaticKeyword {
    public static void main (String args[])
{
    Student s1 = new Student();
    s1.schoolName = "ASP";

    Student s2 = new Student();
    System.out.println(s2.schoolName);
    // ASP
    // though we haven't define schoolname for s2 still we get asp for second one
    // this is because of static keyword
    // jis variable ko static banaya hai agar usko koi bhi object use kare yaa
    // change kare toh woh sabke liye same hoga

    Student s3 = new Student();
    s3.schoolName = "DPS";
    System.out.println(s3.schoolName);



}    
}

class Student{
    static int returnPErcentage(int math, int chem, int phy){
        return (math+chem+phy / 3);
    }


    String name;
    int rollNo;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
