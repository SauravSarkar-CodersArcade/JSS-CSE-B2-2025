package CollectionsFramework;// Java Program to check the size
class Main {
  public static void main(String[] args) {

    int number = 44;
    String size = switch (number) {
      case 29 -> "Small";
      case 42 -> "Medium";
      case 44 -> "Large";
      case 48 -> "Extra Large";
      default -> "Unknown";
    };
    System.out.println("Size: " + size);
  }
}