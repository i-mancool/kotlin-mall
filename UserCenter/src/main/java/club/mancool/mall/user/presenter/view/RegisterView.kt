package club.mancool.mall.user.presenter.view

import club.mancool.mall.base.presenter.view.BaseView

/**
 * Created by 860117030 on 2018/3/8.
 */
interface RegisterView:BaseView{

    fun onRegisterResult(result:Boolean)

    fun onLoginResult(result: Boolean)
}