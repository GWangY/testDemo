package teachDemo;

public class Teacher {
private String name;
private int age;
public Teacher() {
	super();//Ĭ�Ϸ��ʸ�����޲ι��캯��
}
public Teacher(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public void teach() {
	System.out.println("���Ľ̺�ÿһ��ѧ��");
	
}
}
