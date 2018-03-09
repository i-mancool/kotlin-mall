package club.mancool.mall.user.data.repository

import club.mancool.mall.base.data.net.RetrofitFactory
import club.mancool.mall.base.data.protocol.BaseRespones
import club.mancool.mall.user.data.api.UserApi
import club.mancool.mall.user.data.protocol.RegisterRequest
import rx.Observable
import javax.inject.Inject

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :
 */
class UserRepository @Inject constructor() {

    fun register(mobile:String,verifyCode:String,pwd:String):Observable<BaseRespones<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterRequest(mobile,verifyCode,pwd))
    }
}