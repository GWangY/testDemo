package teachDemo;

public class Demo {
//������
	public static void main(String[] args) {
		// ������ʦ�������в���
		//�޲ι��캯����������
		Teacher th=new Teacher();
		th.setName("����");
		th.setAge(22);
		System.out.println(th.getName()+", "+th.getAge());
		th.teach();
		//���κ������캯����������
		Teacher th1=new Teacher("����1",22);
		System.out.println(th1.getName()+", "+th1.getAge());
		th1.teach();
	}

}
