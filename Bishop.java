import java.util.*;

public class Bishop extends Pieces{

  public Bishop(int file, int rank, boolean col){
    super(file, rank, 3, col);
  }

  public boolean validMove(int file, int rank){
    return (file - this.getFile() != 0) && (Math.abs(this.getFile()-file) == Math.abs(this.getRank() - rank));
  }
}
