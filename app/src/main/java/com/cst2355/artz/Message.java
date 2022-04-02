package com.cst2355.artz;

import android.media.Image;
import android.provider.ContactsContract;
import android.widget.ImageView;

public class Message {
    String text;
    boolean ifSend;
    public Message(String text, boolean ifSend){
        this.text = text;
        this.ifSend = ifSend;
    }

    public String getText(){
       return text;
    }

    public boolean getIfSend(){
        return ifSend;
    }
}
