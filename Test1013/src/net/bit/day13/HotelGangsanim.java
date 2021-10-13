package net.bit.day13;
import java.util.Scanner;
public class HotelGangsanim {
	private int floor; // �� //3������
	private int room; // ȣ //5ȣ����
	private String name[][] = new String[3][5]; // ������ȣ
	private String title;

	public HotelGangsanim( ) { }

	public HotelGangsanim(String m) { this.title=m; }

	public void process() {// non-static�޼ҵ�
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		while (true) {
			System.out.print("\n1.���� 2.��� 3.list 4.showStatus 9.���� >>> ");
			sel = Integer.parseInt(sc.nextLine());

			switch (sel) {
			case 1: // ����
				checkIn();
				break;
			case 2: // ���
				checkOut();
				break;
			case 3: // ��ü����
				list(); // mapȣ��
				break;
			case 4: // ��ü����
				showStatus();
				break;
			case 9:
				System.out.println("\n" + title + " ȣ�����α׷��� �����ϰڽ��ϴ�.");
				return;
			}
		} // while end
	}// end

	public void checkIn() { // non-static�޼ҵ�
		Scanner sc = new Scanner(System.in);

		System.out.print(" >������ ����? "); // 3 �� �����迭�� 2��
		floor = Integer.parseInt(sc.nextLine());
		System.out.print(" >��ȣ�� ����? "); // 4 ȣ �����迭�� 3��
		room = Integer.parseInt(sc.nextLine());
		if (name[floor - 1][room - 1] != null) {
			System.out.println("# �̹� �������� ���Դϴ�.");
			return;
		}
		System.out.print(" >������ �̸�? ");
		name[floor - 1][room - 1] = sc.nextLine();
		System.out.println("# ���������� checkIn �Ǿ����ϴ�.");
	}// end

	public void checkOut() { // non-static�޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("> �������� ���? ");
		floor = Integer.parseInt(sc.nextLine());
		System.out.print("> ��ȣ���� ���? ");
		room = Integer.parseInt(sc.nextLine());
		if (name[floor - 1][room - 1] == null) {
			System.out.println("# �̹� �� ���Դϴ�.");
			return;
		}
		name[floor - 1][room - 1] = null;
		System.out.println("# ���������� checkOut �Ǿ����ϴ�.");
	}// checkOut end

	public void list() { // non-static�޼ҵ�
		System.out.println("\n\t[ " + title + " ���� ���� ]");
		for (int i = 0; i < 3; i++) {
			for (int b = 0; b < 5; b++) {
				System.out.print((i + 1) + "0" + (b + 1) + "\t");
			}

			System.out.println(); // �̸�ǥ�� ������Դϴ�

			for (int j = 0; j < 5; j++) {
				if (this.name[i][j] == null) {
					System.out.print("\t");
					continue;
				} // if end
				System.out.print(this.name[i][j] + "\t"); // ���� \t������ �ξ� ���ƿ� hong TabŰ LEE
			} // j end
			System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�"); // \n����������
		} // for i end
	} // list end

	public void showStatus() { // non-static�޼ҵ�
		System.out.println("\n\t\t[ " + title + " ���� ���� ]");
		// ��øfor if��
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				if (name[i][j] == null) {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "ȣ" + " ��\t" + "\t");
				} else {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "ȣ" + " ��\t" + name[i][j] + "\t");
				}
			}
			System.out.println();
		} // if end
	} // showStatus end

	public static void main(String[] args) {
		HotelGangsanim mm = new HotelGangsanim("���糪");
		mm.process();
	} // main end
}
