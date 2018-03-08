package club.mancool.mall.base.ui.activity

import club.mancool.mall.base.presenter.BasePresenter
import club.mancool.mall.base.presenter.view.BaseView

/**
 * Created by 860117030 on 2018/3/8.
 */
open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }

    lateinit var mPresenter:T
}