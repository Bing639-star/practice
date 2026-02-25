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
//}
//}