package www.sumanmyon.com.diareev2.Register.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import www.sumanmyon.com.diareev2.R;

public class RegisterActivity extends AppCompatActivity implements RegisterView {

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

    @Override
    public void onSuccess(String message) {
        
    }

    @Override
    public void onFailure(String message) {

    }

    @Override
    public void setFullName(String message) {

    }

    @Override
    public void setEmail(String message) {

    }

    @Override
    public void setAddress(String message) {

    }

    @Override
    public void setPhoneNo(String message) {

    }

    @Override
    public void setUserName(String message) {

    }

    @Override
    public void setPassword(String message) {

    }

    @Override
    public void setRePassword(String message) {

    }

    @Override
    public void setCheckAccept(String message) {

    }
}
