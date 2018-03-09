package club.mancool.mall.base.injection.component

import android.app.Activity
import android.content.Context
import club.mancool.mall.base.injection.ActivityScope
import club.mancool.mall.base.injection.module.ActivityModule
import club.mancool.mall.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
}