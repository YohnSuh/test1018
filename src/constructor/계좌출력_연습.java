package constructor;

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	// 1. 파라미터가 없는 기본 생성자 정의, 다음과 같이 멤버변수 초기화
	// => 계좌번호: 111-1111-111
	//    예금주명: 홍길동
	//    현재잔고: 0
	public Account() {
		accountNo = "1002-453-052054";
		ownerName = "조연서";
		balance = 26400;
	}
	
	// 2. 계좌번호를 전달받아 초기화하는 생성자 정의, 나머지는 다음과같이 초기화
	// => 예금주명: 홍길동
	//    현재잔고: 0
	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.ownerName = "집에 가고싶당";
		this.balance = 10000000;
	}

	// 3. 계좌번호, 예금주명을 전달받아 초기화하는 생성자 정의, 나머지는 다음과 같이 초기화
	// => 현재잔고: 0
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = 0;
	}
	
	// 4. 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자 정의
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 출력 메서드
	public void showAccountInfo() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주명: " + ownerName);
		System.out.println("현재 잔고: " + balance);
	}
}
public class 계좌출력_연습 {
	
	public static void main(String[] args) {
		Account acc = new Account();
		acc.showAccountInfo();
		System.out.println("---------------------------------");
		Account acc2 = new Account("10293038-289492-393");
		acc2.showAccountInfo();
		System.out.println("---------------------------------");
		Account acc3 = new Account("200904-334-2049949", "배형욱 반드시 복수한다.");
		acc3.showAccountInfo();
		System.out.println("---------------------------------");
		Account acc4 = new Account("2039-392993-29904949-24", "최낙현 너도 복수한다.", 92);
		acc4.showAccountInfo();
	}

}
