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



//}
//}