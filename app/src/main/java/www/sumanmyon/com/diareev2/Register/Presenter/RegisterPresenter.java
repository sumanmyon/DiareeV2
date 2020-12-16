package www.sumanmyon.com.diareev2.Register.Presenter;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import www.sumanmyon.com.diareev2.Register.Model.RegisterModel;
import www.sumanmyon.com.diareev2.Register.Model.RegisterModelInterface;
import www.sumanmyon.com.diareev2.Register.View.RegisterActivity;

public class RegisterPresenter implements RegisterPresenterInterface{
    RegisterActivity view;
    RegisterModelInterface model;

    public RegisterPresenter(RegisterActivity registerActivity) {
        this.view = registerActivity;
        model = new RegisterModel(this);
    }

    @Override
    public void checkEditTxtNCheckBoxFields() {

        //String MobilePattern = "[0-9]{10}";   "^[+]?[0-9]{10,13}$";
        //String EMAIL_STRING = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        //            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        String fullName, email, address, phoneNo, userName, password, rePassword;
        boolean checkBox;

        fullName = view.getFullNameEditText().getText().toString();
        email = view.getEmailEditText().getText().toString();
        address = view.getAddressEditText().getText().toString();
        phoneNo = view.getPhoneNoEditText().getText().toString();
        userName = view.getUserNameEditText().getText().toString();
        password = view.getPasswordEditText().getText().toString();
        rePassword = view.getRe_passwordEditText().getText().toString();
        checkBox = view.getAcceptCheckBox().isChecked();

        if(TextUtils.isEmpty(fullName)){
            view.setFullName("Please type your full name");
        } else if(TextUtils.isEmpty(email) &&
                !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            view.setEmail("Please type valid email address");
        }else if(TextUtils.isEmpty(address)){
            view.setAddress("Please type your address");
        }else if(TextUtils.isEmpty(phoneNo) &&
                !Patterns.PHONE.matcher(phoneNo).matches()){
            view.setPhoneNo("Please type your phone number");
        }else if(TextUtils.isEmpty(userName)){
            view.setUserName("Please type your user name");
        }else if(TextUtils.isEmpty(password) &&
                !validPassword(password)){
            view.setPassword("Please type valid password");
        }else if(TextUtils.isEmpty(rePassword) &&
                rePassword.equals(password)){
            view.setRePassword("Please re type your password to confirm");
        }else if(!checkBox){
            view.setCheckAccept("Please accept terms and conditions to register.");
        }else {

            //todo if fields are not empty then put in data base
            model.createNewUserInDataBase(fullName,email,address,phoneNo,userName,password);
            view.onSuccess("Successfully register");
        }
    }

    @Override
    public Context getContext() {
        return view;
    }

    @Override
    public void onSuccess(String message) {
        view.onSuccess(message);
    }

    @Override
    public void onFailure(String message) {
        view.onFailure(message);
    }

    private boolean validPassword(String text) {
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(text);

        return matcher.matches();
    }


}
