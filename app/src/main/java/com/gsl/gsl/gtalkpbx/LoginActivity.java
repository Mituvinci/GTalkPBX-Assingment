package com.gsl.gsl.gtalkpbx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private  Button mButtonLogin;
    private EditText mEditTextAccountId;
    private EditText mEditTextExtension;
    private EditText mEditTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mButtonLogin = (Button) findViewById(R.id.button_login);
        mEditTextAccountId = (EditText) findViewById(R.id.edit_text_account_id);
        mEditTextExtension = (EditText) findViewById(R.id.edit_text_extension);
        mEditTextPassword = (EditText) findViewById(R.id.edit_text_password);

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }
}
