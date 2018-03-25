package ReservationRestaurants;

import java.util.ArrayList;
import java.util.List;

public class ListOfRestaurants {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void deleteRestaurant(Restaurant restaurant){
        restaurants.remove(restaurant);
    }

    public String toString(){
        return "Рестораны={"+restaurants+"}";
    }
}
