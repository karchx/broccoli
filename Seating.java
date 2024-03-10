class Seating {
  private boolean busy;

  public Seating() {
    this.busy = false;
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
    return busy ? "X" : "O";
  }
}
