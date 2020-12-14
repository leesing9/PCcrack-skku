package com.example.deep_skku;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;

    LinearLayout First_MainActivity_btn;
    LinearLayout Second_MainActivity_btn;
    LinearLayout Third_MainActivity_btn;
    LinearLayout Fourth_MainActivity_btn;
    static int fragment_switch = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        First_MainActivity_btn = findViewById(R.id.Second_MainActivity_btn1);
        First_MainActivity_btn.setOnClickListener(this);
        Second_MainActivity_btn = findViewById(R.id.Second_MainActivity_btn2);
        Second_MainActivity_btn.setOnClickListener(this);
        Third_MainActivity_btn = findViewById(R.id.Second_MainActivity_btn3);
        Third_MainActivity_btn.setOnClickListener(this);
        Fourth_MainActivity_btn = findViewById(R.id.Second_MainActivity_btn4);
        Fourth_MainActivity_btn.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.Second_MainActivity_btn1) {
            sendTakePhotoIntent();
        }

        if (v.getId() == R.id.Second_MainActivity_btn2) {
            fragment_switch = 2;
            Intent intent = new Intent(this, Second_MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.Second_MainActivity_btn3) {
            fragment_switch = 3;
            Intent intent = new Intent(this, Second_MainActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.Second_MainActivity_btn4) {
            fragment_switch = 4;
            Intent intent = new Intent(this, Second_MainActivity.class);
            startActivity(intent);
        }

        }

    private void sendTakePhotoIntent() {

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);
        }
    }

}