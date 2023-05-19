package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.dao.UserDao;

public class Main {
    public static void main(String[] args) {
//        User user = new User("user1", "email1", "pass1");
//        UserDao userDao = new UserDao();
//        System.out.println(userDao.create(user) + "\n");
        User user2 = new User("user2", "email2", "pass2");
//        System.out.println(userDao.create(user2) + "\n");
//        User user3 = new User("user3", "email3", "pass3");
//        System.out.println(userDao.create(user3) + "\n");

        UserDao userDao = new UserDao();
        User user = userDao.read(2);
        System.out.println(user + "\n" + user.checkPassword("pass2"));
        System.out.println(user2 + "\n" + user2.checkPassword("pass2"));


        User user111 = userDao.create(new User("user4", "email4", "pass4"));
        System.out.println(user111 + "\n" + user111.checkPassword("pass4"));

        userDao.findAll().forEach(System.out::println);

        user.setUserName("user2");
        user.setEmail("email2");
        user.setPassword("pass2");
        userDao.update(user);

        System.out.println();


        userDao.delete(11);

        userDao.findAll().forEach(System.out::println);

    }
}