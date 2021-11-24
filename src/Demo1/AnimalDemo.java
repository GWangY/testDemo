package Demo1;

public class AnimalDemo {
//测试类
	public static void main(String[] args) {
		//创建猫对象并进行测试
		Cat c1=new Cat();
		c1.setName("加菲猫");
		c1.setAge(2);
		System.out.println(c1.getName()+", "+c1.getAge());
		c1.catMouse();
	}

}
