public class GetterAndSetter {
    public static void main(String args[]){
        Pen p1  =  new Pen();
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.gettip());
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        /*
         * even though our variables were in private
         * we still able to access it with the help og getter and setters
         
         */
    }}

    class Pen{
        private String color;
        private int tip;

        String getColor(){
            return this.color;
            //this ka mtlb current object

        }

        int gettip() {
            return this.tip;
            //this ka mtlb current object
        }

        void setColor(String newColor){
            color = newColor;

        }
        void setTip(int newTip){
            tip = newTip;
            //and agar hamare pass same variable name ho toh
            //this.tip = tip;
            // we can use this.tip for pen ki andar ki property  hai
            //jab ki tip for new tip
        }
    }
    

