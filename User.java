package ReservationRestaurants;

public class User {
    private final String name;

    public User (String name){
        this.name = name;
    }

    public void Like(Restaurant restaurant){
        restaurant.Like();
    }

    public void CreateNewReview(Restaurant restaurant,String author, String date, String review  ){
        Review r1 = new Review(author,date,review);
        restaurant.Comment(r1);
    }

    public String ViewReviews(Restaurant restaurant){
        return restaurant.getReviews();
    }

    public String ViewTheList(ListOfRestaurants ListName){
        return ListName.toString();
    }

    public String Reserve(Restaurant restaurant, String time, String date){

            restaurant.Reserve();

            return "Вы забронировали столик в ресторане '"+ restaurant.getName()+
                "', в городе "+restaurant.getCity()+
                ", по адресу:"+restaurant.getAddress()+
                ", на "+ time+
                ", "+date;
    }

    public String DeleteReserve(Restaurant restaurant){
        restaurant.DeleteReserve();
        return "Вы отменили бронь столика в ресторане'"+ restaurant.getName()+"'. Хорошего дня!";
    }

}

