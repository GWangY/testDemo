package teachDemo;

public class Demo {
//测试类
	public static void main(String[] args) {
		// 创建老师类对象进行测试
		//无参构造函数创建对象
		Teacher th=new Teacher();
		th.setName("王艳");
		th.setAge(22);
		System.out.println(th.getName()+", "+th.getAge());
		th.teach();
		//带参函数构造函数创建对象
		Teacher th1=new Teacher("王艳1",22);
		System.out.println(th1.getName()+", "+th1.getAge());
		th1.teach();
	}

}
