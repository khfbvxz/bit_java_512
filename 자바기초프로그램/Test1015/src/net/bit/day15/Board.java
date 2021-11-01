package net.bit.day15;

interface Board {
	//interface 는 명세 = 목록, 이름만 명시, 내용 x===> 추상황 abstract
	//interface 는 abstract 생략 
    public abstract boolean boardInsert(); // 추상 메소드 
    public void boardDelete(int code);
    public void boardList();
}

