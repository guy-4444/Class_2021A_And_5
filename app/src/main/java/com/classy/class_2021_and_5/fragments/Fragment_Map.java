package com.classy.class_2021_and_5.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.classy.class_2021_and_5.callbacks.CallBack_Bottom;
import com.classy.class_2021_and_5.R;

public class Fragment_Map extends Fragment {

    private TextView map_LBL_location;

    private CallBack_Bottom callBack_bottom;

    public void setCallBack_bottom(CallBack_Bottom callBack_bottom) {
        this.callBack_bottom = callBack_bottom;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("pttt", "onCreateView - Fragment_List");

        View view = inflater.inflate(R.layout.fragment_map, container, false);
        findViews(view);
        initViews();

        return view;
    }

    public void addMarker(double lat, double lon) {
        map_LBL_location.setText(lat + "\n" + lon);
    }

    private void initViews() {

    }



    private void findViews(View view) {
        map_LBL_location = view.findViewById(R.id.map_LBL_location);
    }
}
