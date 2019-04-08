package www.sumanmyon.com.diareev2.Register.View;

public interface RegisterView {
    void onSuccess(String message);
    void onFailure(String message);

    void setFullName(String message);
    void setEmail(String message);
    void setAddress(String message);
    void setPhoneNo(String message);
    void setUserName(String message);
    void setPassword(String message);
    void setRePassword(String message);

    void setCheckAccept(String message);

}
