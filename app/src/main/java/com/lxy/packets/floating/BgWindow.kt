package com.lxy.packets.floating

import android.util.Log
import android.view.View
import com.lxy.packets.CommonPresenter
import com.lxy.packets.R
import com.lxy.packets.view.DrawableView

class BgWindow:FloatingWindow() {
    private var mView:DrawableView?=null;
    private val mPresenter: CommonPresenter<BgWindow> = object : CommonPresenter<BgWindow>() {
        override fun onViewBind(v: View?) {
            super.onViewBind(v)
            mView = v as DrawableView;
        }
    }

    override fun getLayout(): Int {
        return R.layout.background_window;
    }

    override fun getPresenter(): CommonPresenter<BgWindow> {
        return mPresenter;
    }

    override fun autoMove(): Boolean {
        return false;
    }

    override fun getDefaultWindowSize(size: IntArray?) {
        if (size!=null)
        {
            size[0]= sScreenWidth;
            size[1]= sScreenHeight;
            Log.e("xx","bgwindow x:$sScreenWidth")
        }
    }

    override fun canMove(): Boolean {
        return false;
    }

    fun postDraw(runnable: DrawableView.DrawRunnable, duration: Long = -1): Int {
        val v = mView ?: return -1;
        if (!windowStack.isShown) {
            windowStack.show();
        }
        return v.postDraw(runnable, duration);
    }

    fun removeDraw(id: Int): Int {
        val v = mView ?: return -1;
        val size = v.removeDraw(id);
        if (windowStack.isShown && size == 0) {
            windowStack.hide()
        }
        return v.removeDraw(id);
    }

    override fun showBorder(): Boolean {
        return false;
    }
}