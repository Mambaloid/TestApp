package com.bombombom.testapp

class MainScreenPresenter() {
    private var view : MainScreenView?  = null

    public fun attachView(view : MainScreenView) {
        this.view = view
    }
}