package com.example.mytnh;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class baseACT< T extends ViewBinding> extends AppCompatActivity implements View.OnClickListener {
    protected T binding ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = initViewBinding();
        setContentView(binding.getRoot());
        initViews();
    }

    protected abstract void initViews();

    protected abstract T initViewBinding();


    @Override
    public void onClick(View view) {

    }
}
