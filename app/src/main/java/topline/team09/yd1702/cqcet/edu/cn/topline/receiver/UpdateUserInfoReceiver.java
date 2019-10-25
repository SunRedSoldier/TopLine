package topline.team09.yd1702.cqcet.edu.cn.topline.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by RedSlodier on 2019/10/25 9:06.
 */

public class UpdateUserInfoReceiver extends BroadcastReceiver {
    public interface ACTION{
        String UPDATE_USERINFO = "update_userinfo";
    }
    //广播intent类型
    public interface INTENT_TYPE{
        String TYPE_NAME = "intent_name";
        String UPDATE_HEAD = "update_head"; //更新头像
    }
    private BaseOnReceiverMsgListener onReceiverMsgListener;
    public UpdateUserInfoReceiver(BaseOnReceiverMsgListener onReceiverMsgListener){
        this.onReceiverMsgListener = onReceiverMsgListener;
    }

    @Override
    public void onReceive(Context context,Intent intent){
        onReceiverMsgListener.onReceiveMsg(context,intent);
    }

    public interface BaseOnReceiverMsgListener{
        void onReceiveMsg(Context context, Intent intent);
    }

}
