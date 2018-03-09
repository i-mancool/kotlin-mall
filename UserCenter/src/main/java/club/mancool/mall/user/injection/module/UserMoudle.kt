package club.mancool.mall.user.injection.module

import club.mancool.mall.user.service.UserService
import club.mancool.mall.user.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
@Module
class UserMoudle {

    @Provides
    fun providersUserService(service: UserServiceImpl):UserService{
        return service
    }

}