package net.bit.day15;

interface Board {
	//interface �� �� = ���, �̸��� ���, ���� x===> �߻�Ȳ abstract
	//interface �� abstract ���� 
    public abstract boolean boardInsert(); // �߻� �޼ҵ� 
    public void boardDelete(int code);
    public void boardList();
}

