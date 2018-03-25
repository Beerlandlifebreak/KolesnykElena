package ReservationRestaurants;

import java.util.Date;

public class Review {
    private final String author;
    private final String date;
    private final String comment;

    public Review (String author, String date, String comment){
        this.author = author;
        this.date = date;
        this.comment = comment;
    }

    public String toString() {
        return "Автор:"+author+", отзыв:'"+comment+"', дата:"+date;
    }
}
