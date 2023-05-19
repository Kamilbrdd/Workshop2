package Workshop;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User user = new User();
//        userDao.create(user, "Kamil", "jakisss@gmail.com", "dqweq");

        User read = userDao.read(15);
        System.out.println(read);
//
        User userToUpdate = userDao.read(15);
        userDao.update(userToUpdate, "sasssasasddassaad", "jasaassksssdadsdasdis@mail.com", "cosdstam");
        User read2 = userDao.read(15);
        System.out.println(read2);

//        userDao.findAll();
//        userDao.delete(11);
//        userDao.findAll();
    }
}
