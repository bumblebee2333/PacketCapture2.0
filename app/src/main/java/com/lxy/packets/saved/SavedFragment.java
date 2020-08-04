package com.lxy.packets.saved;

import com.lxy.packets.CommonFragment;
import com.lxy.packets.CommonPresenter;
import com.lxy.packets.R;


public class SavedFragment extends CommonFragment {
    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        return new SavedPresenter();
    }
}
