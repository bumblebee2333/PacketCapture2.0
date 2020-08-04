package com.lxy.packets.history;

import com.lxy.packets.CommonFragment;
import com.lxy.packets.CommonPresenter;
import com.lxy.packets.R;

public class HistoryFragment extends CommonFragment {

    private CommonPresenter mPresenter=new HistoryPresenter();

    @Override
    public int getLayout() {
        return R.layout.list_packets;
    }

    @Override
    public CommonPresenter getPresenter() {
        return mPresenter;
    }
}
