package com.example.user.fragmentpractice01.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.fragmentpractice01.R;
import com.example.user.fragmentpractice01.databinding.FregmentListItemBinding;

/**
 * Created by user on 2019-05-11.
 */

public class FragmentOne extends Fragment{

    FregmentListItemBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fregment_list_item, container, false);

        return binding.getRoot();


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.myTextView.setText("데이터바인딩");

    }
}
