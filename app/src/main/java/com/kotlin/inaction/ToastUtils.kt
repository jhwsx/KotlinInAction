package com.kotlin.inaction

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

object ToastUtils {
    private var toast: Toast? = null
    fun showToast(context: Context, message: String) {
        toast = toast
                ?: Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast?.let {
            it.setText(message)
            it.duration = Toast.LENGTH_SHORT
            it.show()
        }
    }
    fun showToast(context: Context, @StringRes resId: Int) {
        toast = toast
                ?: Toast.makeText(context, resId, Toast.LENGTH_SHORT)
        toast?.let {
            it.setText(resId)
            it.duration = Toast.LENGTH_SHORT
            it.show()
        }
    }
}