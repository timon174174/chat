package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Тиофей on 17.05.2015.
 */
public class Chat {
    private List<Message> messages = new ArrayList<Message>();

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
