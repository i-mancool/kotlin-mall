package club.mancool.mall.user.ui.activity

import android.os.Bundle
import club.mancool.mall.base.ui.activity.BaseMvpActivity
import club.mancool.mall.user.R
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

        mPresenter = RegisterPresenter()
        mPresenter.mView = this


        mRegisterBtn.setOnClickListener {
            //startActivity<TestActivity>("id" to 54)
            mPresenter.register("","","")
            mPresenter.login("","")
        }
    }
}
