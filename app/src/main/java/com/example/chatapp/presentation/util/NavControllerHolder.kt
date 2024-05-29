package com.example.chatapp.presentation.util

import androidx.navigation.NavHostController
import java.lang.ref.WeakReference

/**
 * Holder class for NavHostController
 */
class NavControllerHolder {
    /**
     * WeakReference to the NavHostController to prevent memory leaks.
     * NavHostController is tied to the lifecycle of the activity/fragment,
     * and using a weak reference ensures it can be garbage collected
     * when no longer needed.
     */
    val navController: WeakReference<NavHostController>? = null
}
