package com.app.kwesi;

import static android.os.Build.ID;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class dbConnect extends SQLiteOpenHelper {

    private static String dbname="AlfaManager";
    private static String dbTable="users";
    private static String dbVersion= "1";

    private static String Id="id";
    private static String Fullname="Fullname";
    private static String emailAddress="emailAddress";
    private static String password="password";
    private static String dob="dob";
    private static String phoneNumber="phoneNumber";
    private static String Note="Note";

    public dbConnect(@Nullable Context context) {
        super(context, dbname,null, Integer.parseInt((dbVersion)));
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table" + dbTable + "("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+ Fullname+" TEXT "+ emailAddress +" TEXT " + password +
                " TEXT " +dob + " TEXT " +phoneNumber+ "TEXT " + Note+")";

        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " +dbTable);
        onCreate(sqLiteDatabase);

    }
    public void addUser(User user){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Fullname,user.getFullname());
        values.put(emailAddress,user.getEmailAddress());
        values.put(password,user.getPassword());
        values.put(phoneNumber,user.getPhoneNumber());
        values.put(dob,user.getDOB());
        values.put(Note,user.getNote());
        db.insert(dbTable, null, values);
        db.close();
    }



    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String selectAll = "SELECT * FROM DemoUserTable";
        Cursor cursor = db.rawQuery(selectAll, null);

        if (cursor.moveToFirst()) {
            do {
                User user= new User();
                user.setId(Integer.parseInt(cursor.getString(0)));
                user.setFullname(cursor.getString(1));
                user.setEmailAddress(cursor.getString(2));
                user.setPassword(cursor.getString(3));
                user.setPhoneNumber(cursor.getString(4));
                user.setDOB(cursor.getString(5));
                user.setNote(cursor.getString(6));

                userList.add(user);
            } while (cursor.moveToNext());
        }
        return userList;
    }

    public void addproductname(Productname Productname) {
    }
}
