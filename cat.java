class Cat extends Animal {
  public Cat(Human owner) { super(owner); }

  @Override
  public void makeNoise() {
    System.out.println("purrr");
  }

  @Override
  public boolean eat() {
    if (this.getOwner().getGender() == "m") {
        // that's totally random
        return new java.util.Random().nextBoolean();
    } else if (this.getOwner().getGender() == "w") {
      if (this.getOwner().getAge() > 80) {
         // I bet she forgets
        return false;
      } else {
        return true;
      }
    }

    return false;
  }
}
