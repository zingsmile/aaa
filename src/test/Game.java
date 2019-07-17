package test;

import java.util.Scanner;

import entil.Computer;
import entil.User;

public class Game {
	Scanner sc = new Scanner(System.in);
	Computer c = new Computer();
	User u = new User();
	
	public void initial() {
		System.out.println("******欢迎进入游戏世界*******");
		System.out.println("***************");
		System.out.println("***猜拳,开始***");
		System.out.println("***************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
		System.out.print("请选择对方角色（1.刘备2.孙权3.曹操）：");
		int a = sc.nextInt();
		u.addUname();
		switch (a) {
		case 1:
			System.out.println("你选择了刘备对战");
			c.setCname("刘备");
			break;
		case 2:
			System.out.println("你选择了孙权对战");
			c.setCname("孙权");
			break;
		case 3:
			System.out.println("你选择了曹操对战");
			c.setCname("曹操");
			break;
		default:
			System.out.println("您输入的有误，请重新输入！");
			startGame();
		}
		System.out.println(c.getCname()+"VS"+u.getUname());
	}
	
	public void startGame() {
		System.out.print("要开始吗？（y/n）");
		String judge = sc.next();
		int count = 0;
		int uintegral = 0;
		int cintegral = 0;
		while(judge.equals("y")) {
			int usf1 = u.Ugame();
			int usf2 = c.Cgame();
			if((usf1==1&&usf2==1)||(usf1==2&&usf2==2)||(usf1==3&&usf2==3)) {
				System.out.println("结果：和局，真衰！嘿嘿，等着瞧吧！");
				count++;
			}else if((usf1==1&&usf2==2)||(usf1==2&&usf2==3)||(usf1==3&&usf2==1)) {
				System.out.println("你输了，真笨！");
				count++;
				cintegral++;
			}else if((usf1==1&&usf2==3)||(usf1==2&&usf2==1)||(usf1==3&&usf2==2)) {
				System.out.println("恭喜，你赢了");
				count++;
				uintegral++;
			}
			System.out.println("是否继续？（y/n）:");
			judge = sc.next();
		}
		
		while(judge.equals("n")) {
			System.out.println(u.getUname() +"VS"+c.getCname() );
			System.out.println("对战次数："+count);
			System.out.println();
			System.out.println("姓名       得分");
			System.out.println(u.getUname()+"    "+uintegral);
			System.out.println(c.getCname()+"    "+cintegral);
			System.out.println();
			if(cintegral>uintegral) {
				System.out.println("结果：呵呵，笨笨，下次加油啊！");
			}else if(cintegral<uintegral) {
				System.out.println("结果：恭喜恭喜！");
			}else {
				System.out.println("结果：竟然是平局！");
			}
			break;
		}
			
	}
			
	
}
