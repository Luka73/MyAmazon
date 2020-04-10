package com.example.myamazon.models;

import com.example.myamazon.enumTypes.BookFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name="book")
public class Book extends BaseEntity {

    @NotNull
    @Column
    private String title;

    @NotNull
    @Column
    private double price;

    @NotNull
    @Column
    private int pages;

    @Column
    private String synopsis;

    @DecimalMax("5.0")
    @Column
    private double avgRating;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column
    private BookFormat bookFormat;

    @Column
    private int volume;

    @Column
    private int edition;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("books")
    @JoinTable(
            name = "book_contributor",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "contributor_id"))
    private Set<Contributor> contributors;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("books")
    @JoinTable(
            name = "book_language",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    private Set<Language> languages;

    @ManyToOne
    @JsonIgnoreProperties("books")
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

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

    public String getSynopsis() { return synopsis; }

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

    public Set<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(Set<Contributor> contributors) {
        this.contributors = contributors;
    }

   public Set<Language> getLanguages() { return languages; }

    public void setLanguages(Set<Language> languages) { this.languages = languages; }

    public Publisher getPublisher() { return publisher; }

    public void setPublisher(Publisher publisher) { this.publisher = publisher; }
}
