package club.mancool.mall.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import javax.inject.Scope
import java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class ActivityScope