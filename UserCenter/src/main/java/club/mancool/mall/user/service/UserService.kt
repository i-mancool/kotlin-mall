package club.mancool.mall.user.service

import rx.Observable

/**
 * Created by 860117030 on 2018/3/8.
 */
interface UserService {

    fun register(mobile:String,verifyCode:String,pwd:String):Observable<Boolean>

    fun login(mobile: String,pwd: String):Observable<Boolean>
}