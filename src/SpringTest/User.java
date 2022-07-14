package SpringTest;

public class User {
    private String userName;
    private String addr;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void add(){
        System.out.println("User的add");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println(this.userName);
        System.out.println(this.addr);
    }
}
