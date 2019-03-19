package com.android.onroad.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.android.onroad.MyService;
import com.android.onroad.activities.DilogActivity;
import com.android.onroad.beans.Trip;
import com.android.onroad.utils.Constants;

public class MyReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Trip  trip=intent.getExtras().getParcelable(Constants.TRIP);
        Intent intentDialouge=new Intent(context, DilogActivity.class);
        intentDialouge.putExtra(Constants.TRIP, trip);
        intentDialouge.putExtra(Constants.FIRE_SOUND_STATUS,"fired");
        intentDialouge.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentDialouge);
    }
}
