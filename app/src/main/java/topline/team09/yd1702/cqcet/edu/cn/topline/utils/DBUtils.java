package topline.team09.yd1702.cqcet.edu.cn.topline.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import topline.team09.yd1702.cqcet.edu.cn.topline.sqlite.SQLiteHelper;

/**
 * Created by RedSlodier on 2019/10/24 11:22.
 */

public class DBUtils {
    private static DBUtils instance = null;
    private static SQLiteHelper helper;
    private static SQLiteDatabase db;
    public DBUtils(Context context){
        helper = new SQLiteHelper(context);
        db = helper.getWritableDatabase();
    }
    public static DBUtils getInstance(Context context){
        if (instance==null){
            instance = new DBUtils(context);
        }
        return instance;
    }
}
