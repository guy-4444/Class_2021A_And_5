package com.classy.class_2021_and_5.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.classy.class_2021_and_5.callbacks.CallBack_Top;
import com.classy.class_2021_and_5.fragments.Fragment_List;
import com.classy.class_2021_and_5.fragments.Fragment_Map;
import com.classy.class_2021_and_5.R;

public class Activity_Main extends AppCompatActivity {

    private FrameLayout main_LAY_list;
    private FrameLayout main_LAY_map;
    private TextView main_LBL_title;
    private Button main_BTN_updateList;

    private Fragment_List fragment_list;
    private Fragment_Map fragment_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();

        fragment_list = new Fragment_List();
        fragment_list.setCallBack_top(callBack_top);
        getSupportFragmentManager().beginTransaction().add(R.id.main_LAY_list, fragment_list).commit();


        fragment_map = new Fragment_Map();
        getSupportFragmentManager().beginTransaction().add(R.id.main_LAY_map, fragment_map).commit();
    }

    private void initViews() {
        main_BTN_updateList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_list.refreshList();
            }
        });
    }

    private void findViews() {
        main_LAY_list = findViewById(R.id.main_LAY_list);
        main_LAY_map = findViewById(R.id.main_LAY_map);
        main_LBL_title = findViewById(R.id.main_LBL_title);
        main_BTN_updateList = findViewById(R.id.main_BTN_updateList);
    }




    private CallBack_Top callBack_top = new CallBack_Top() {
        @Override
        public void updateTitle(String str) {
            main_LBL_title.setText(str);
        }

        @Override
        public void addMarkerToMap(double lat, double lon) {
            fragment_map.addMarker(lat, lon);
        }
    };
}