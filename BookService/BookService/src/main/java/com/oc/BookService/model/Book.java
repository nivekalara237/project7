package com.oc.BookService.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 3,max = 100,message = "Le titre doit être compris entre 3 et 100 caractères.")
    private String title;
    @Length(min = 3,max = 45,message = "L'auteur doit être compris entre 3 et 100 caractères.")
    private String autor;
    private int nbTotal;
    private int nbRemaining;

    public Book() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNbTotal() {
        return nbTotal;
    }
    public void setNbTotal(int nbTotal) {
        this.nbTotal = nbTotal;
    }

    public int getNbRemaining() {
        return nbRemaining;
    }
    public void setNbRemaining(int nbRemaining) {
        this.nbRemaining = nbRemaining;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", nbTotal=" + nbTotal +
                ", nbRemaining=" + nbRemaining +
                '}';
    }
}
