package com.example.rxbindingtw.view

import android.widget.TextView
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)

interface MainView :MvpView{
    fun setText(text: CharSequence)
}