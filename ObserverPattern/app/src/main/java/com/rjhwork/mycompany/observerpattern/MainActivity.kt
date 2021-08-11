package com.rjhwork.mycompany.observerpattern

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.TaskStackBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var sandwich: Sandwich
    private lateinit var order:Order
    private var notificationId = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sandwich = Sandwich()
        order = Order(sandwich)
    }

    fun orderClicked(view: View) {
        if(sandwich.getReady()){
            sandwich.setReady(false)
        }

        sandwich.register(order)
        sendNotification(order.update())
    }

    fun updateClicked(view:View) {
        sandwich.setReady(true)
        sendNotification(order.update())
    }

    fun onTextClicked(view: View) {
        val bigTextStyle = NotificationCompat.BigTextStyle()
        with(bigTextStyle) {
            setBigContentTitle("Congratulations!")
            setSummaryText("Your tenth sandwich is on us")
            bigText(getString(R.string.long_text))
        }

        notificationId = 1
        sendNotification(bigTextStyle)
    }



    private fun sendNotification(message:String) {
        val profileIntent = Intent(this@MainActivity, UserProfile::class.java)
        val stackBuilder = TaskStackBuilder.create(this).apply {
            addParentStack(UserProfile::class.java)
            addNextIntent(profileIntent)
        }

        val pendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)

        val notification = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("Sandwich Factory")
            .setContentText(message)
            .setContentIntent(pendingIntent)
            .build()

        val manager = NotificationManagerCompat.from(this)
        manager.notify(notificationId, notification)

//        notificationId += 1 // 이렇게 하면 새로운 id값을 계속 받을 수 있다.
    }

    private fun sendNotification(style:NotificationCompat.Style) {
        val profileIntent = Intent(this@MainActivity, UserProfile::class.java)
        val stackBuilder = TaskStackBuilder.create(this).apply {
            addParentStack(UserProfile::class.java)
            addNextIntent(profileIntent)
        }

        // Use for custom view
        //RemoteViews expandedView = new RemoteViews(this.getPackageName(), R.layout.notification);

        val pendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)

        val notification = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("Sandwich Factory")
            .setStyle(style)
            .setContentIntent(pendingIntent)
            .build()

        //.setContent(expandedView);

        val manager = NotificationManagerCompat.from(this)
        manager.notify(notificationId, notification)
    }
}