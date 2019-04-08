package www.sumanmyon.com.diareev2.Register.Model;

import www.sumanmyon.com.diareev2.Register.Presenter.RegisterPresenter;
import www.sumanmyon.com.diareev2.SQLiteDataBase.DataBaseName;
import www.sumanmyon.com.diareev2.SQLiteDataBase.LoginAndRegisterDataBaseHelper;

import static www.sumanmyon.com.diareev2.SQLiteDataBase.DataBaseName.getDatabaseName;

public class RegisterModel implements RegisterModelInterface{
    RegisterPresenter presenter;
    LoginAndRegisterDataBaseHelper helper;

    public RegisterModel(RegisterPresenter registerPresenter) {
        this.presenter = registerPresenter;
        helper = new LoginAndRegisterDataBaseHelper(presenter.getContext(),getDatabaseName());
    }

    @Override
    public void createNewUserInDataBase(String fullName, String email, String address, String phoneNo, String userName, String password) {
        boolean result = helper.insert(userName,password);

        if(result == true){
            presenter.onSuccess("Data Inserted Successfully");
        }else {
            presenter.onFailure("Data Insertion Failed");
        }
    }
}
