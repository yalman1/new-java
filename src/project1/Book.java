package project1;

import java.io.FileWriter;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int page;
    private int year;
   private boolean lost=false;

    public Book(String title, String author, String publisher, int page, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.page = page;
        this.year = year;
    }

    public Book(boolean lost) {
        this.lost = lost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", page=" + page +
                ", year=" + year +
                '}';
    }
}
