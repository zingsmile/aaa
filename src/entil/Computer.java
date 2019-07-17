package entil;

import java.util.Random;

public class Computer {
	private String cname;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public int Cgame() {
		Random ran = new Random();
		int a = ran.nextInt(3);
		switch (a) {
		case 1:
			System.out.println(cname+"出拳：剪刀");
			break;
		case 2:
			System.out.println(cname+"出拳：石头");
			break;
		case 3:
			System.out.println(cname+"出拳：布");
			break;
		default:
			System.out.println("您输入的有误，请重新输入！");
			Cgame();
		}
		return a;
	}
	
}
