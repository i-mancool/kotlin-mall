package club.mancool.mall.base.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import club.mancool.mall.base.common.BaseApplication
import club.mancool.mall.base.injection.component.ActivityComponent
import club.mancool.mall.base.injection.component.AppComponent
import club.mancool.mall.base.injection.component.DaggerActivityComponent
import club.mancool.mall.base.injection.module.ActivityModule
import club.mancool.mall.base.presenter.BasePresenter
import club.mancool.mall.base.presenter.view.BaseView
import javax.inject.Inject

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

    @Inject
    lateinit var mPresenter:T

    lateinit var activityComponent : ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
    }

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .build()
    }
}