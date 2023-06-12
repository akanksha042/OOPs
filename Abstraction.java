public class Abstraction {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eats();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.eats();
        c1.walk();
// output
// eats
// walk on 4 legs
// eats
// walks of 2 legs

// Animal a1 = new Animal();
//it will give error
//as we used abstract keyword in front og our class we can't create any object of animal class





//lets print color of horse
System.out.println(h1.color);
//we get brown as op because jab bhi object banega parent class
// // System.out.println(h1.changeColor());
// h1.changeColor();




//lets make a mustang object
Mustang h2 = new Mustang();
//Animal -> Horse -> Mustang 

    }
    
}
//cannot create an object of animal class because of abstract keyword
abstract class Animal{
    String color;
//we can make constructor in abstraction class
//here until we haven't call the colorchange function the default color of
// all animals will be brown itself
    Animal(){
        System.out.println("animal constructor called.....");
        // color = "brown";
    }
    void eats(){
        System.out.println("eats");
    }
    //gives idea about function
    //don't provide implementation of function  in this function
    //we will provide implementation in futher subclasses
    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor callled .......");
    }
    void changeColor(){
        System.out.println("Dark Brown");
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks of 2 legs");
    }
}


class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
