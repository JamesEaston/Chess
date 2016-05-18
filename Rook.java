public class Rook extends Pieces{

  public Rook(int file, int rank, boolean col){
    super(file, rank, 5, col);
  }

  public boolean validMove(int file, int rank){
    return this.getFile() != file | this.getRank() != rank;
  }

}
