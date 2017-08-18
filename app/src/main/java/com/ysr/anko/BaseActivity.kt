package com.ysr.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by ysr on 2017/8/18 7:22.
 * 邮箱 ysr200808@163.com
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(this.getLayoutId())
        initView()
    }
    //获取布局文件
    abstract fun getLayoutId(): Int
    //初始化view
    abstract fun initView()
}