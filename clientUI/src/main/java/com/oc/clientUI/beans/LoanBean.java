package com.oc.clientUI.beans;
import java.sql.Date;

public class LoanBean {
    private Long id;
    private UserBean user;
    private BookBean book;
    private Date dateStart;
    private Date dateEnd;
    private boolean extension;
    private boolean returned;

    public LoanBean() {
        this.user = new UserBean();
        this.book = new BookBean();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }


    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public BookBean getBook() {
        return book;
    }

    public void setBook(BookBean book) {
        this.book = book;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public boolean isExtension() {
        return extension;
    }

    public void setExtension(boolean extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "LoanBean{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", extension=" + extension +
                ", returned=" + returned +
                '}';
    }
}
