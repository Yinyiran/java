### 基础数据类型

1. 整型：
   byte(-128~127) 1 个字节
   short(-32768~32767) 2 个字节
   int(-2147483648~2147483647) 4 个字节
   long(-9223372036854775808~9223372036854775807) 8 个字节 (数字后面需要跟 L)
2. 浮点型：
   float (4 字节) (数字后面需要跟 F)
   double (8 字节) (精度不高，数据相乘会产生误差， 推荐 bigdecimal)
3. 字符型：char （2 字节）
   一个字符（'a'）；Unicode 编码（\u0000~ \uffff），转义字符（\n \t）
4. 布尔型：boolean

### 基本数据类型变量间的运算规则

1.  自动类型提升
    容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型。（不是占用内存的大小，而是指数据的范围大小）
    byte short --> int --> long --> float --> double
    注意；byte short 变量之间的运算，结果是 init
2.  强制类型转换

### 引用数据类型

1. 数组：
   int[] arr = new int[10];
   int[] arr2 = {1, 2, 3, 4, 5};
2. 集合：
   List<Integer> list = new ArrayList<>();
   Set<Integer> set = new HashSet<>();
   Map<String, Integer> map = new HashMap<>();
3. 类：
   class Person {
   String name;
   int age;
   }
4. 接口：
   interface Person {
   void eat();
   }
5. 字符串型：String
   无法转换成基础数据类型

### 常量

1. 定义常量：const int MAX_COUNT = 100;
2. 常量的作用域：全局常量、局部常量、类常量、方法常量
3. 常量的分类：编译期常量、运行期常量
4. 常量的赋值：编译期常量赋值、运行期常量赋值
