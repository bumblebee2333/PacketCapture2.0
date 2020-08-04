package com.lxy.packets;

public interface IAdapter {
    void setSource(Object src);
    void removeListeners();
    void setListeners();
    void onFilterChanged();
}
