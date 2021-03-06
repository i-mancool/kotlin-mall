package club.mancool.mall.user.ui.activity

import android.os.Bundle
import club.mancool.mall.base.ui.activity.BaseMvpActivity
import club.mancool.mall.user.R
import club.mancool.mall.user.injection.component.DaggerUserComponent
import club.mancool.mall.user.injection.module.UserMoudle
import club.mancool.mall.user.presenter.RegisterPresenter
import club.mancool.mall.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {
    override fun onLoginResult(result: Boolean) {
        toast("注册失败")
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initInjection()

        mRegisterBtn.setOnClickListener {
            //startActivity<TestActivity>("id" to 54)
            mPresenter.register(mMobile.text.toString(),mVerfiyCode.text.toString(),mPwd.text.toString())
            //mPresenter.login("","")
        }
    }

    private fun initInjection(){
        DaggerUserComponent.builder()
                .activityComponent(activityComponent)
                .userMoudle(UserMoudle())
                .build()
                .inject(this)
        mPresenter.mView = this
    }
}
