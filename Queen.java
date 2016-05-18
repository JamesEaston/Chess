import java.util.*;

public class Queen extends Pieces{

  public Queen(int file, int rank, boolean col){
    super(file, rank, 9, col); 
  }

  public boolean validMove(int file, int rank){
    //We must ensure the queen moves
    if (this.getFile() != file || this.getRank() != rank){
      //If the queen moves straight along a file or rank, returns true
      if(this.getFile() == file){
        return true;
      }
      if(this.getRank() == rank){
        return true;
      }
      //If the rank and file change the same amount, aka she moved along a diagonal, return true
      if(Math.abs(file - this.getFile()) == Math.abs(rank - this.getRank())){
        return true;
      }
    }
    //If the queen doesn't move or her movement is invalid, return false
    return false;
  }
}
