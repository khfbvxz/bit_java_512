package JKppt;
/* 요구사항 
고객 정보 : 이름, 성별, 이메일, 출생년도  입력받아 배열에 저장
이름은 문자열 , 성별 M F , 이메일 문자열 , 출생년도 정수
저장 조회 수정 삭제 기는 CRUD
I 를 눌러 고객의 정보를 입력받도록 
저장된 고객정보 P or N 을 눌러 이전 고객정보 또는 다음 고객정보를 조회 할 수 있어야함
조회한 고객정보는 U를 눌러 새로운 정보 수정
D를 누르면 조회한 고객정보를 배열에서 삭제 
프로그램 종료 Q 
 */

import java.util.Scanner;

public class CustomerManagement {
	// 배열에 저장될 수 있는 최대 고객의 수
	static final int MAX = 100;
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];

	// 배열은 인덱스를 필요로함
	static int index = -1; // 배열은 0 부터 시작하므로 최초 인덱스는 01 이여야함
	// 배열은 처음 선언한 크기보다 같거나 적은 개수의 자료를 저장

	// 그래서 현재 데이터가 몇개 저장되어있는지 알수있는 변수 선언
	static int count = 0;
	// 기본 입력장치로부터 데이터를 입력박기 위해 Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요");
//		int data = sc.nextInt();
//		System.out.printf("당신이 입력한 숫자는 %d 입니다.", data);
//
//		System.out.print("문자열을 입력하세요");
//		String str = sc.next();
//		System.out.printf("당신이 입력한 문자열은 %s 입니다.", str);
//		// trim() 문자열 맨앞 맨뒤 공백 제거 또는 replace(" ","") 기존문자 바꿀문자 replaceFirst 첫번째만
//		// replaceAll 은 문자열 전체가 치환 .
//		sc.close();
//		System.out.printf("당신이 입력한 첫번째 문자열은 %s 입니다.", str.trim().charAt(0));

		// menu
		while (true) {
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴입력");
			String menu = sc.next();
			menu = menu.toLowerCase();// 입력한 문자열을 모두 소문자로 변환
			switch (menu.charAt(0)) {
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					insertCustomerData();
					System.out.println("고객정보를 저장했습니다.");
				}
				break;
			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if (index <= 0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if (index >= count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				} else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if ((index >= 0) && (index < count)) {
					printCustomerData(index);
				} else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if ((index >= 0) && (index < count)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerData(index);
				} else {
					System.out.println("수정할 데이터가 없습니다.");
				}
				break;

			case 'd':
				System.out.println("데이터를 삭제합니다.");
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				sc.close(); // Scanner 객체 닫기
				System.exit(0);// 프로그램 종료
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
				throw new IllegalArgumentException("Unexpected value: " + menu.charAt(0));
			}// swicth end
		} // while end
	}// main end

	public static void deleteCustomerData(int index) {
		for (int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			birthYearList[i] = birthYearList[i + 1];
		}
		count--;
	}

	public static void updateCustomerData(int index) {
		System.out.println("--------UPDATE CUSTOMER INFO--------");
		System.out.print("이름( " + nameList[index] + " ) :");
		nameList[index] = sc.next();
		System.out.print("성별( " + genderList[index] + " ) :");
		genderList[index] = sc.next().charAt(0);
		System.out.print("이메일( " + emailList[index] + " ) :");
		emailList[index] = sc.next();
		System.out.print("이름( " + birthYearList[index] + " ) :");
		birthYearList[index] = sc.nextInt();
	}

	public static void printCustomerData(int index) {
		// index 넣어야 되는가 count넣어야 되는가.
		System.out.println("=======CUSTOMER INFO========");
		System.out.printf("이름 : " + nameList[index]);
		System.out.printf("성별 : " + genderList[index]);
		System.out.printf("이메일 : " + emailList[index]);
		System.out.printf("출생년도 : " + birthYearList[index]);
		System.out.println("============================");
	}

	public static void printCustomerInfo(int index) {

		System.out.println("=======CUSTOMER INFO========");
		System.out.printf("이름 : " + nameList[index]);
		System.out.printf("성별 : " + genderList[index]);
		System.out.printf("이메일 : " + emailList[index]);
		System.out.printf("출생년도 : " + birthYearList[index]);
		System.out.println("============================");
	}

	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("출생년도 : ");
		int birthYear = sc.nextInt();

		// 고객 객체를 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++; // count 번쨰 배열에 객체 저장후 count값 증가 시켜야함
	}

}
