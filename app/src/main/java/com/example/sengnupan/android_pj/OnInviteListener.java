package com.example.sengnupan.android_pj;



import android.media.MediaPlayer;

import java.util.List;


public interface OnInviteListener extends MediaPlayer.OnErrorListener {

    void onComplete(List<String> invitedFriends, String requestId);



    void onCancel();

}