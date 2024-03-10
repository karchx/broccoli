import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Project {
  public static void main(String[] args) throws IOException {
    Seating[][] seatings = new Seating[20][3];
  
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 3; j++) {
        seatings[i][j] = new Seating((i * 3) + j + 1);
      }
    }
   // seatings[0][0].setBusy();
   // seatings[1][1].setBusy();
   // seatings[2][2].setBusy();

    while(true) {
      printMenu();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int option;
      String optionRead = reader.readLine();
      option = Integer.parseInt(optionRead);
      selectOptionMenu(option, seatings);
      if (option == 0) break;
    }
  }

  public static void printCroquis(Seating[][] seatings) {
    System.out.println("Asientos del Tren");
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(seatings[i][j] + "|\t");
      }
      System.out.println();
    }
  }

  public static void printMenu() {
    System.out.println("0. Salir");
    System.out.println("1. Insertar");
    System.out.println("2. Ver asientos");
  }

  public static void selectOptionMenu(int option, Seating[][]seatings) throws IOException {
    switch (option) {
      case 1:
        printCroquis(seatings);
        System.out.println();
        System.out.println("Ingrese el numero de asientos a ocupar");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positionSeat = Integer.parseInt(reader.readLine());

        int row = calculatePositionRow(positionSeat);
        int column = calculatePositionColumn(positionSeat);

        seatings[row][column].setBusy();

        printCroquis(seatings);

        break;
      case 2:
        printCroquis(seatings);
        break;
      default:
        break;
    }
  }


  public static int calculatePositionRow(int seat) {
    return (seat - 1) / 3;
  }

  public static int calculatePositionColumn(int seat) {
    return (seat - 1) % 3;
  }
}
