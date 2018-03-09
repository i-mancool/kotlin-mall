package club.mancool.mall.base.common

import android.app.Application
import club.mancool.mall.base.injection.component.AppComponent
import club.mancool.mall.base.injection.component.DaggerAppComponent
import club.mancool.mall.base.injection.module.AppModule

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
class BaseApplication:Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}