package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherUserProfile extends AppCompatActivity {
    Bundle arguments;
    ImageView avatar;
    TextView username, tv_link, tv_specialization, textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_show);
        arguments = getIntent().getExtras();

        username = findViewById(R.id.username);
        username.setText(arguments.get("username").toString());

        tv_link = findViewById(R.id.tv_link);
        tv_link.setText(arguments.get("link").toString());

        tv_specialization = findViewById(R.id.tv_specialization);
        tv_specialization.setText(arguments.get("specialisation").toString());

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnotherUserProfile.this, SubscriptionsActivity.class);
                intent.putExtra("id", arguments.get("ideaid").toString());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }
}
