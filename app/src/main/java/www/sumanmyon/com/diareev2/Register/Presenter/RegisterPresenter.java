package www.sumanmyon.com.diareev2.Register.Presenter;

import android.text.TextUtils;

import www.sumanmyon.com.diareev2.Register.Model.RegisterModel;
import www.sumanmyon.com.diareev2.Register.Model.RegisterModelInterface;
import www.sumanmyon.com.diareev2.Register.View.RegisterActivity;

public class RegisterPresenter implements RegisterPresenterInterface{
    RegisterActivity view;
    RegisterModelInterface model;

    public RegisterPresenter(RegisterActivity registerActivity) {
        this.view = registerActivity;
    }

    @Override
    public void checkEditTxtNCheckBoxFields() {
        if(TextUtils.isEmpty(view.getFullNameEditText().getText())){
            view.setFullName("Please type your full name");
        }else if(TextUtils.isEmpty(view.getEmailEditText().getText())){
            view.setEmail("Please type your email address");
        }else if(TextUtils.isEmpty(view.getAddressEditText().getText())){
            view.setAddress("Please type your address");
        }else if(TextUtils.isEmpty(view.getPhoneNoEditText().getText())){
            view.setPhoneNo("Please type your phone number");
        }else if(TextUtils.isEmpty(view.getUserNameEditText().getText())){
            view.setUserName("Please type your user name");
        }else if(TextUtils.isEmpty(view.getPasswordEditText().getText())){
            view.setPassword("Please type password");
        }else if(TextUtils.isEmpty(view.getRe_passwordEditText().getText())){
            view.setRePassword("Please re type your password to confirm");
        }else if(!view.getAcceptCheckBox().isChecked()){
            view.setCheckAccept("Please accept terms and conditions to register.");
        }else {
            //todo if fields are not empty then
            
            view.onSuccess("Successfully register");
        }
    }
}
