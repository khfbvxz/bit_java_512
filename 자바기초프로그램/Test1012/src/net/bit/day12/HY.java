package net.bit.day12;
import java.util.*;

public class HY {
	public static int floor; // 층
	private static int room; // 호
	public static String[][] name = new String[3][5]; // 투숙객 이름
	public static String title;

	public HY() {
			// 기본생성자 생략가능함
		}// end
	public void process() {
		showStatus();
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		while (true) {
			try {
				sel = menu();
				if (sel == 9) {
					System.out.println("시스템을 종료합니다.");
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
					System.out.print("1~ 4 사이의 번호를 입력하세요.");
				}
			} catch (Exception ex) {
			}
		}
	}

	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************델루나 호텔 예약 시스템*********************");
		System.out.print("1.투숙 2. 퇴실 3. 투숙객 확인  4. 투숙상태 list  9. 종료 >>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	public static void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층에 투숙하시겠습니까? >>");
		floor = Integer.parseInt(sc.nextLine());
		System.out.println("몇 호에 투숙하시겠습니까? >>");
		room = Integer.parseInt(sc.nextLine());
		if (name[floor - 1][room - 1] != null) {
			System.out.println("이미 사용중 입니다.");
		}
		System.out.print("투숙객 이름? >>");
		title = sc.nextLine();
		name[floor - 1][room - 1] = title;
		System.out.println("성공적으로 CheckIn 되었습니다.");
	}
	public static void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 몇 층에 투숙하고 계십니까 ? >>");
		floor = Integer.parseInt(sc.nextLine());
		System.out.print(" 몇 호에 투숙하고 계십니까 ? >>");
		room = Integer.parseInt(sc.nextLine());
		if (name[floor - 1][room - 1] == null) {
			System.out.println("비어있는 방입니다. ");
		} else {
			name[floor - 1][room - 1] = null;
			System.out.println("성공적으로 CheckOut 되었습니다.");
		}
	} // end
	public static void showStatus() {
		System.out.println("\n\n\t[" + title + "님의 투숙상태 ]");
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
					System.out.print("" + (i + 1) + "0" + (j + 1) + "호" + " □\t" + "\t");
				} else {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "호" + " ■\t" + name[i][j] + "\t");
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
