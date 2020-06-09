package com.oc.clientUI.beans;
import java.sql.Date;

public class LoanBean {
    private Long id;
    private Long idUser;
    private Long idBook;
    private Date dateStart;
    private int nbExtension;
    private boolean returned;

    public LoanBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public int getNbExtension() {
        return nbExtension;
    }

    public void setNbExtension(int nbExtension) {
        this.nbExtension = nbExtension;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "LoanBean{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idBook=" + idBook +
                ", dateStart=" + dateStart +
                ", nbExtension=" + nbExtension +
                ", returned=" + returned +
                '}';
    }
}
