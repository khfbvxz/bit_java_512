package net.bit.day12;
import java.util.*;

public class HY {
	public static int floor; // ��
	private static int room; // ȣ
	public static String[][] name = new String[3][5]; // ������ �̸�
	public static String title;

	public HY() {
			// �⺻������ ����������
		}// end
	public void process() {
		showStatus();
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		while (true) {
			try {
				sel = menu();
				if (sel == 9) {
					System.out.println("�ý����� �����մϴ�.");
					System.exit(0);
					break;
				}

				switch (sel) {
				case 1:
					checkIn();
					break;
				case 2:
					checkOut();
					break;
				case 3:
					showStatus();
					break;
				case 4:
					list();
					break;
				default:
					System.out.print("1~ 4 ������ ��ȣ�� �Է��ϼ���.");
				}
			} catch (Exception ex) {
			}
		}
	}

	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************���糪 ȣ�� ���� �ý���*********************");
		System.out.print("1.���� 2. ��� 3. ������ Ȯ��  4. �������� list  9. ���� >>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	public static void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �����Ͻðڽ��ϱ�? >>");
		floor = Integer.parseInt(sc.nextLine());
		System.out.println("�� ȣ�� �����Ͻðڽ��ϱ�? >>");
		room = Integer.parseInt(sc.nextLine());
		if (name[floor - 1][room - 1] != null) {
			System.out.println("�̹� ����� �Դϴ�.");
		}
		System.out.print("������ �̸�? >>");
		title = sc.nextLine();
		name[floor - 1][room - 1] = title;
		System.out.println("���������� CheckIn �Ǿ����ϴ�.");
	}
	public static void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" �� ���� �����ϰ� ��ʴϱ� ? >>");
		floor = Integer.parseInt(sc.nextLine());
		System.out.print(" �� ȣ�� �����ϰ� ��ʴϱ� ? >>");
		room = Integer.parseInt(sc.nextLine());
		if (name[floor - 1][room - 1] == null) {
			System.out.println("����ִ� ���Դϴ�. ");
		} else {
			name[floor - 1][room - 1] = null;
			System.out.println("���������� CheckOut �Ǿ����ϴ�.");
		}
	} // end
	public static void showStatus() {
		System.out.println("\n\n\t[" + title + "���� �������� ]");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((i + 1) + "0" + (j + 1) + "\t");
			}
			System.out.println();
			for (int k = 0; k < 5; k++) {
				if (name[i][k] == null) {
					System.out.print("\t");
					continue;
				}
				System.out.println(name[i][k] + '\t');
			}
			System.out.println("\n-------------------------------------------");
		}
	}

	public static void list() {
		System.out.println("\n\t[list]");

		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				if (name[i][j] == null) {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "ȣ" + " ��\t" + "\t");
				} else {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "ȣ" + " ��\t" + name[i][j] + "\t");
				}
			} // j end
			System.out.println();
		} // i end
	} // showStatus end

	public static void main(String[] args) {
		HY ht = new HY();
		ht.process();
	}// end
}// TestHotel class END
