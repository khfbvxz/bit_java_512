package JKppt;
/* �䱸���� 
�� ���� : �̸�, ����, �̸���, ����⵵  �Է¹޾� �迭�� ����
�̸��� ���ڿ� , ���� M F , �̸��� ���ڿ� , ����⵵ ����
���� ��ȸ ���� ���� ��� CRUD
I �� ���� ���� ������ �Է¹޵��� 
����� ������ P or N �� ���� ���� ������ �Ǵ� ���� �������� ��ȸ �� �� �־����
��ȸ�� �������� U�� ���� ���ο� ���� ����
D�� ������ ��ȸ�� �������� �迭���� ���� 
���α׷� ���� Q 
 */

import java.util.Scanner;

public class CustomerManagement {
	// �迭�� ����� �� �ִ� �ִ� ���� ��
	static final int MAX = 100;
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];

	// �迭�� �ε����� �ʿ����
	static int index = -1; // �迭�� 0 ���� �����ϹǷ� ���� �ε����� 01 �̿�����
	// �迭�� ó�� ������ ũ�⺸�� ���ų� ���� ������ �ڷḦ ����

	// �׷��� ���� �����Ͱ� � ����Ǿ��ִ��� �˼��ִ� ���� ����
	static int count = 0;
	// �⺻ �Է���ġ�κ��� �����͸� �Է¹ڱ� ���� Scanner ��ü ����
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���");
//		int data = sc.nextInt();
//		System.out.printf("����� �Է��� ���ڴ� %d �Դϴ�.", data);
//
//		System.out.print("���ڿ��� �Է��ϼ���");
//		String str = sc.next();
//		System.out.printf("����� �Է��� ���ڿ��� %s �Դϴ�.", str);
//		// trim() ���ڿ� �Ǿ� �ǵ� ���� ���� �Ǵ� replace(" ","") �������� �ٲܹ��� replaceFirst ù��°��
//		// replaceAll �� ���ڿ� ��ü�� ġȯ .
//		sc.close();
//		System.out.printf("����� �Է��� ù��° ���ڿ��� %s �Դϴ�.", str.trim().charAt(0));

		// menu
		while (true) {
			System.out.printf("\n[INFO] �� �� : %d, �ε��� : %d\n", count, index);
			System.out.println("�޴��� �Է��ϼ���");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("�޴��Է�");
			String menu = sc.next();
			menu = menu.toLowerCase();// �Է��� ���ڿ��� ��� �ҹ��ڷ� ��ȯ
			switch (menu.charAt(0)) {
			case 'i':
				System.out.println("������ �Է��� �����մϴ�.");
				if (count >= MAX) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				} else {
					insertCustomerData();
					System.out.println("�������� �����߽��ϴ�.");
				}
				break;
			case 'p':
				System.out.println("���� �����͸� ����մϴ�.");
				if (index <= 0) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'n':
				System.out.println("���� �����͸� ����մϴ�.");
				if (index >= count - 1) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':
				System.out.println("���� �����͸� ����մϴ�.");
				if ((index >= 0) && (index < count)) {
					printCustomerData(index);
				} else {
					System.out.println("����� �����Ͱ� ���õ��� �ʾҽ��ϴ�.");
				}
				break;
			case 'u':
				System.out.println("�����͸� �����մϴ�.");
				if ((index >= 0) && (index < count)) {
					System.out.println(index + "��° �����͸� �����մϴ�.");
					updateCustomerData(index);
				} else {
					System.out.println("������ �����Ͱ� �����ϴ�.");
				}
				break;

			case 'd':
				System.out.println("�����͸� �����մϴ�.");
				break;
			case 'q':
				System.out.println("���α׷��� �����մϴ�.");
				sc.close(); // Scanner ��ü �ݱ�
				System.exit(0);// ���α׷� ����
			default:
				System.out.println("�޴��� �� �� �Է��߽��ϴ�.");
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
		System.out.print("�̸�( " + nameList[index] + " ) :");
		nameList[index] = sc.next();
		System.out.print("����( " + genderList[index] + " ) :");
		genderList[index] = sc.next().charAt(0);
		System.out.print("�̸���( " + emailList[index] + " ) :");
		emailList[index] = sc.next();
		System.out.print("�̸�( " + birthYearList[index] + " ) :");
		birthYearList[index] = sc.nextInt();
	}

	public static void printCustomerData(int index) {
		// index �־�� �Ǵ°� count�־�� �Ǵ°�.
		System.out.println("=======CUSTOMER INFO========");
		System.out.printf("�̸� : " + nameList[index]);
		System.out.printf("���� : " + genderList[index]);
		System.out.printf("�̸��� : " + emailList[index]);
		System.out.printf("����⵵ : " + birthYearList[index]);
		System.out.println("============================");
	}

	public static void printCustomerInfo(int index) {

		System.out.println("=======CUSTOMER INFO========");
		System.out.printf("�̸� : " + nameList[index]);
		System.out.printf("���� : " + genderList[index]);
		System.out.printf("�̸��� : " + emailList[index]);
		System.out.printf("����⵵ : " + birthYearList[index]);
		System.out.println("============================");
	}

	public static void insertCustomerData() {
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("����⵵ : ");
		int birthYear = sc.nextInt();

		// �� ��ü�� �迭�� ����
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++; // count ���� �迭�� ��ü ������ count�� ���� ���Ѿ���
	}

}
