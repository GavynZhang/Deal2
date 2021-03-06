package com.school.schooldeal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import cn.bmob.push.PushConstants;

/**
 * Created by U-nookia on 2017/1/18.
 * 用于bmob推送的广播接收器
 */

public class MyPushMessageReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(PushConstants.ACTION_MESSAGE)){
            Log.d("bmob", "客户端收到推送内容："+intent.getStringExtra("msg"));
        }
    }
}
