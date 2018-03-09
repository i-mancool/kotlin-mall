package club.mancool.mall.user.presenter

import club.mancool.mall.base.ext.execute
import club.mancool.mall.base.presenter.BasePresenter
import club.mancool.mall.base.rx.BaseSuscriber
import club.mancool.mall.user.presenter.view.RegisterView
import club.mancool.mall.user.service.UserService
import club.mancool.mall.user.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * Created by 860117030 on 2018/3/8.
 */
class RegisterPresenter @Inject constructor():BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService



    fun register(mobile:String,verifyCode:String,pwd:String){

        userService.register(mobile, verifyCode,pwd)
                .execute(object :BaseSuscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }

    fun login(mobile: String,pwd: String){
        userService.login(mobile,pwd).execute(object :BaseSuscriber<Boolean>(){
            override fun onNext(t: Boolean) {
                mView.onLoginResult(t)
            }
        })
    }
}