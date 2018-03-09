package club.mancool.mall.user.service.impl

import club.mancool.mall.base.data.protocol.BaseRespones
import club.mancool.mall.base.rx.BaseException
import club.mancool.mall.user.data.repository.UserRepository
import club.mancool.mall.user.service.UserService
import rx.Observable
import rx.functions.Func1

/**
 * Created by 860117030 on 2018/3/8.
 */
class UserServiceImpl:UserService{
    override fun login(mobile: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(mobile,verifyCode,pwd)
                .flatMap(object :Func1<BaseRespones<String>,Observable<Boolean>>{
                    override fun call(t: BaseRespones<String>): Observable<Boolean> {
                        if(t.status!=0){
                            return Observable.error(BaseException(t.status,t.message))
                        }
                        return Observable.just(true)
                    }

                })
    }

}