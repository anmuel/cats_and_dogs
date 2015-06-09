public class EatStrategy {
  public boolean serve() { return true; }

  public static EatStrategy fabricate(Human human) {
    java.util.Properties properties = StrategyConfiguration.getProperties();
    // m => male
    // f => female
    String gender = properties.getProperty(human.getGender().toLowerCase());
    int maxAge = Integer.parseInt(properties.getProperty("maxAge"));

    String className = capitalize(gender) + "EatStratgy";

    try {
      Class clazz = Class.forName(className);

      EatStrategy instance = null;
      return (EatStrategy)clazz.newInstance();
    } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
        return new EatStrategy(); // default
    }
  }

  private static String capitalize(String str) {
    return str.substring(0, 1).toUpperCase() +
      str.substring(1, str.length());
  }
}
