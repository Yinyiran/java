import java.math.BigDecimal;

public class Identity {
  public static void main(String[] args) {
    int a = 10;
    if (a == 10) {
      System.out.println("a is equal to 10");
    }
    // byte by = 127;
    double b = 10.0;
    float flo = 11.0f;
    System.err.println(flo);
    if (b == 10.0) {
      System.out.println("b is equal to 10.0");
    }

    BigDecimal c = new BigDecimal("10.021561315");
    System.err.println(c);
    char chars = '男';
    String str = "lalalalalllalallal你好啊但是吧潍坊";
    System.err.println(chars);
    System.err.println(str);
  }

  /**
   * 基本类型： 整型 byte short int long 浮点 float double 字符 char 布尔 boolean
   * 
   * 引用类型： 类 class 数组 array 接口 interface 枚举 enum
   */

}
