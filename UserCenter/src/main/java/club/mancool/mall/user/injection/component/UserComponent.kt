package club.mancool.mall.user.injection.component

import club.mancool.mall.base.injection.PerComponentScope
import club.mancool.mall.base.injection.component.ActivityComponent
import club.mancool.mall.user.injection.module.UserMoudle
import club.mancool.mall.user.ui.activity.RegisterActivity
import dagger.Component

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(UserMoudle::class))
interface UserComponent {
    fun inject(activity: RegisterActivity)
}