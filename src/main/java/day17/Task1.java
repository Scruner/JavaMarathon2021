package day17;

public class Task1 {
  private static final ChessPiece PAWN_WHITE = null;
  private static final ChessPiece ROOK_BLACK = null;

  public static void main(String[] args) {
    ChessPiece[] array = {
      ChessPiece.PAWN_WHITE,
      ChessPiece.PAWN_WHITE,
      ChessPiece.PAWN_WHITE,
      ChessPiece.PAWN_WHITE,
      ChessPiece.ROOK_BLACK,
      ChessPiece.ROOK_BLACK,
      ChessPiece.ROOK_BLACK,
      ChessPiece.ROOK_BLACK
    };
   for(ChessPiece chessPiece: array) {
      System.out.print(chessPiece.getName() + " ");
   }
  }
}
