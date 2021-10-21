package net.bit.dat21;

public interface Test {
	// interface 는 함수를 정의 = 추상메소드 = abstract
	//  interface 에서 
	//interface 상속 키워드 implemnts, 추상메소드는 무조건 오버라이딩 
	public abstract void dbSelectCode(int find); 
	public abstract void dbNameSearch(String find); 
	public abstract int dbCountName(String key ); 
	public abstract void dbUpdate(); 

	public abstract int dbCountAll() ;
	public abstract void dbDelete() ;
	public abstract void dbInsert() ;
	public abstract void dbSelectAll() ;
}
