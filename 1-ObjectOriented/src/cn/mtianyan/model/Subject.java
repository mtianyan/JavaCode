package cn.mtianyan.model;
/**
 * 专业类
 * @author mtianyan
 */
public class Subject {
	// 成员属性：学科名称、学科编号、学制年限、报名选修的学生信息、报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;
	
	// 无参构造方法
	public Subject() {

	}

	// 带参构造，带参构造，实现对全部属性的赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		// this.subjectName=subjectName;
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// 设置学制年限，限制必须>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}

	/**
	 * 获取选修专业的学生信息 如果保存学生信息的数组未被初始化，则，先初始化长度200
	 * @return 保存学生信息的数组
	 */
	public Student[] getMyStudents() {
//		if(this.myStudents==null)
//			this.myStudents=new Student[200];
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息，包括名称、编号、年限
	 */
	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n学制年限："
				+ this.getSubjectLife() + "年";
		return str;
	}
	
	public void addStudent(Student stu){
		/*
		 * 1、将学生保存到数组中
		 * 2、将学生个数保存到studentNum
		 * */
		//1、将学生保存到数组中
		for(int i=0;i<this.getMyStudents().length;i++){
			if(this.getMyStudents()[i]==null){
				stu.setStudentSubject(this);
				this.getMyStudents()[i]=stu;
				//2、将学生个数保存到studentNum
				this.studentNum=i+1;
				return;
			}
		}
	}
}
