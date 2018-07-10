package com.luisro00005513.pdmparcial3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private RelativeLayout act_RelativeLayout;
    private ImageView act_login_image;
    private EditText act_login_edit_username;
    private EditText act_login_edit_password;
    private Button act_login_btn_login;
    private LinearLayout act_login_LinearLayout;
    private TextView act_login_TextView_msg;
    private Button act_login_btn_signin;
    private ProgressBar act_login_progbar_signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        referids();
    }

    public void referids(){
        act_RelativeLayout = findViewById(R.id.login_relativeLayout_mainContainer);
        act_login_image = findViewById(R.id.login_imageView_logo);
        act_login_edit_username = findViewById(R.id.login_editText_username);
        act_login_edit_password = findViewById(R.id.login_editText_password);
        act_login_btn_login = findViewById(R.id.login_button_logIn);
        act_login_btn_signin = findViewById(R.id.login_button_signIn);
        act_login_LinearLayout = findViewById(R.id.login_linearLayout_divisor);
        act_login_TextView_msg = findViewById(R.id.login_textView_signInMessage);
        act_login_progbar_signin = findViewById(R.id.login_progressBar_loading);
    }
}
