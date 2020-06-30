package com.oc.clientUI.beans;

public class BookBean {
    private Long id;
    private String title;
    private String autor;
    private int nbTotal;
    private int nbRemaining;
    private String image;

    public BookBean() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", nbTotal=" + nbTotal +
                ", nbRemaining=" + nbRemaining +
                '}';
    }
}
