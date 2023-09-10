package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

//        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUserName("Karol");
//        user.setEmail("Karol@gmail.pl");
//        user.setPassword("haslo22");
//        userDao.create(user);


//        UserDao userDao = new UserDao();
//        User userToUpdate = new User();
//        userToUpdate.setUserName("Pawel");
//        userToUpdate.setEmail("Pawel@o2.pl");
//        userToUpdate.setPassword("haslo1");
//        userDao.update(1, userToUpdate);


//        UserDao userDao = new UserDao();
//        User user = userDao.read(1);
//          if (user == null) {
//            System.out.println("null");
//        } else {
//            System.out.println(user);}

//        UserDao userDao = new UserDao();
//        userDao.delete(1);

        UserDao UserDao = new UserDao();
        User[] all = UserDao.findAll();
        for (User u : all) {
            System.out.println(u); }

    }
}
