package ReservationRestaurants;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final String description;
    private int freeTables;
    private final String address;
    private final String city;
    private int likes;
    private int comments;
    private final List<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String description, int tables, int freeTables, String city, String address, int likes, int comments) {
        this.name = name;
        this.description = description;
        this.freeTables = freeTables;
        this.city = city;
        this.address = address;
        this.likes = likes;
        this.comments = comments;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return  address;
    }

    public void Like(){
        likes+=1;
    }
    public void Reserve(){
        if (freeTables==0){
            throw new IllegalArgumentException("Все места заняты, выберите другой ресторан:)");
        } else
        freeTables-=1;
    }
    public void DeleteReserve(){
        freeTables+=1;
    }
    public void Comment(Review review){
        reviews.add(review);
    }
    public String getReviews(){
        return "Reviews="+reviews;
    }

    public String getCity(){
        return city;
    }


    public String toString(){
    return "Название='"+name+'\''+
            ", город="+city+
            ", описание="+description+
            ", количество свободных столов="+freeTables+
            ", адрес="+address+
            ", лайки="+likes+
            ", комментарии ="+comments+"}";
    }



}
