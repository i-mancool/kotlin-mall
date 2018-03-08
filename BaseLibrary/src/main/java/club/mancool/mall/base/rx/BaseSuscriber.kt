package club.mancool.mall.base.rx

import rx.Subscriber

/**
 * Created by 860117030 on 2018/3/8.
 */
open class BaseSuscriber<T>:Subscriber<T>() {
    //接收时候处理
    override fun onNext(t: T) {

    }
    //错误的时候处理
    override fun onError(e: Throwable?) {

    }
    //完成的时候处理
    override fun onCompleted() {

    }
}