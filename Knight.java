import java.util.*;

public class Knight extends Pieces{

  public Knight(int file, int rank, boolean color){
    super(file, rank, 3, color);
  }

  public boolean validMove(int file, int rank){

    if ((Math.abs(this.getFile() - file) == 2) && (Math.abs(this.getRank() - rank) == 1)){
      return true;
    }
    if ((Math.abs(this.getFile() - file) == 1) && (Math.abs(this.getRank() - rank) == 2)){
      return true;
    }
    return false;
  }
}
