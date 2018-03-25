package ReservationRestaurants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ReservationRunner {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Elisabet","Русская и украинская кухня",15,15,"Киев","ул.Левандовская 3а",1, 5);
        Restaurant restaurant2 = new Restaurant("Mafia","Японская и итальянская кухня",25,25,"Полтава","Харьковское шоссе", 2, 3);

        ListOfRestaurants list1 = new ListOfRestaurants();
        list1.addRestaurant(restaurant1);

        list1.deleteRestaurant(restaurant1);

        list1.addRestaurant(restaurant1);
        list1.addRestaurant(restaurant2);

        User user1 = new User("Veronika");
        User user2 = new User("Elena");

        user1.Like(restaurant1);
        user1.CreateNewReview(restaurant1,"Veronika","25-03-2018","Cool cafe");

        user2.Like(restaurant2);
        user2.CreateNewReview(restaurant1,"Elena","23-03-2018","Bad.Very bad!");



        System.out.println(user1.ViewTheList(list1));
        System.out.println(user1.ViewReviews(restaurant1));
        System.out.println();
        System.out.println(user1.Reserve(restaurant1,"10:00","29.03.2018"));
        System.out.println(user1.DeleteReserve(restaurant1));



    }

}
