package cn.mtianyan.bug;

public class TestProgrammer extends Programmer {
    public TestProgrammer(){

    }
    public TestProgrammer(String workerName, int usefulCodeNum, int bugCodeNum) {
        this.setWorkerName(workerName);
        this.setUsefulCodeNum(usefulCodeNum);
        this.setUsefulCodeNum(bugCodeNum);
    }
    public void workerInfo(){
        System.out.print(this.getWorkerName()+"类测试: "+this.getWorkerName()+"的日报是: 今天编写了"+this.getUsefulCodeNum());
        System.out.printf("个测试用例，发现了"+this.getBugCodeNum()+"个bug");
    }
}
