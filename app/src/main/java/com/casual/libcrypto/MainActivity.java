package com.casual.libcrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainPlain", "oncreate");
        String enTxt = JniCallNative.Encrypt("this is test string!");
        Log.d("MainPlain", enTxt);
        String deTxt = JniCallNative.Decrypt(enTxt);
        Log.d("MainPlain", deTxt);
//        String enTxt01 = CryptoUtils.encrypt("this is test string!");
//        Log.d("MainPlain", enTxt);
        String deTxt01 = CryptoUtils.decrypt(enTxt);
        Log.d("MainPlain", deTxt01);
    }
}