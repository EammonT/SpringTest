package SpringTest.service;

import SpringTest.DAO.UserDAO;
import SpringTest.DAO.UserDAOImpl;

public class UserService {

    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(){
        System.out.println("service add .....");
        userDAO.update();
//        UserDAO userdao = new UserDAOImpl();
//        userdao.update();

    }
}
