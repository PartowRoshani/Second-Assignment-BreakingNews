package AP;

import java.time.LocalDate;
import ir.huri.jcal.JalaliCalendar;

public class News {
    final private String title;
    final private String description;
    final private String sourceName;
    final private String author;
    final private String url;
    final private String publishedAt;
    public News(String title , String description , String sourceName , String author , String url , String publishedAt)
    {
        this.title = title;
        this.description = description;
        this.sourceName = sourceName;
        this.author = author;
        this.url = url;
        this.publishedAt = publishedAt;
    }
    public void displayNews()
    {
        System.out.println("title : " + title);
        System.out.println("Description : "+ description);
        System.out.println("Source Name : "+sourceName);
        System.out.println("Author : "+ author);
        System.out.println("Url : "+ url);
        System.out.println("Published At : " + publishedAt);

    }

    public String getTitle() {
        return title;
    }
}
