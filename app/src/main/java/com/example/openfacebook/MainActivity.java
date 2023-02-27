package com.example.openfacebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AppCompatButton groupBtn, profileBtn, pageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupBtn = findViewById(R.id.groupId);
        profileBtn = findViewById(R.id.profileId);
        pageBtn = findViewById(R.id.pageId);

        groupBtn.setOnClickListener(v->{
            String facebookId = "fb://group/847105873314263";
            String urlPage = "https://www.facebook.com/groups/847105873314263";

            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
            }catch (Exception e){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
            }
        });

        profileBtn.setOnClickListener(v->{
            String facebookId = "fb://profile/100005989143094";
            String urlPage = "https://www.facebook.com/hridoykrisnadas";

            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
            }catch (Exception e){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
            }
        });

        pageBtn.setOnClickListener(v->{
            String facebookId = "fb://profile/100085028771698";
            String urlPage = "https://www.facebook.com/people/Bitan-Kumar/100085028771698";

            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
            }catch (Exception e){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
            }
        });
    }
}