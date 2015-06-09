abstract class Animal {
  private Human owner;

  public Animal(Human owner) {
    this.owner = owner;
  }

  public String getSpecies() { return this.getClass().getName().toLowerCase(); }
  public Human getOwner() { return this.owner; }

  /** returns true if we got something */
  public abstract boolean eat();

  public abstract void makeNoise();

  public static void main(String[] args) {
    Animal cat = new Cat(new Human("w", 30));
    cat.makeNoise();
    System.out.println("Does the " + cat.getSpecies() + " get a meal? " + cat.eat());

    Animal dog = new Dog(new Human("m", 30));
    dog.makeNoise();
    System.out.println("Does the " + dog.getSpecies() + " get a meal? " + dog.eat());
  }
}
