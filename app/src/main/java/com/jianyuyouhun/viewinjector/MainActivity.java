package com.jianyuyouhun.viewinjector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jianyuyouhun.inject.ViewInjector;
import com.jianyuyouhun.inject.annotation.FindViewById;

public class MainActivity extends AppCompatActivity {

    @FindViewById(R.id.hello_world)
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.inject(this);
        mTextView.setText("inject success");
    }
}
