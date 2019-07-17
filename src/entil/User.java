package entil;

import java.util.Scanner;

public class User {
	private String uname;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}


	Scanner sc = new Scanner(System.in);
	public int Ugame() {
		System.out.print("请出拳：1.剪刀2.石头3.布（输入相应数字）：");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println(uname+"出拳：剪刀");
			break;
		case 2:
			System.out.println(uname+"出拳：石头");
			break;
		case 3:
			System.out.println(uname+"出拳：布");
			break;
		default:
			System.out.println("您输入有误请重新输入！");
			Ugame();
		}
		return a;
	}
	
	public void addUname() {
		System.out.print("请输入您的姓名：");
		String n = sc.next();
		setUname(n);
	}
	
}
