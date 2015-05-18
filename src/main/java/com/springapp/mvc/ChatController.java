package com.springapp.mvc;

import models.Chat;
import models.Message;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Тиофей on 17.05.2015.
 */
@Controller
@EnableWebMvc
@RequestMapping(value = "/chat")
public class ChatController {


    private Chat chat = new Chat();

    @RequestMapping(value = "/get_chat")
    public @ResponseBody Chat getChat(){
        return chat;
    }

    @RequestMapping(value = "/add_user")
    public @ResponseBody String adduser(@RequestParam(value = "username") String username,@RequestParam(value = "message") String message){
        User user = new User();
        user.setName(username);
        Message message1 = new Message();
        message1.setText(message);
        message1.setUser(user);
        chat.getMessages().add(message1);

        return "Ok";
    }
}

