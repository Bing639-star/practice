//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
//public class Main {
//    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
//            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
//            System.out.println("i = " + i);
//        }




//        //var 关键字，可以在局部变量声明时自动推断变量类型，从而简化代码。
//        int a = 10;
//         //如果需要改成其他类型，前面的int也得跟着改
//        var a = 10;
//       // 用var关键字来根据后面的结果自动识别




     //位运算符包括：& | ^ ~
//        public static void main(String[] args) {
//            int a = 9, b = 3;
//            int c = a & b;    //进行按位与运算
//            System.out.println(c);
//        }

//        public static void main(String[] args) {
//            int a = 9, b = 3;
//            int c = a | b;
//            System.out.println(c);
//    }
//
//        public static void main(String[] args) {
//            int a = 9, b = 3;
//            int c = a ^ b;
//            System.out.println(c);
//    }
//
//        public static void main(String[] args) {
//            byte c = ~127;
//            System.out.println(c);
//    }
//
//        public static void main(String[] args) {
//            byte c = 8 >> 2;
//            System.out.println(c);
//        }
//
//        public static void main(String[] args) {
//            byte c = -4 >> 1;
//            System.out.println(c);
//    }
//
////    左移操作<<： 高位直接丢弃，低位补0
////    右移操作>>： 低位直接丢弃，符号位是什么高位补什么
//
//    public static void main(String[] args) {
//        int c = -1 >> 1;   //正常的右移操作，高位补1，所以说移了还是-1
//        System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        int c = -1 >>> 1;   //无符号右移是三个大于符号连在一起，移动会直接考虑符号位
//        System.out.println(c);
//    }
//
//    //可以缩写：
//    public static void main(String[] args) {
//        int c = -1;
//        c = c << 2;
//        System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        int c = -1;
//        c <<= 2;    //直接运算符连上等号即可，跟上面是一样的
//        System.out.println(c);
//    }


// 优先级	运算符	                         结合性
//1	( )	                                    从左向右
//2	~ - + (强制类型转换) ++ --	            从右向左
//3	* / %	                                从左向右
//4	+ -	                                    从左向右
//5	<< >> >>>	                             从左向右
//6	&	                                    从左向右
//7	^	                                    从左向右
//8	|	                                    从左向右
//9	= += -= *= /= %= &= |= ^= <<= >>= >>>=	从右向左


//        public static void main(String[] args) {
//            int score =  2;
//            if(score >= 90)    //90分以上才是优秀
//                System.out.println("优秀");
//            else if (score >= 70)    //当上一级if判断失败时，会继续判断这一级
//                System.out.println("良好");
//            else if (score >= 60)
//                System.out.println("及格");
//            else    //当之前所有的if都判断失败时，才会进入到最后的else语句中
//                System.out.println("不及格");
//        }
//
//        public static void main(String[] args) {
//            char c = 'A';
//            switch (c) {  //这里目标就是变量c
//                case 'A':    //分别指定ABC三个匹配值，并且执行不同的代码
//                    System.out.println("去尖子班！准备冲刺985大学！");
//                    break;   //执行完之后一定记得break，否则会继续向下执行下一个case中的代码
//                case 'B':
//                    System.out.println("去平行班！准备冲刺一本！");
//                    break;
//                case 'C':
//                    System.out.println("去职高深造。");
//                    break;
//            }
//
//            switch (目标) {
//                case: ...
//                default:
//                   // 其他情况下执行的代码
//            }
//
//            int score = 9;
////直接让grade接受switch的结果
//            char grade = switch (score) {
//                case 10, 9 -> 'A';   //case后面直接使用->来指定返回结果
//                case 8 -> 'B';
//                case 6, 7 -> 'C';  //当存在多个匹配条件时，使用逗号分隔
//                default -> 'D';
//            };  //别忘了这种写法相当于赋值，最后需要加分号
//            System.out.println("学生等级为: " + grade);
//
//
//            char grade = switch (score) {
//                case 9 -> 'A';
//                case 8 -> 'B';
//                case 6, 7 -> {
//                    System.out.println("我是额外操作");   //存在前置操作，无法直接指定结果
//                    yield 'C';   //在最后使用yield关键字来指定结果
//                }
//                default -> 'D';
//            };
//
//
//            for (int i = 0; i < 3; i++) {
//                System.out.println("伞兵一号卢本伟准备就绪！");
//                System.out.println("当前i的值为："+i);
//            }
//
//                    for (int i = 0; i < 3; i++) {
//                        System.out.println("伞兵一号卢本伟准备就绪！");
//                        System.out.println("当前i的值为："+i);
//                    }
//
//            public static void main(String[] args) {
//                for (;;)   //如果什么都不写，相当于没有结束条件，这将会导致无限循环
//                    System.out.println("伞兵一号卢本伟准备就绪！");
//            }
//     //while循环
//            public static void main(String[] args) {
//                int i = 100;   //比如现在我们想看看i不断除以2得到的结果会是什么，但是循环次数我们并不明确
//                while (i > 0) {   //现在唯一知道的是循环条件，只要大于0那么就可以继续除
//                    System.out.println(i);
//                    i /= 2;   //每次循环都除以2
//                }
//            }
//
//            //do-while语句
//            public static void main(String[] args) {
//                int i = 0;
//                do {  //无论满不满足循环条件，先执行循环体里面的内容
//                    System.out.println("Hello World!");
//                    i++;
//                } while (i < 10);   //再做判断，如果判断成功，开启下一轮循环，否则结束
//            }
//
//
//
//     //类与对象
//            public class Person {   //这里定义的人类具有三个属性，名字、年龄、性别
//                String name;   //直接在类中定义变量，表示类具有的属性
//                int age;
//                String sex;
//            }
//
//
//            public static void main(String[] args) {
//                new Person();   //我们可以使用new关键字来创建某个类的对象，注意new后面需要跟上 类名()
//                //这里创建出来的，就是一个具体的人了
//            }

          //对象的使用

//            public static void main(String[] args) {
//                //这里的a存放的是具体的某个值
//                int a = 10;
//                //创建一个变量指代我们刚刚创建好的对象，变量的类型就是对应的类名
//                //这里的p存放的是对象的引用，而不是本体，我们可以通过对象的引用来间接操作对象
//                Person p = new Person();
//            }



//                public static void main(String[] args) {
//                    Person p1 = new Person();
//                    Person p2 = p1;
//                }


//            public static void main(String[] args) {
//                Person p1 = new Person();
//                Person p2 = p1;
//                System.out.println(p1 == p2);    //使用 == 可以判断两个变量引用的是不是同一个对象
//            }

//                public static void main(String[] args) {
//                Person p1 = new Person();   //这两个变量分别引用的是不同的两个对象
//                Person p2 = new Person();
//                System.out.println(p1 == p2);   //如果两个变量存放的是不同对象的引用，那么肯定就是不一样的了
//                }

//                public static void main(String[] args) {
//                    Person p1 = new Person();
//                    Person p2 = new Person();
//                    p1.name = "小明";   //这个修改的是第一个对象的属性
//                    p2.name = "大明";   //这里修改的是第二个对象的属性
//                    System.out.println(p1.name);  //这里我们获取的是第一个对象的属性
//                }

//                public static void main(String[] args) {
//                    Person p = null;   //此时变量没有引用任何对象
//                    p.name = "小红";   //我任性，就是要操作
//                    System.out.println(p.name);
//                }

//                    public static void main(String[] args) {
//                        Person p = new Person();
//                        System.out.println("name = "+p.name);
//                        System.out.println("age = "+p.age);
//                        System.out.println("sex = "+p.sex);
//                    }


//                    public static void main(String[] args) {
//                        Person p = new Person();
//                        p.name = "小明";
//                        p.age = 18;
//                        p.hello();    //我们只需要使用 . 运算符，就可以执行定义好的方法了，只需要 .方法名称() 即可
//                    }


//                    int sum(int a, int b){
//                        int c = a + b;
//                        return c;   //return后面紧跟需要返回的结果，这样就可以将计算结果丢出去了
//                        //带返回值的方法，是一定要有一个返回结果的！否则无法通过编译！
//                    }
//
//
//                    public static void main(String[] args) {
//                        Person p = new Person();
//                        p.name = "小明";
//                        p.age = 18;
//                        int result = p.sum(10, 20);    //现在我们要让这个对象帮我们计算10 + 20的结果
//                        System.out.println(result);    //成功得到30，实际上这里的println也是在调用方法进行打印操作
//                    }
//
//
//                    void modify(Person person){
//                        person.name = "lbwnb";   //修改对象的名称
//                    }
//
//                    public static void main(String[] args) {
//                        Person p = new Person();
//                        p.name = "小明";     //先在外面修改一次
//                        p.modify(p);        //调用方法再修改一次
//                        System.out.println(p.name);    //最后name会是lbwnb
//                    }
//
//                           //用类型的变量，仅仅存放的是对象的引用，而不是对象本身
//
//
//                    public static void main(String[] args) {
//                        Person p = new Person();
//                        //当方法出现多个重载的情况，在调用时会自动进行匹配，选择合适的方法进行调用
//                        System.out.println(p.sum(1.5, 2.2));
//                    }
//
//                    //静态变量和静态方法
//
//                    public static void main(String[] args) {
//                        Person p1 = new Person();
//                        Person p2 = new Person();
//                        p1.info = "你";
//                        System.out.println(p2.info);   //可以看到，由于静态属性是属于类的，因此无论通过什么方式改变，都改变的是同一个目标
//                    }
//
//                    static void test(){
//                        System.out.println("我是静态方法");
//                    }
//
//                    static String info;
//
//                    static void test(){
//                        System.out.println("静态变量的值为："+info);
//                    }
//
//                    static String info;
//
//                    static {   //静态代码块可以用于初始化静态变量
//                        info = "测试";
//                    }
//
//                    public class Person {
//                        String name = test();  //这里我们用test方法的返回值作为变量的初始值，便于观察
//                        int age;
//                        String sex;
//
//                        {
//                            System.out.println("我是普通代码块");
//                        }
//
//                        Person(){
//                            System.out.println("我是构造方法");
//                        }
//
//                        String test(){
//                            System.out.println("我是成员变量初始化");
//                            return "小明";
//                        }
//
//                        static String info = init();   //这里我们用init静态方法的返回值作为变量的初始值，便于观察
//
//                        static {
//                            System.out.println("我是静态代码块");
//                        }
//
//                        static String init(){
//                            System.out.println("我是静态变量初始化");
//                            return "test";
//                        }
//                    }
//
//                    访问权限控制
//                    private - 私有，标记为私有的内容无法被除当前类以外的任何位置访问。
//                    什么都不写 - 默认，默认情况下，只能被类本身和同包中的其他类访问。
//                    protected - 受保护，标记为受保护的内容可以能被类本身和同包中的其他类访问，也可以被子类访问（子类我们会在下一章介绍）
//                    public - 公共，标记为公共的内容，允许在任何地方被访问。
//
//                    类的封装
//                    public class Person {
//                        private String name;    //现在类的属性只能被自己直接访问
//                        private int age;
//                        private String sex;
//
//                        public Person(String name, int age, String sex) {   //构造方法也要声明为公共，否则对象都构造不了
//                            this.name = name;
//                            this.age = age;
//                            this.sex = sex;
//                        }
//
//                        public String getName() {
//                            return name;    //想要知道这个对象的名字，必须通过getName()方法来获取，并且得到的只是名字值，外部无法修改
//                        }
//
//                        public String getSex() {
//                            return sex;
//                        }
//
//                        public int getAge() {
//                            return age;
//                        }
//                    }
//
//                    public class Person {
//                        private String name;
//                        private int age;
//                        private String sex;
//
//                        private Person(){}   //不允许外部使用new关键字创建对象
//
//                        public static Person getInstance() {   //而是需要使用我们的独特方法来生成对象并返回
//                            return new Person();
//                        }
//                    }
//                    封装思想其实就是把实现细节给隐藏了，外部只需知道这个方法是什么作用，而无需关心实现，要用什么由类自己来做，不需要外面来操作类内部的东西去完成，封装就是通过访问权限控制来实现的。
//
//                    类的继承
//                    在定义其他子类时可以继承自该父类，减少代码的重复定义，子类可以使用父类中非私有的成员。
//
//                    public class Worker extends Person{    //工人类
//
//                    }
//
//                    public class Student extends Person{
//                        public void study(){
//                            System.out.println("我的名字是 "+name+"，我在学习！");   //可以直接访问父类中定义的name属性
//                        }
//                    }
//
//                    public class Person {
//                        String name;
//                        int age;
//                        String sex;
//
//                        public void hello(){
//                            System.out.println("我叫 "+name+"，今年 "+age+" 岁了!");
//                        }
//                    }
//
//                    public static void main(String[] args) {
//                        Student student = new Student();
//                        student.study();    //子类不仅有自己的独特技能
//                        student.hello();    //还继承了父类的全部技能
//                    }
//
//                    枚举类
//
//                    public class Student extends Person implements Study {
//
//                        private String status;   //状态，可以是跑步、学习、睡觉这三个之中的其中一种
//
//                        public String getStatus() {
//                            return status;
//                        }
//
//                        public void setStatus(String status) {
//                            this.status = status;
//                        }
//                    }
//
//                    public enum Status {   //enum表示这是一个枚举类，枚举类的语法稍微有一些不一样
//                        RUNNING, STUDY, SLEEP;    //直接写每个状态的名字即可，最后面分号可以不打，但是推荐打上
//                    }
//
//                    public enum Status {
//                        RUNNING("睡觉"), STUDY("学习"), SLEEP("睡觉");   //无参构造方法被覆盖，创建枚举需要添加参数（本质就是调用的构造方法）
//
//                        private final String name;    //枚举的成员变量
//                        Status(String name){    //覆盖原有构造方法（默认private，只能内部使用！）
//                            this.name = name;
//                        }
//
//                        public String getName() {   //获取封装的成员变量
//                            return name;
//                        }
//                    }
//
//                    密封类的作用就是限制类的继承
//
//                    public final class A{   //添加final关键字后，不允许对此类继承
//
//                    }
//
//                    public sealed class A permits B{
//                    //在class关键字前添加sealed关键字，表示此类为密封类型，permits后面跟上允许继承的类型，多个子类使用逗号隔开
//
//                    }
//
//                    public [final/sealed/non-sealed] class 子类 extends 父类 {   //必须继承自父类
//                        //final类型：任何类不能再继承当前类，到此为止，已经封死了。
//                        //sealed类型：同父类，需要指定由哪些类继承。
//                        //non-sealed类型：重新开放为普通类，任何类都可以继承。
//                    }
//
//
//                    public sealed class A  permits B{   //指定B继承A
//
//                    }
//
//                    public final class B extends A {   //在子类final，彻底封死
//
//                    }
//
//                    将B设定为non-sealed类型：
//                    public non-sealed class B extends A {
//
//                    }
//
//                    可以正常继承了，因为B指定了non-sealed主动放弃了密封特性

//                        包装类介绍
//                            能够表示数字的基本类型包装类，继承自Number类
//                                    byte -> Byte
//                                    boolean -> Boolean
//                                    short -> Short
//                                    char -> Character
//                                    int -> Integer
//                                    long -> Long
//                                    float -> Float
//                                    double -> Double
//
//                        private final int value;  //类中实际上就靠这个变量在存储包装的值
//
//                        public Integer(int value) {
//                            this.value = value;
//                        }
//
//                        public static void main(String[] args) {
//                            Integer i = 10;
//                            int a = i.intValue();   //通过此方法变成基本类型int值
//                        }
//
//                        public static void main(String[] args) {
//                            Integer a = new Integer(10);
//                            Integer b = new Integer(10);
//
//                            System.out.println(a == b);    //虽然a和b的值相同，但是并不是同一个对象，所以说==判断为假
//                        }
//
//                        public static void main(String[] args) {
//                            Integer a = 128, b = 128;
//                            System.out.println(a == b);
//                        }
//
//                        包装类支持字符串直接转换：
//                        public static void main(String[] args) {
//                            Integer i = new Integer("666");   //直接将字符串的666，转换为数字666
//                            System.out.println(i);
//                        }
//
//                        特殊包装类
//                                计算超大数字的BigInteger
//                        public static void main(String[] args) {
//                            BigInteger i = BigInteger.valueOf(Long.MAX_VALUE);    //表示Long的最大值，轻轻松松
//                            System.out.println(i);
//                        }
//
//                        数组
//                        类型[] 变量名称 = new 类型[数组大小];
//                        类型 变量名称[] = new 类型[数组大小];  //支持C语言样式，但不推荐！
//
//                        类型[] 变量名称 = new 类型[]{...};  //静态初始化（直接指定值和大小）
//                        类型[] 变量名称 = {...};   //同上，但是只能在定义时赋值
//
//                        public static void main(String[] args) {
//                            int[] array = new int[10];
//                            array[0] = 888;   //就像使用变量一样，是可以放在赋值运算符左边的，我们可以直接给对应下标位置的元素赋值
//                            System.out.println("数组的第一个元素为："+array[0]);
//                        }
//
//                        多维数组
//                        public static void main(String[] args) {
//                            int[][] arr = new int[][]{{1, 2},
//                                    {3, 4},
//                                    {5, 6}};
//                            for (int i = 0; i < 3; i++) {    //要遍历一个二维数组，那么我们得一列一列一行一行地来
//                                for (int j = 0; j < 2; j++) {
//                                    System.out.println(arr[i][j]);
//                                }
//                            }
//                        }
//                        可变长参数
//                        public class Person {
//                            String name;
//                            int age;
//                            String sex;
//
//                            public void test(String... strings){
//
//                            }
//                        }
//                        public static void main(String[] args) {
//                            Person person = new Person();
//                            person.test("1！", "5！", "哥们在这跟你说唱"); //这里我们可以自由传入任意数量的字符串
//                        }
//                        如果同时存在其他参数，那么可变长参数只能放在最后：
//
//                        字符串
//                                String类
//                        public static void main(String[] args) {
//                            String str = new String("Hello World!");  //这种方式就是创建一个新的对象
//                        }
//                        public static void main(String[] args) {
//                            String str1 = "Hello World";
//                            String str2 = "Hello World";
//                            System.out.println(str1 == str2);
//                        }
//                        StringBuilder类
//                        public static void main(String[] args) {
//                            String str1 = "你看";
//                            String str2 = "这";
//                            String str3 = "汉堡";
//                            String str4 = "做滴";
//                            String str5 = "行不行";
//                            String result = str1 + str2 + str3 + str4 + str5;   //5个变量连续加
//                            System.out.println(result);
//                        }
//                        文本块
//                        String string = """
//                                "dad"
//                                """;
//                        System.out.println(string);  //"dad"
//
//                        String string = "\"dad\"\n";
//                        System.out.println(string);
//
//                        正则表达式
//                        public static void main(String[] args) {
//                            String str = "aaaa731341@163.com";
//                            //假设邮箱格式为 数字/字母@数字/字母.com
//                        }
//
//                        public static void main(String[] args) {
//                            String str = "oooo";
//                            //matches方法用于对给定正则表达式进行匹配，匹配成功返回true，否则返回false
//                            System.out.println(str.matches("o+"));   //+表示对前面这个字符匹配一次或多次，这里字符串是oooo，正好可以匹配
//                        }
//
//                        *	匹配前面的子表达式零次或多次。例如，zo* 能匹配 "z" 以及 "zoo"。***** 等价于 {0,}。
//                                +	匹配前面的子表达式一次或多次。例如，zo+ 能匹配 "zo" 以及 "zoo"，但不能匹配 "z"。+ 等价于 {1,}。
//                                ?	匹配前面的子表达式零次或一次。例如，do(es)? 可以匹配 "do" 、 "does"、 "doxy" 中的 "do" 。? 等价于 {0,1}。
//                                {n}	n 是一个非负整数。匹配确定的 n 次。例如，o{2} 不能匹配 "Bob" 中的 o，但是能匹配 "food" 中的两个 o。
//                                {n,}	n 是一个非负整数。至少匹配n 次。例如，o{2,} 不能匹配 "Bob" 中的 o，但能匹配 "foooood" 中的所有 o。o{1,} 等价于 o+。o{0,} 则等价于 o*。
//                                {n,m}	m 和 n 均为非负整数，其中 n <= m。最少匹配 n 次且最多匹配 m 次。例如，o{1,3} 将匹配 "fooooood" 中的前三个 o。o{0,1} 等价于 o?。请注意在逗号和两个数之间不能有空格。
//
//                                [ABC]	匹配 [...] 中的所有字符，例如 [aeiou] 匹配字符串 "google runoob taobao" 中所有的 e o u a 字母。
//                                [^ABC]	匹配除了 [...] 中字符的所有字符，例如 [^aeiou] 匹配字符串 "google runoob taobao" 中除了 e o u a 字母的所有字母。
//                                [A-Z]	[A-Z] 表示一个区间，匹配所有大写字母，[a-z] 表示所有小写字母。
//                                .	匹配除换行符（\n、\r）之外的任何单个字符，相等于 [^\n\r]
//                                [\s\S]	匹配所有。\s 是匹配所有空白符，包括换行，\S 非空白符，不包括换行。
//                                \w	匹配字母、数字、下划线。等价于 [A-Za-z0-9_]
//
//
//                        public static void test(Object obj) {
//                            String type = switch (obj) {
//                                case String s -> "String";   //直接在case后写上类型和变量名称即可进行类型匹配
//                                case Integer i -> "Integer";
//                                case null -> "Null";   //甚至还可以直接判断null
//                                default -> "Other";
//                            };
//                            System.out.println(type);
//                        }
//
//                        return switch (score) {
//                                case Integer c when c >= 90 -> "优秀";   //注意switch是从上往下匹配，大于90要放前面优先匹配
//                                case Integer c when c >= 80 -> "良好";   //走到这里一定小于90，再判断是否大于80
//                                case Integer c when c >= 60 -> "及格";
//                        default -> "滚蛋";
//                                };
//
//                        record Point(int x, int y) {}
//
//                        public static Integer test(Object object) {
//                            return switch (object) {
//                                case Point(int x, int y) -> x + y;  //直接解构其参数使用
//                                case String _ -> 10;
//                                default -> 5;
//                            };
//                        }
//
//                        成员内部类
//                        public class Test {
//                            public class Inner {   //内部类也是类，所以说里面也可以有成员变量、方法等，甚至还可以继续套娃一个成员内部类
//                                public void test(){
//                                    System.out.println("我是成员内部类！");
//                                }
//                            }
//                        }
//
//                        public class Inner {
//
//                            String name;
//                            public void test(String name){
//                                this.toString();		//内部类自己的toString方法
//                                super.toString();    //内部类父类的toString方法
//                                Test.this.toString();   //外部类的toSrting方法
//                                Test.super.toString();  //外部类父类的toString方法
//                            }
//                        }
//
//                        静态内部类
//                        public static class Inner {
//
//                            String name;
//                            public void test(){
//                                System.out.println("我是静态内部类："+name);
//                            }
//                        }
//
//                        局部内部类
//                        public class Test {
//                            private final String name;
//
//                            public Test(String name){
//                                this.name = name;
//                            }
//
//                            public void hello(){
//                                class Inner {    //直接在方法中创建局部内部类
//
//                                }
//                            }
//                        }
//
//                        匿名
//                        Student student = new Student() {
//                            int a;   //因为本质上就相当于是子类，所以说子类定义一些子类的属性完全没问题
//
//                            @Override
//                            public void test() {
//                                System.out.println(name + "我是匿名内部类的实现!");   //直接使用父类中的name变量
//                            }
//                        };
//
//                        Lambda表达式
//                        public static void main(String[] args) {
//                            Study study = () -> System.out.println("我是学习方法！");   //是不是感觉非常简洁！
//                            study.study();
//                        }
//
//                        断言表达式
//                        public static void main(String[] args) {
//                            int a = 10;
//                            assert a > 10;
//                        }
//
//                        三角函数
//                        Math.sin(Math.PI / 2);     //求π/2的正弦值，这里我们可以使用预置的PI进行计算
//                        Math.cos(Math.PI);       //求π的余弦值
//                        Math.tan(Math.PI / 4);    //求π/4的正切值
//
//                        Math.asin(1);     //三角函数的反函数也是有的，这里是求arcsin1的值
//                        Math.acos(1);
//                        Math.atan(0);
//
//                        计算对数函数
//                        public static void main(String[] args) {
//                            Math.log(Math.E);    //e为底的对数函数，其实就是ln，我们可以直接使用Math中定义好的e
//                            Math.log10(100);     //10为底的对数函数
//                            //利用换底公式，我们可以弄出来任何我们想求的对数函数
//                            double a = Math.log(4) / Math.log(2);   //这里是求以2为底4的对数，log(2)4 = ln4 / ln2
//                            System.out.println(a);
//                        }
//                        将数组进行排序
//                        public static void main(String[] args) {
//                            int[] arr = new int[]{1, 4, 5, 8, 2, 0, 9, 7, 3, 6};
//                            Arrays.sort(arr);    //可以对数组进行排序，将所有的元素按照从小到大的顺序排放
//                            System.out.println(Arrays.toString(arr));
//                        }

//}
//}