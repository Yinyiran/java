public class BaseType {
  public static void main(String[] args) {
    // doubleFn();
    // charFn();
    // autoTransfer();
    array();
  }

  public static void doubleFn() {
    double pi = 3.14;
    double radius = 1.2;
    double area = pi * radius * radius;
    System.err.print("double: ");
    System.err.println(area);
  }

  public static void charFn() {
    char name = 'Y';
    char name2 = '\u0036'; // unicode
    System.err.print("char: ");
    System.err.println(name);
    System.err.print("name2: ");
    System.err.println(name2);
  }

  public static void autoTransfer() {
    byte b = 23;
    short s = 2333;
    int i = s + b;
    double d = i * b;
    byte b2 = (byte) d;
    System.err.println(d);
    System.err.println(b2);

    boolean b3 = true;
    String s3 = "hello";
    int i3 = 200;
    System.err.println(s3 + '-' + b3 + '-' + i3);
  }

  public static void array() {
    int[] arr = new int[10];
    int[] arr2 = new int[20];
    arr[0] = 1;
    System.err.println(arr[0]);
    System.err.println(arr2.length);
    int[] arr4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.err.println(arr4);
  }

}
