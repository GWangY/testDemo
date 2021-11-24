package Demo1;

public class Cat extends Animal{
	public Cat() {
		
	}
	public Cat(String name,int age) {
		//调用父类中的有参构造函数
		super(name,age);
	}
public void catMouse() {
	System.out.println("猫抓老鼠");
}
}
