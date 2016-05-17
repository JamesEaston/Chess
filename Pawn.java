public class Pawn extends Pieces{

  public Pawn(int file, int rank, boolean color){
    super(file, rank, 1, color);
  }

  public boolean validMove(int file, int rank){
    if(file == this.getFile() + 1){
      if (rank == this.getRank() + 1){
        if (Board.getCoordinate(file, rank) != null){
          //If the pawn is capturing, returns true
          return true;
        }
        //If the pawn tries to move diagonally, returns false
        return false;
      }
      //Because the Pawn is moving directly forward one space, returns true
      return true;
    }
    //Pawns can only advance forward, so if it isn't going forward, returns false
    return false;
  }

}
