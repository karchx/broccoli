class Seating {
  private boolean busy;
  private int seatNumber;

  public Seating(int seatNumber) {
    this.busy = false;
    this.seatNumber = seatNumber;
  }

  public boolean isBusy() {
    return busy;
  }

  public void setBusy() {
    busy = true;
  }

  public void unsetBusy() {
    busy = false;
  }

  @Override
  public String toString() {
    return (busy ? "X" : "O") + " - " + seatNumber;
  }
}
