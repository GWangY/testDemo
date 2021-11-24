package teachDemo2;

public class Demo {

	public static void main(String[] args) {
		// 创建老师类对象
		//将共有的特性创建一个父类，然后子类继承父类 可以访问父类中的成员变量
		Teacher t1=new Teacher();
		t1.setName("王艳");
		t1.setAge(22);
		System.out.println(t1.getName()+", "+t1.getAge());
		t1.tech();
		//带参构造函数
		Teacher t2=new Teacher("王艳2",21);
		System.out.println(t2.getName()+", "+t2.getAge());
		t2.tech();

	}

}
