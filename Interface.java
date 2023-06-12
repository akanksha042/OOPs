public class Interface {
    public static void main(String args[]){
        Queen q1 = new Queen();
        q1.moves();
        King k1 = new King();
        k1.moves();

    }

    
}
//blueprint
interface ChessPlayer{
    //bydefault public 
    //can't write implementation in interface
    //because we have to implement abstraction
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal (in all 4 directions)");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left");
    }
}



class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal (By 1 Step)");
    }
}