package club.mancool.mall.base.injection.component

import android.content.Context
import club.mancool.mall.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun context():Context
}