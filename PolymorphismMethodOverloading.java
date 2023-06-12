public class PolymorphismMethodOverloading {
    public static void main (String args[]){
       Calculator s1 = new Calculator();
        System.out.println(s1.sum(5+5, 1));
        System.out.println(s1.sum(12.5f, 12.2f));
        System.out.println(s1.sum(5, 10, 15));

        /* output
11
24.7
30 
*/

    }
}

    class Calculator{
        int sum(int a, int b){
            return a+ b;
        }
        float sum(float a, float b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+ b + c;
        }
    }
    

