package com.example.androidjetpack.architecture.navigation

import android.app.NotificationChannel
import android.app.NotificationManager
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.navigation.NavDeepLinkBuilder
import com.example.androidjetpack.R

class WidgetDeepLinkProvider : AppWidgetProvider() {

    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)

        if (context == null) return

        // Set layout
        val remoteViews = RemoteViews(context.packageName, R.layout.widget_deep_link)

        // Click Widget button
        // Goto NavigationTestActivity, tới màn hình deepLinkFragment
        val args = Bundle()
        args.putString("myarg", "From Widget")
        val pendingIntent = NavDeepLinkBuilder(context)
                .setGraph(R.navigation.nav_game)
                .setDestination(R.id.deepLinkFragment)
                .setComponentName(NavigationTestActivity::class.java)
                .setArguments(args)
                .createPendingIntent()

        remoteViews.setOnClickPendingIntent(R.id.buttonDeepLink, pendingIntent)

        appWidgetManager?.updateAppWidget(appWidgetIds, remoteViews)
    }
}