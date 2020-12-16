package www.sumanmyon.com.diareev2.Register.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import www.sumanmyon.com.diareev2.R;
import www.sumanmyon.com.diareev2.Register.Presenter.RegisterPresenter;
import www.sumanmyon.com.diareev2.Register.Presenter.RegisterPresenterInterface;

public class RegisterActivity extends AppCompatActivity implements RegisterView {

    private EditText fullNameEditText, emailEditText, addressEditText, phoneNoEditText, userNameEditText, passwordEditText, re_passwordEditText;
    private CheckBox acceptCheckBox;
    private Button registerButton;

    private RegisterPresenterInterface presenter;

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

        //todo calling presenter
        presenter = new RegisterPresenter(this);
        //presenter.checkEditTxtNCheckBoxFields();

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkEditTxtNCheckBoxFields();
            }
        });
    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void setFullName(String message) {
        fullNameEditText.setError(message);
    }

    @Override
    public void setEmail(String message) {
        emailEditText.setError(message);
    }

    @Override
    public void setAddress(String message) {
        addressEditText.setError(message);
    }

    @Override
    public void setPhoneNo(String message) {
        phoneNoEditText.setError(message);
    }

    @Override
    public void setUserName(String message) {
        userNameEditText.setError(message);
    }

    @Override
    public void setPassword(String message) {
        passwordEditText.setError(message);
    }

    @Override
    public void setRePassword(String message) {
        re_passwordEditText.setError(message);
    }

    @Override
    public void setCheckAccept(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    public EditText getFullNameEditText() {
        return fullNameEditText;
    }

    public EditText getEmailEditText() {
        return emailEditText;
    }

    public EditText getAddressEditText() {
        return addressEditText;
    }

    public EditText getPhoneNoEditText() {
        return phoneNoEditText;
    }

    public EditText getUserNameEditText() {
        return userNameEditText;
    }

    public EditText getPasswordEditText() {
        return passwordEditText;
    }

    public EditText getRe_passwordEditText() {
        return re_passwordEditText;
    }

    public CheckBox getAcceptCheckBox() {
        return acceptCheckBox;
    }
}
