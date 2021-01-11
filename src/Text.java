public class Text {
    public static void main(String[] args) {
        Student stu=new Student();//创建对象
        //给对象赋值
        stu.stuId=2019101917;
        stu.password="123456";
        stu.zhuanye="计算机科学与技术";
        stu.phone="13407771861";
        System.out.println(stu.stuId);
        System.out.println(stu.password);
        System.out.println(stu.zhuanye);
        System.out.println(stu.phone);
    }
}
