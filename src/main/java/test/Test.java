package test;

import manager.EventManager;
import manager.UserManager;
import model.Event;
import model.EventType;
import model.User;

import java.sql.SQLException;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        EventManager eventManager = new EventManager();

       // Event event = new Event("World football championship", "Qatar", false, 80.5, EventType.SPORT_EVENT);
        try {
           // eventManager.addEvent(event);
           // System.out.println(event);
            List<Event> allEvent = eventManager.showEvents();
            for (Event event : allEvent) {
                System.out.println(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
       // User user = new User("poxos", "poxosyan", "poxos@maoil.ru", event.getId());
        try {
          //  userManager.addUser(user);
          //  System.out.println(user);
            List<User> allUser = userManager.showUsers();
            for (User user : allUser) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
