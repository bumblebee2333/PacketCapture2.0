package com.lxy.packets.history;

import com.lxy.packets.CommonPresenter;
import com.lxy.packets.FakeFragment;
import com.lxy.packets.R;

public class HistoryFragment2 extends FakeFragment {

    private HistoryPresenter mP=null;

    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        if (mP==null)
            mP=new HistoryPresenter();

        return mP;
    }
}
