package net.bit.day15;

public class Father {
	// ������ ���� ���ϰ� ����� = void ����ϸ� �ȵ�, ������ �Լ� �ߺ� ����
	public Father() {}
	public Father(String name) {}
	public Father(int age) {}
	public Father(String name, int age) {}

	// �޼ҵ� �ߺ� = ���� �ε�
	public int bank() {
		int m = -250;
		return m;
	}
	public int bank(int age) {
		int m = 10;
		return m;
	}
	public int bank(String name) {
		int m = 35;
		return m;
	}

	public int bank(String name, int age) {
		int m = 1230;
		return m;
	}
}
