package com.example.rxbindingtw.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.rxbindingtw.R
import com.example.rxbindingtw.presenter.MainPresenter
import com.example.rxbindingtw.view.MainView
import com.jakewharton.rxbinding3.widget.textChanges
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import moxy.MvpAppCompatActivity
import moxy.MvpPresenter
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class MainActivity : AppCompatActivity(),MainView {

    @InjectPresenter
    lateinit var presenter : MainPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        et_bind.textChanges()
            .subscribe {
                presenter.textChanged(it)}

    }

    @ProvidePresenter
    fun providePresenter() = MainPresenter()

    override fun setText(text: CharSequence) {
        tv_bind.text=text
    }


}

