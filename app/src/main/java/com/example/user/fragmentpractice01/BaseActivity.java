package com.example.user.fragmentpractice01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 2019-05-11.
 */

public abstract class BaseActivity extends AppCompatActivity{

    public Context mContext = this;
    public abstract void setupEvents();
    public abstract void setValues();
    public abstract void bindViews();

}
