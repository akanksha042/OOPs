public class Inheritance {
    /*
     * inheritance is when properties and methods of base/parent 
     * class are passed on to a derived/child class
     * we use extends keyword in order to use the properties and methods
     * of parent class.
     */
    public static void main (String args[]){
        // Dog vodafoneDog = new Dog();
        // vodafoneDog.eat();
        // vodafoneDog.breathe();
        // vodafoneDog.walk();
        // vodafoneDog.legs = 4;
        // vodafoneDog.breed = "VodafoneWalaDog";
        // System.out.println(vodafoneDog.legs);
        // System.out.println( vodafoneDog.breed);
        // System.out.println( vodafoneDog.color); //since we haven't set any color
        // //output will be null




        //lets check for hierarchial inheritance
        Mammals human = new Mammals();
        human.color = "brown";
        System.out.println(human.color);
        human.breathe();
        human.eat();
        human.walk();
        Birds chidiya = new Birds();
        chidiya.color = "white";
        System.out.println(chidiya.color);
        chidiya.fly();
        chidiya.eat();
        Fish shark  = new Fish();
        shark.color = "blue";
        System.out.println(shark.color);
        shark.eat();
        shark.swim();
        /* our output
brown
breathes
eats
walks
white
Fly
eats
blue
eats
Swim
         */



    }
    
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class of Animal (example of single level inheritance)
// class Dog extends Animal{
//     String breed;
    
//     void walk(){
//         System.out.println("walk on road");
//     }

//     void lick(){
//         System.out.println("licks");
//     }

// }

/*--------------------Multi level inheritance---------------------------------------------------------------------------------------------------------------- */
//derived class of Animal
// class Mammals extends Animal{
//     int legs;

// }
// //derived class of Mammals (example of multi level inheritance)
// class Dog extends Mammals{
//     String breed;
    
//     void walk(){
//         System.out.println("walk on road");
//     }

//     void lick(){
//         System.out.println("licks");
//     }

// }



/*-------------------------Hierarchial inheritance------------------------------------------------------------------------------------------------ */
//derived class of Animal
class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }

}

class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }

}


