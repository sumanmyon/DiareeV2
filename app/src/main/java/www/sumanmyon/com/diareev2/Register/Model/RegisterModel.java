package www.sumanmyon.com.diareev2.Register.Model;

import www.sumanmyon.com.diareev2.Register.Presenter.RegisterPresenter;

public class RegisterModel implements RegisterModelInterface{
    RegisterPresenter presenter;

    public RegisterModel(RegisterPresenter registerPresenter) {
        this.presenter = registerPresenter;
    }

    @Override
    public void createNewUserInDataBase(String fullName, String email, String address, String phoneNo, String userName, String password) {

    }
}
