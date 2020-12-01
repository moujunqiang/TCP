package com.loumeng.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import com.loumeng.Bluetooth.R;

import java.util.Arrays;
import java.util.List;

public class HistoryActivity extends Activity {

    private RecyclerView mRvHistory;
    private HistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        initView();
    }

    /**
     * 获取数据
     * @return
     */
    public List<String> getHistoryData() {
        //通过edittext保存数据  data为name ,MODE_PRIVATE保存模式，
        SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);
        String history = data.getString("history", "");
        //保存的数据为一条条通过逗号隔开，这个通过逗号分割出字符串数组 设置数据
        String[] split = history.split(",");
        return Arrays.asList(split);
    }

    private void initView() {
        mRvHistory = (RecyclerView) findViewById(R.id.rv_history);
        mRvHistory.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HistoryAdapter();
        List<String> historyData = getHistoryData();
        adapter.setHistoryBeans(historyData);
        mRvHistory.setAdapter(adapter);
    }
}