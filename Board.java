public class Board{

  //In format of [file][rank]  
  private static Pieces[][] board;

  public Board(){
    board = new Pieces[8][8];
  }

  public static Pieces getCoordinate(int file, int rank){
    if (board[file][rank] instanceof Pieces){
      return board[file][rank];
    }
    return null;
  }

}
