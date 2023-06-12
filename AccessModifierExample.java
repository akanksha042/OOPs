public class AccessModifierExample {
    public static void main(String args[]){
        Bank myacc = new Bank();
        myacc.username = "Akanksha Srivastava";
        // myacc.password = "Secret"; 
        // //this will throw error 
        //as we tried to access something which is assigned as  private access modifier

        myacc.setPassword("Naruto");
        
    }}

    class Bank{
        public String username; //access by all
        private String password; //only acceessable within the class
        public void setPassword(String pwd){
            password = pwd;
            
        }
    }

