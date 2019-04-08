package www.sumanmyon.com.diareev2.Register.Presenter;

import www.sumanmyon.com.diareev2.Register.View.RegisterActivity;

public class RegisterPresenter implements RegisterPresenterInterface{
    RegisterActivity view;

    public RegisterPresenter(RegisterActivity registerActivity) {
        this.view = registerActivity;
    }
}
