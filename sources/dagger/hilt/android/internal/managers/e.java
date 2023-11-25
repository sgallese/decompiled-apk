package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.content.Context;

/* compiled from: BroadcastReceiverComponentManager.java */
/* loaded from: classes4.dex */
public final class e {
    public static Object a(Context context) {
        Application a10 = va.a.a(context.getApplicationContext());
        ab.d.a(a10 instanceof ab.b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", a10.getClass());
        return ((ab.b) a10).generatedComponent();
    }
}
