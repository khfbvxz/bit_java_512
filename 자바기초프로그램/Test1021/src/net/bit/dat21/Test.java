package net.bit.dat21;

public interface Test {
	// interface �� �Լ��� ���� = �߻�޼ҵ� = abstract
	//  interface ���� 
	//interface ��� Ű���� implemnts, �߻�޼ҵ�� ������ �������̵� 
	public abstract void dbSelectCode(int find); 
	public abstract void dbNameSearch(String find); 
	public abstract int dbCountName(String key ); 
	public abstract void dbUpdate(); 

	public abstract int dbCountAll() ;
	public abstract void dbDelete() ;
	public abstract void dbInsert() ;
	public abstract void dbSelectAll() ;
}
