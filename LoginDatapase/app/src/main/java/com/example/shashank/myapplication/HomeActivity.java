package com.example.shashank.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button b;
    ImageView img;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.imageView4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.mipmap.cfaa844d42531b3b0bfc76774bb593f333);
            }
        });


        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        TextView title = findViewById(R.id.toolbar_title);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "you clicked in left icon", Toast.LENGTH_SHORT).show();
            }
        });
        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });

        title.setText("Abant Izzet Baysal Üniversitiesi");
    }


    private void showMenu(View v){
        PopupMenu popupMenu = new PopupMenu(HomeActivity.this,v);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.one)
                    Toast.makeText(HomeActivity.this, "Beklediğin için teşekkürler", Toast.LENGTH_SHORT).show();
                if (item.getItemId() == R.id.two)
                    Toast.makeText(HomeActivity.this, "Beklediğin için teşekkürler", Toast.LENGTH_SHORT).show();
                if (item.getItemId() == R.id.three)
                    Toast.makeText(HomeActivity.this, "Beklediğin için teşekkürler", Toast.LENGTH_SHORT).show();
                return true;
            }


        });

        popupMenu.show();

    }














}