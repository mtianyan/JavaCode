package cn.mtianyan.bug;

public class DevelopProgrammer extends Programmer {
    public DevelopProgrammer(String workerName, int usefulCodeNum, int bugCodeNum) {
        this.setWorkerName(workerName);
        this.setUsefulCodeNum(usefulCodeNum);
        this.setUsefulCodeNum(bugCodeNum);
    }
    public void workerInfo(){
        System.out.print(this.getWorkerName()+"信息类测试: "+this.getWorkerName()+"的日报是: 今天编写了"+this.getUsefulCodeNum());
        System.out.printf("行代码，目前仍然有"+this.getBugCodeNum()+"个bug没有解决");
    }
}
