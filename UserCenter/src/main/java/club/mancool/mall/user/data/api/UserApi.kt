package club.mancool.mall.user.data.api

import club.mancool.mall.base.data.protocol.BaseRespones
import club.mancool.mall.user.data.protocol.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description :用户接口
 */
interface UserApi {

    @POST("user/register")
    fun register(@Body request: RegisterRequest):Observable<BaseRespones<String>>
}