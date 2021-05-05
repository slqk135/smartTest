package package01;

public class Account {
	
	int accNum;
	int balance;
	String accName;
	
	Account(int accNum,int balance, String accName){
		this.accName = accName;
		this.accNum =  accNum;
		this.balance = balance;
	}
	
	//출금
	public void setWithdraw(int money) {
		this.balance -= money;
	}
	//입금
	public void setDeposit(int money) {
		this.balance += money;
	}
	
	public void print() {
		System.out.println("계좌번호 \t계좌주 \t입금액");
		System.out.println(this.accNum + "\t" + this.accName + "\t" + this.balance);
	}
}
