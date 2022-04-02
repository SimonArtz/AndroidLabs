package com.cst2355.artz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatRoomActivity extends AppCompatActivity {
    Button sendButton;
    Button recieveButton;
    EditText inputText;
    ListView messageList;
    ArrayList<Message> messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ///send Btn = find send btn
        //MessageAdapter myAd;








        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
    }
}