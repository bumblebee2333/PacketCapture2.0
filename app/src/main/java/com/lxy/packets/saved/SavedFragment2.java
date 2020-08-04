package com.lxy.packets.saved;

import com.lxy.packets.CommonPresenter;
import com.lxy.packets.FakeFragment;
import com.lxy.packets.R;


public class SavedFragment2 extends FakeFragment {

    private SavedPresenter mP=null;

    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        if (mP==null)
            mP=new SavedPresenter();

        return mP;
    }
}
