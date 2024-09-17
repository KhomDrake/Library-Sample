package br.com.cosmind.extensionskit

import android.content.Context
import android.content.Intent

fun Context.intentForAction(action: String) =
    Intent("$packageName.$action")