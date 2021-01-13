package com.ddrv20.appnime

import android.view.View
import android.widget.TextView

fun TextView.updateTime(text: String) {
    this.text=text
}

fun View.hide() {
    this.visibility = View.GONE
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.display(show: Boolean) {
    if (show) {
        this.show()
    } else {
        this.hide()
    }
}