package club.mancool.mall.base.ext

import club.mancool.mall.base.rx.BaseSuscriber
import rx.Observable
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by 860117030 on 2018/3/8.
 */

fun <T> Observable<T>.execute(subscriber: BaseSuscriber<T>){
   this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}