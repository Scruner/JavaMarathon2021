package day17;

import java.util.Arrays;

public class ChessBoard {
  ChessPiece[][] arrChessFigures;

  public ChessBoard(ChessPiece[][] arrChessFigures) {
    this.arrChessFigures = arrChessFigures;
  }

  public void print() {
    for (ChessPiece[] arrChessFigure : arrChessFigures) {
      for (int j = 0; j < arrChessFigures.length; j++) {
        System.out.print(arrChessFigure[j].getName());
      }
      System.out.println();
    }
  }
}
