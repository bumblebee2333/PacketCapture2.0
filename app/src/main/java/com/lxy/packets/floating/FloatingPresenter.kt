package com.lxy.packets.floating

import com.lxy.packets.CommonPresenter

open class FloatingPresenter : CommonPresenter<FloatingWindow>() {
    private var mWindow:FloatingWindow?=null

    var window
        get() = view
        set(value) {
            view = value
        }
}