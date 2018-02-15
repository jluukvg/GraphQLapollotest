package com.example.jluukvg.graphqlapollo_test

import android.content.Context
import android.widget.Toast

/**
 * Created by jluukvg on 2/15/18.
 */

fun Context.showToast(msg: String) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
}