package com.example.android.conde.com.onenoteredesign.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.android.conde.com.onenoteredesign.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText mUserName, mPassword;
    private Button mLogin;
    private ProgressBar mLoginProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserName = findViewById(R.id.et_username);
        mLoginProgressBar = findViewById(R.id.login_progress);
        mPassword = findViewById(R.id.et_password);
        mLogin = findViewById(R.id.btn_login);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToMainActivity();
            }
        });


        mPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    if (isAuthValid()) {
                        enableLoginButton();
                    } else {
                        disableLoginButton();
                    }
                }
                return false;
            }
        });
    }


    private void moveToMainActivity() {
        mLogin.setVisibility(View.INVISIBLE);
        mLoginProgressBar.setVisibility(View.VISIBLE);
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();

    }


    private boolean isAuthValid() {
        if (mUserName.getText() != null && mPassword.getText() != null) {
            if (!mUserName.getText().toString().equals("")
                    && !mPassword.getText().toString().equals("")) {
                return true;
            }
        }
        return false;
    }


    private void enableLoginButton() {
        mLogin.setBackgroundColor(getColor(R.color.colorAccent));
        mLogin.setClickable(true);
    }


    private void disableLoginButton() {
        mLogin.setBackgroundColor(getColor(R.color.button_disabled));
        mLogin.setClickable(false);
    }


}
