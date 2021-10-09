package com.example.seoulmetroschedule.presenter

interface BaseView<PresenterT : BasePresenter> {
    val presenter: PresenterT
}