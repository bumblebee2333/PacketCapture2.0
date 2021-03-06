package com.lxy.packets.packet;

public class Packet {

    byte[] mData=null;
    public int mOffset=0;

    public Packet(byte[] data,int offset)
    {
        mData=data;
        mOffset=offset;
    }

    public byte[] getRawData()
    {
        return mData;
    }

    @Override
    public String toString() {
        return new String(mData);
    }
}
