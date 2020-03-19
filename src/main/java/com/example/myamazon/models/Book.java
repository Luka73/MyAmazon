package com.example.myamazon.models;

import com.example.myamazon.enumType.BookFormat;
import javax.persistence.*;
import javax.validation.constraints.DecimalMax;

@Entity
@Table(name="book")
public class Book extends BaseEntity {

    @Column
    private String title;
    @Column
    private double price;
    @Column
    private int pages;
    @Column
    private String synopsis;
    @DecimalMax("5.0")
    @Column
    private double avgRating;
    @Column
    private BookFormat bookFormat;
    @Column
    private int volume;
    @Column
    private int edition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public BookFormat getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(BookFormat bookFormat) {
        this.bookFormat = bookFormat;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

}
