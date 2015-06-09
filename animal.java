class Animal {
  private Human owner;
  private String species;

  public Animal(Human owner, String species) {
    this.owner = owner;
    this.species = species;
  }

  public String getSpecies() { return this.species; }
  public Human getOwner() { return this.owner; }

  /** returns true if we got something */
  public boolean eat() {
    if (this.getSpecies() == "cat") {
      if (this.owner.getGender() == "m") {
        // that's totally random
        return new java.util.Random().nextBoolean();
      } else if (this.owner.getGender() == "w") {
        if (this.owner.getAge() > 80) {
          // I bet she forgets
          return false;
        } else {
          return true;
        }
      }
    }
    else if (this.getSpecies() == "dog") {
      return true;
    }

    return false;
  }

  public void makeNoise() {
    if (this.getSpecies() == "cat") {
      System.out.println("purrr");
    }
    else if (this.getSpecies() == "dog") {
      System.out.println("woof");
    }
  }

  public static void main(String[] args) {
    Animal cat = new Animal(new Human("w", 30), "cat");
    cat.makeNoise();
    System.out.println("Does the cat get a meal? " + cat.eat());

    Animal dog = new Animal(new Human("m", 30), "dog");
    dog.makeNoise();
    System.out.println("Does the dog get a meal? " + dog.eat());
  }
}
