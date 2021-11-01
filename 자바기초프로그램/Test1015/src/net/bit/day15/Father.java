package net.bit.day15;

public class Father {
	// 생성자 구현 리턴값 없어요 = void 기술하면 안됨, 생성자 함수 중복 가능
	public Father() {}
	public Father(String name) {}
	public Father(int age) {}
	public Father(String name, int age) {}

	// 메소드 중복 = 오버 로딩
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
