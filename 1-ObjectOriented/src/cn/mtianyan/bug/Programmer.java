package cn.mtianyan.bug;

public class Programmer {
    public String getWorkerName() {
        return workerName;
    }
    public Programmer(){

    }
    public Programmer(String workerName, int usefulCodeNum, int bugCodeNum) {
        this.workerName = workerName;
        this.usefulCodeNum = usefulCodeNum;
        this.bugCodeNum = bugCodeNum;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getUsefulCodeNum() {
        return usefulCodeNum;
    }

    public void setUsefulCodeNum(int usefulCodeNum) {
        this.usefulCodeNum = usefulCodeNum;
    }

    public int getBugCodeNum() {
        return bugCodeNum;
    }

    public void setBugCodeNum(int bugCodeNum) {
        this.bugCodeNum = bugCodeNum;
    }

    private String workerName;
    private int usefulCodeNum;
    private int bugCodeNum;
    public void workerInfo(){
        System.out.println("父类信息测试: 开心工作");
    }
}
