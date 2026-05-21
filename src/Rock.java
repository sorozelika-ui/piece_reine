import javax.swing.text.Position;

public class Rock {
    boolean isValidMove(Position newPosition){
        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }
}
