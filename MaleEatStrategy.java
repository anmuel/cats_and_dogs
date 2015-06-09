class MaleEatStrategy extends EatStrategy {
  @Override
  public boolean serve() {
    return new java.util.Random().nextBoolean();
  }
}
