package www.sumanmyon.com.diareev2.SQLiteDataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class LoginAndRegisterDataBaseHelper extends SQLiteOpenHelper {
    //private String DATABASE_NAME = getDatabaseName();
    private static final String DATABASE_TABLE ="loginnregister_table";
    private static final String ID = "id";
    private static final String username = "username";
    private static final String password = "password";


    public LoginAndRegisterDataBaseHelper(@Nullable Context context, String DATABASE_NAME) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
