package com.example.deep_skku;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {
    LinearLayout second_second_first_btn;
    LinearLayout second_second_second_btn;
    LinearLayout second_second_third_btn;
    View root;
    static int fragment_switch = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        root = inflater.inflate(R.layout.fragment_two, container, false);

        second_second_first_btn = root.findViewById(R.id.second_second_first_btn);
        second_second_second_btn = root.findViewById(R.id.second_second_second_btn);
        second_second_third_btn = root.findViewById(R.id.second_second_third_btn);



        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
