package www.sumanmyon.com.diareev2.Register.Presenter;

import android.content.Context;

public interface RegisterPresenterInterface {

    void checkEditTxtNCheckBoxFields();
    Context getContext();

    void onSuccess(String message);
    void onFailure(String message);
}
