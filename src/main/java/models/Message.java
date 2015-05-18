package models;

/**
 * Created by Тиофей on 17.05.2015.
 */
public class Message {
    private String text;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
