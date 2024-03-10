import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Project {
  public static void main(String[] args) throws IOException {
    Seating[][] seatings = new Seating[20][3];
  
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 3; j++) {
        seatings[i][j] = new Seating();
      }
    }
    seatings[0][0].setBusy();
    seatings[1][1].setBusy();
    seatings[2][2].setBusy();

    while(true) {
      printMenu();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int option;
      String optionRead = reader.readLine();
      option = Integer.parseInt(optionRead);
      selectOptionMenu(option);
      if (option == 0) break;
    }
    //printCroquis(seatings);

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
  }

  public static void selectOptionMenu(int option) {
    switch (option) {
      case 1:
        System.out.println("Inserta");
        break;
      case 0:
        break;
      default:
        break;
    }
  }
}
