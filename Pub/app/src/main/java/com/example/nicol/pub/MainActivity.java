package com.example.nicol.pub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edit)
    EditText edit ;
    @BindView(R.id.btn_wybierzDrinka)
    Button btn_wybierzDrinka ;

    @OnClick(R.id.btn_wybierzDrinka)
    void OnClick(){
        Intent intent = new Intent( MainActivity.this, Main2Activity.class);

        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
