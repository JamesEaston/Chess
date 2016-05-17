public abstract class  Pieces{

  //Position is stored in the format of [file, rank]
  private int[] coordinates;
  private int pointValue;
  //White = true, Black = false
  private boolean color;

  public Pieces(int file, int rank, int val, boolean col){
    coordinates = new int[2];
    coordinates[0] = file;
    coordinates[1] = rank;
    pointValue = val;
    color = col;
  }

  public abstract boolean validMove(int file, int rank);

  public int[] move(int file, int rank){
    coordinates[0] = file;
    coordinates[1] = rank;
    return coordinates;
  }

  public int getFile(){
    return coordinates[0];
  }

  public int getRank(){
    return coordinates[1];
  }
}
