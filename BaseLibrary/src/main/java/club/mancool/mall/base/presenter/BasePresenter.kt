package club.mancool.mall.base.presenter

import club.mancool.mall.base.presenter.view.BaseView

/**
 * Created by 860117030 on 2018/3/8.
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}