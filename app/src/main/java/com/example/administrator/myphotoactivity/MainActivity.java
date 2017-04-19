package com.example.administrator.myphotoactivity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        new AlertDialog.Builder(this).setItems(new String[]{"拍照", "从相册取"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                PhotoActivity.startActivity(MainActivity.this, PhotoActivity.PHOTO_REQUEST_TAKEPHOTO, MainActivity.class.getName());
                                break;
                            case 1:
                                PhotoActivity.startActivity(MainActivity.this, PhotoActivity.PHOTO_REQUEST_GALLERY, MainActivity.class.getName());

                        }
                    }
                }
        ).setTitle("获取图片").create().show();
    }
}
