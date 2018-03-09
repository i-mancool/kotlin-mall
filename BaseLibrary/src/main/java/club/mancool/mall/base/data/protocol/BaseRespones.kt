package club.mancool.mall.base.data.protocol

/**
 * Created by : MaoZikun
 * Data on : 2018/3/9
 * Description : 基础响应接收类
 */
class BaseRespones<out T>(val status:Int,val message:String,val data:T) {
}