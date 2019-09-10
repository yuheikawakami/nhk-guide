package com.yuhei.nhk.ext

fun Int?.maybe(or: Int = 0) = this ?: or
