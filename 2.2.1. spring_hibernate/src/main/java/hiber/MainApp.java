package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

//
//      Car car1 = new Car("Nissan", 2656);
//      User user1 = new User("Ivan", "Petrov", "ipetrov@mail.ru");
//      user1.setUserCar(car1);
//      userService.add(user1);
//
//      Car car2 = new Car("Toyota", 12345);
//      User user2 = new User("Sergey", "Ivanov", "s_ivanov@mail.ru");
//      user2.setUserCar(car2);
//      userService.add(user2);
//
//      Car car3 = new Car("BMW", 54312);
//      User user3 = new User("Mario", "Lanza", "m_lanza@mail.ru");
//      user3.setUserCar(car3);
//      userService.add(user3);
//
//      Car car4 = new Car("Fiat", 87824);
//      User user4 = new User("Enrico", "Caruso", "caruso@mail.ru");
//      user4.setUserCar(car4);
//      userService.add(user4);

      userService.showUserByCar("Fiat",87824);
      userService.showUserByCar("BMW",54312);


//      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
//
//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println(user);
//      }

      context.close();
   }
}
