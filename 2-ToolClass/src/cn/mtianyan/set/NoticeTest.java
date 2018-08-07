package cn.mtianyan.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
	public static void prinf(ArrayList noticeList,int i){
		System.out.printf("%-15s",(i + 1)+ ":" + ((Notice) (noticeList.get(i))).getTitle());
		System.out.printf("%-6s","\t"+((Notice)(noticeList.get(i))).getCreator());
		System.out.printf("%-20s","\t"+((Notice)noticeList.get(i)).getCreateTime());
		System.out.println();
	}

	public static void main(String[] args) {
		// 创建Notice类的对象，生成三条公告，new Date()当前时间
		Notice notice1 = new Notice(1, "欢迎来到简书，天涯明月笙！", "管理员", new Date());
		Notice notice2 = new Notice(2, "请同学们按时提交作业！", "老师", new Date());
		Notice notice3 = new Notice(3, "请同学们按时完成试卷！", "老师", new Date());

		// 添加公告
		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);

		// 显示公告
		System.out.println("公告的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			prinf(noticeList,i);
		}

		System.out.println("**************************************");
		// 在第一条公告后面添加一条新公告
		Notice notice4 = new Notice(4, "在线编辑器可以使用啦！", "管理员", new Date());
		noticeList.add(1, notice4);

		// 显示公告
		System.out.println("第一条公告后插入新公告后的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			prinf(noticeList,i);
		}

		System.out.println("**************************************");
		// 删除按时提交作业的公告
		noticeList.remove(2);
		// 显示公告
		System.out.println("删除第3条公告后的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			prinf(noticeList,i);
		}
		
		// 将第二条公告改为：Java在线编辑器可以使用啦！
		System.out.println("**************************************");
		// 修改第二条公告中title的值
		notice4.setTitle("Java在线编辑器可以使用啦！");
//		noticeList.set(1, notice4);
		System.out.println("修改后公告的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			prinf(noticeList,i);
		}
	}

}
