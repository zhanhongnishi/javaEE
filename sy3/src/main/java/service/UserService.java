package service;

import dao.UserDao;

public class UserService {
    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void GetUser() {
        userDao.UserSaying();
    }

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
}
