package com.example.takumin.bgmcuration;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by takumin on 2015/01/21.
 */
public class PlayListAdapter extends BaseAdapter {
    private Context context = null;
    private int resourse = 0;
    private ArrayList<LauncherActivity.ListItem> data = null;

    public PlayListAdapter(Context context, ArrayList<LauncherActivity.ListItem> data, int resourse){
        this.context = context;
        this.data = data;
        this.resourse = resourse;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity)context;
        LinearLayout v = (LinearLayout)activity.getLayoutInflater().inflate(resourse,null);
        return v;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0 ;
    }
}
