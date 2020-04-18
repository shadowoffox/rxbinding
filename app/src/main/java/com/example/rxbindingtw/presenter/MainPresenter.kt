package com.example.rxbindingtw.presenter

import com.example.rxbindingtw.view.MainView
import io.reactivex.rxjava3.core.Observable
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter: MvpPresenter<MainView>() {

    fun textChanged(text: CharSequence){
        viewState.setText(text)
    }
}