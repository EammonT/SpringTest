package SpringTest.BeanLife;

public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步 执行无参构造");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 设置属性值");
    }
    //创建执行初始化的方法
    public void initMethod(){
        System.out.println("第三步 执行初始化方法");
    }
    //创建销毁的方法
    public void destroyMethod(){
        System.out.println("第五步 执行销毁方法");
    }
}
