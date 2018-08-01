package cn.mtianyan.code;

public class CodeBlock {
    {
        System.out.println("CodeBlock的构造块");
    }
    public CodeBlock(){
        System.out.println("CodeBlock的构造方法");
    }
    static {
        System.out.println("CodeBlock的静态代码块");
    }

    public static void main(String[] args) {
        CodeBlock codeBlock;
        System.out.println("CodeBlock的主方法");
        System.out.println("产生Code类实例对象");
        Code code = new Code();
        System.out.println("产生CodeBlock实例对象");
        codeBlock = new CodeBlock();
    }
}
