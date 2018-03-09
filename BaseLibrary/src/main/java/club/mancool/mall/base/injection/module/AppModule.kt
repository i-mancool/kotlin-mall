package club.mancool.mall.base.injection.module

import android.content.Context
import club.mancool.mall.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@Module
class AppModule(private val context:BaseApplication) {

    @Provides
    @Singleton
    fun providersContext():Context{

        return context
    }
}