package com.android.a_mace.gradecalculator;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn(View view) {
        String username = getStringFromEditText(R.id.username);
        String password = getStringFromEditText(R.id.password);
        System.out.println(username + " " + password + " logging in...");
    }

    private String getStringFromEditText(int id) {
        EditText et = (EditText)findViewById(id);
        String etString = et.getText().toString();
        return etString;
    }
}
