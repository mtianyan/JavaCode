package cn.mtianyan.bug;

public class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.workerInfo();
        TestProgrammer testProgrammer = new TestProgrammer("测试工作",10,5);
        testProgrammer.workerInfo();
        System.out.println();
        DevelopProgrammer developProgrammer = new DevelopProgrammer("研发工作",1000,10);
        developProgrammer.workerInfo();
    }
}
