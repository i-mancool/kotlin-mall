package club.mancool.mall.base.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providersActivity(): Activity {

        return activity
    }
}