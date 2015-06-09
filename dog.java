class Dog extends Animal {
  public Dog(Human owner) { super(owner); }

  @Override
  public void makeNoise() {
    System.out.println("woof");
  }

  @Override
  public boolean eat() {
    return true;
  }
}
