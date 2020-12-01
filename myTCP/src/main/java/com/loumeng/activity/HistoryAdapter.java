package com.loumeng.activity;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.loumeng.Bluetooth.R;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryHolder> {
    List<String> historyBeans;

    public void setHistoryBeans(List<String> historyBeans) {
        this.historyBeans = historyBeans;
    }

    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, null, false);
        return new HistoryHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {
        String historyBean = historyBeans.get(position);
        holder.tvContent.setText(historyBean);
    }

    @Override
    public int getItemCount() {
        return historyBeans == null ? 0 : historyBeans.size();
    }

    public class HistoryHolder extends RecyclerView.ViewHolder {
        private TextView tvContent;

        public HistoryHolder(@NonNull View itemView) {
            super(itemView);
            tvContent = itemView.findViewById(R.id.tv_content);
        }
    }
}
