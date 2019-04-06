package www.sumanmyon.com.diareev2.SQLiteDataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class LoginAndRegisterDataBaseHelper extends SQLiteOpenHelper {
    //private String DATABASE_NAME = getDatabaseName();
    private static final String LOGINnREGISTER_TABLE ="loginnregister_table";
    private static final String ID = "id";
    private static final String username = "username";
    private static final String password = "password";


    public LoginAndRegisterDataBaseHelper(@Nullable Context context, String DATABASE_NAME) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableLoginAndRegister = "create table "+LOGINnREGISTER_TABLE+
                "("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                username+" TEXT ,"+password+" TEXT"+")";
        db.execSQL(createTableLoginAndRegister);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropLoginAndRegisterTable = "DROP TABLE IF EXISTS "+LOGINnREGISTER_TABLE;
        db.execSQL(dropLoginAndRegisterTable);
        onCreate(db);
    }


}
