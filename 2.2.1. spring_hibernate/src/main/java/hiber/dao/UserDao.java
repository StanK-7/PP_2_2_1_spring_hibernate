package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.ui.Model;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

   void showUserByCar(String model, int series);
}
