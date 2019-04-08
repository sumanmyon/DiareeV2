package www.sumanmyon.com.diareev2.Register.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import www.sumanmyon.com.diareev2.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText fullNameEditText, emailEditText, addressEditText, phoneNoEditText, userNameEditText, passwordEditText, re_passwordEditText;
    private CheckBox acceptCheckBox;
    private Button registerButton;

    private void bindingViews(){
        fullNameEditText = (EditText)findViewById(R.id.register_edit_name);
        emailEditText = (EditText)findViewById(R.id.register_edit_email);
        addressEditText = (EditText)findViewById(R.id.register_edit_address);
        phoneNoEditText = (EditText)findViewById(R.id.register_edit_phoneno);
        userNameEditText = (EditText)findViewById(R.id.register_edit_user_name);
        passwordEditText = (EditText)findViewById(R.id.register_edit_password);
        re_passwordEditText = (EditText)findViewById(R.id.register_edit_repassword);
        acceptCheckBox = (CheckBox) findViewById(R.id.register_check_accept);
        registerButton = (Button) findViewById(R.id.register_button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //todo Binding views
        bindingViews();

    }
}
