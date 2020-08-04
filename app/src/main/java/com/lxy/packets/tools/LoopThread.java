package com.lxy.packets.tools;

import android.os.Handler;
import android.os.Looper;

public abstract class LoopThread extends Thread {

    private Handler mH;

    @Override
    public void run() {
        super.run();
        Looper.prepare();
        mH=onCreateHandler();
        Looper.loop();
    }

    public Handler getHandler()
    {
        return mH;
    }

    protected abstract Handler onCreateHandler();
}
