package Demo1;

public class AnimalDemo {
//������
	public static void main(String[] args) {
		//����è���󲢽��в���
		Cat c1=new Cat();
		c1.setName("�ӷ�è");
		c1.setAge(2);
		System.out.println(c1.getName()+", "+c1.getAge());
		c1.catMouse();
	}

}
