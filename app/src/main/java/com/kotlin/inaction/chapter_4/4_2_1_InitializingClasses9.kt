package com.kotlin.inaction.chapter_4

import android.content.Context
import androidx.coordinatorlayout.widget.CoordinatorLayout
import android.util.AttributeSet
import android.view.View

/**
 *
 * @author wzc
 * @date 2019/7/31
 */
class MyBehavior : androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<View> {
    constructor() : super()
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
}

fun main(args: Array<String>) {
}
