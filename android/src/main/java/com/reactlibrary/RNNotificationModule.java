
package com.reactlibrary;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
public class RNNotificationModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

 private static final String E_APPROOV_ERROR = "E_APPROOV_ERROR";

  public RNNotificationModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }
@ReactMethod
  public void show(final String title,final String message) {
  //  Toast.makeText(getReactApplicationContext(),message, Toast.LENGTH_LONG).show();

  //   Notification notification = new Notification(/* your notification */);
// build notification
// the addAction re-use the same intent to keep the example short
// notificationManager =
 //   (NotificationManager) reactContext.getSystemService(Service.NOTIFICATION_SERVICE);


//notificationManager.notify(1234, notification);

     
     NotificationCompat.Builder builder =
             new NotificationCompat.Builder(reactContext)
                     .setSmallIcon(R.mipmap.ic_launcher)
                     .setContentTitle(title) //set title of notification
                     .setContentText(message)//this is notification message
                     .setAutoCancel(true) // makes auto cancel of notification
                     .setPriority(NotificationCompat.PRIORITY_DEFAULT);
     NotificationManager manager = (NotificationManager) reactContext.getSystemService(Context.NOTIFICATION_SERVICE);
     manager.notify(0, builder.build());

 }
  // @Override
  // public Map<String, Object> getConstants() {
  //   final Map<String, Object> constants = new HashMap<>();
  //   constants.put(DURATION_SHORT_KEY, "Hello");
  //   constants.put(DURATION_LONG_KEY, "hii");
  //   return constants;
  // }

 

  @Override
  public String getName() {
    return "RNNotification";
  }
}