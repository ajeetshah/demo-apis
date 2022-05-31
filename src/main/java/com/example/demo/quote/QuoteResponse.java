package com.example.demo.quote;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
public class QuoteResponse {

    public String text;
    public String author;

    private Integer getTodaysDayOfWeek() {
        final Calendar c = Calendar.getInstance();
        return c.get(Calendar.DAY_OF_WEEK);
    }

    public QuoteResponse() {
        Integer day = getTodaysDayOfWeek();
        System.out.println(day);
        switch (day) {
            case 1:
                this.text = "So many books, so little time.";
                this.author = "Frank Zappa";
                break;
            case 2:
                this.text = "Be the change that you wish to see in the world.";
                this.author = "Mahatma Gandhi";
                break;
            case 3:
                this.text = "Without music, life would be a mistake.";
                this.author = "Friedrich Nietzsche";
                break;
            case 4:
                this.text = "Imperfection is beauty, madness is genius and it's better to be absolutely ridiculous than absolutely boring.";
                this.author = "Marilyn Monroe";
                break;
            case 5:
                this.text = "I have not failed. I've just found 10,000 ways that won't work.";
                this.author = " Thomas A. Edison";
                break;
            case 6:
                this.text = "It is never too late to be what you might have been.";
                this.author = "George Eliot";
                break;
            case 7:
                this.text = "Everything you can imagine is real.";
                this.author = "Pablo Picasso";
                break;
            default:
                this.text = "Life isn't about finding yourself. Life is about creating yourself.";
                this.author = "George Bernard Shaw";
        }

    }
}
