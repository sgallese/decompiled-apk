package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.m;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f11624a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final m.e f11625a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11626b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11627c;

        a(m.e eVar, String str, int i10) {
            this.f11625a = eVar;
            this.f11626b = str;
            this.f11627c = i10;
        }
    }

    private static PendingIntent a(Context context, g0 g0Var, String str, PackageManager packageManager) {
        Intent f10 = f(str, g0Var, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(g0Var.y());
        if (q(g0Var)) {
            f10.putExtra("gcm.n.analytics_data", g0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, g0 g0Var) {
        if (!q(g0Var)) {
            return null;
        }
        return c(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(g0Var.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), l(1073741824));
    }

    public static a d(Context context, Context context2, g0 g0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        m.e eVar = new m.e(context2, str);
        String n10 = g0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.m(n10);
        }
        String n11 = g0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.l(n11);
            eVar.z(new m.c().h(n11));
        }
        eVar.x(m(packageManager, resources, packageName, g0Var.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, g0Var, resources);
        if (n12 != null) {
            eVar.y(n12);
        }
        eVar.k(a(context, g0Var, packageName, packageManager));
        PendingIntent b10 = b(context, context2, g0Var);
        if (b10 != null) {
            eVar.o(b10);
        }
        Integer h10 = h(context2, g0Var.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.j(h10.intValue());
        }
        eVar.g(!g0Var.a("gcm.n.sticky"));
        eVar.t(g0Var.a("gcm.n.local_only"));
        String p10 = g0Var.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.A(p10);
        }
        Integer m10 = g0Var.m();
        if (m10 != null) {
            eVar.v(m10.intValue());
        }
        Integer r10 = g0Var.r();
        if (r10 != null) {
            eVar.C(r10.intValue());
        }
        Integer l10 = g0Var.l();
        if (l10 != null) {
            eVar.u(l10.intValue());
        }
        Long j10 = g0Var.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.w(true);
            eVar.D(j10.longValue());
        }
        long[] q10 = g0Var.q();
        if (q10 != null) {
            eVar.B(q10);
        }
        int[] e10 = g0Var.e();
        if (e10 != null) {
            eVar.s(e10[0], e10[1], e10[2]);
        }
        eVar.n(i(g0Var));
        return new a(eVar, o(g0Var), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(Context context, g0 g0Var) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, g0Var, k(context, g0Var.k(), j10), j10);
    }

    private static Intent f(String str, g0 g0Var, PackageManager packageManager) {
        String p10 = g0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = g0Var.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f11624a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.a.c(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(g0 g0Var) {
        boolean a10 = g0Var.a("gcm.n.default_sound");
        ?? r02 = a10;
        if (g0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (a10 ? 1 : 0) | true;
        }
        if (g0Var.a("gcm.n.default_light_settings")) {
            return r02 | 4;
        }
        return r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        Object systemService;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                systemService = context.getSystemService(NotificationManager.class);
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (!TextUtils.isEmpty(str)) {
                    notificationChannel3 = notificationManager.getNotificationChannel(str);
                    if (notificationChannel3 != null) {
                        return str;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    notificationChannel2 = notificationManager.getNotificationChannel(string2);
                    if (notificationChannel2 != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                if (notificationChannel == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(com.google.android.gms.ads.internal.util.j.a("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i10 | 67108864;
        }
        return i10;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri n(String str, g0 g0Var, Resources resources) {
        String o10 = g0Var.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if (!"default".equals(o10) && resources.getIdentifier(o10, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o10);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String o(g0 g0Var) {
        String p10 = g0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!c.a(resources.getDrawable(i10, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(g0 g0Var) {
        return g0Var.a("google.c.a.e");
    }
}
