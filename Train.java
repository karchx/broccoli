class Train {

  public Train() {
    System.out.println("---------------------------------");
    System.out.println("TREN PROGRAMA");
    System.out.println("---------------------------------");
  }

  public int calculatePositionRow(int seat) {
    return (seat - 1) / 3;
  }

  public int calculatePositionColumn(int seat) {
    return (seat - 1) % 3;
  }
}
