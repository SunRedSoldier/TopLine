package topline.team09.yd1702.cqcet.edu.cn.topline.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RedSlodier on 2019/10/24 10:59.
 */

public class SQLiteHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    public static String DB_NAME = "topline.db";
    public static final String U_USERINFO = "userinfo"; //用户信息
    public SQLiteHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        /**
         * 创建用户信息表
         */
        db.execSQL("CREATE TABLE IF NOT EXISTS "+U_USERINFO+"(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userNAME VARCHAR," +   //用户名
                "nikeNAME VARCHAR," +   //昵称
                "sex VARCHAR," +    //性别
                "signature VARCHAR," +  //签名
                "head VARCHAR" +    //头像
                ")" );
    }

    /*当数据库版本号增加时调用此方法*/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+U_USERINFO);
        onCreate(db);
    }
}
