package com.loumeng.activity;

import android.os.Bundle;
import android.view.Window;

import com.loumeng.Bluetooth.R;

public class MainActivity extends TCPchat {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ly_tcpchat);

        //初始化控件
        initUI();

    }

      private void initUI(){

      }
}



