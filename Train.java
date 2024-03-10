class Train {

  private Seating[][] seatings;

  public Train(Seating[][] seatings) {
    System.out.println("---------------------------------");
    System.out.println("TREN PROGRAMA");
    System.out.println("---------------------------------");
    this.seatings = seatings;
  }

  public int calculatePositionRow(int seat) {
    return (seat - 1) / 3;
  }

  public int calculatePositionColumn(int seat) {
    return (seat - 1) % 3;
  }

  public void setSeatingWithBusy(int row, int column) {
    Seating seating = this.seatings[row][column];

    if(!seating.isBusy()) {
      this.seatings[row][column].setBusy();
    } else {
      System.out.println("El asiento ya se encuentra ocupado");
    }
  }
}
