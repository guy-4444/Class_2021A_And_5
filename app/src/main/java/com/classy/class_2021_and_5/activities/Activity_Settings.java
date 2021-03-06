package com.classy.class_2021_and_5.activities;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.classy.class_2021_and_5.callbacks.CallBack_Top;
import com.classy.class_2021_and_5.fragments.Fragment_List;

public class Activity_Settings extends AppCompatActivity implements CallBack_Top {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        Fragment_List fragment_list = new Fragment_List();
        fragment_list.setCallBack_top(this);
    }

    @Override
    public void updateTitle(String str) { }

    @Override
    public void addMarkerToMap(double lat, double lon) { }
}
