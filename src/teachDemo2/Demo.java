package teachDemo2;

public class Demo {

	public static void main(String[] args) {
		// ������ʦ�����
		//�����е����Դ���һ�����࣬Ȼ������̳и��� ���Է��ʸ����еĳ�Ա����
		Teacher t1=new Teacher();
		t1.setName("����");
		t1.setAge(22);
		System.out.println(t1.getName()+", "+t1.getAge());
		t1.tech();
		//���ι��캯��
		Teacher t2=new Teacher("����2",21);
		System.out.println(t2.getName()+", "+t2.getAge());
		t2.tech();

	}

}
