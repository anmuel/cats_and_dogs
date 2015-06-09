class Cat extends Animal {
  public Cat(Human owner) {
    super(owner);
  }

  @Override
  public void makeNoise() {
    System.out.println("purrr");
  }
}
