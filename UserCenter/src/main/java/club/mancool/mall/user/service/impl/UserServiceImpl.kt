package club.mancool.mall.user.service.impl

import club.mancool.mall.user.service.UserService
import rx.Observable

/**
 * Created by 860117030 on 2018/3/8.
 */
class UserServiceImpl:UserService{
    override fun login(mobile: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

}