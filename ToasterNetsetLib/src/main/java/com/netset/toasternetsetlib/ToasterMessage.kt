package com.netset.toasternetsetlib

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    companion object {

        fun toastShort(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        }

        fun toastLong(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_LONG).show()
        }

    }


}