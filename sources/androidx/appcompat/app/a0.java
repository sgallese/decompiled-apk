package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;

/* compiled from: AppLocalesMetadataHolderService.java */
/* loaded from: classes.dex */
public final class a0 extends Service {

    /* compiled from: AppLocalesMetadataHolderService.java */
    /* loaded from: classes.dex */
    private static class a {
        static int a() {
            return 512;
        }
    }

    public static ServiceInfo a(Context context) throws PackageManager.NameNotFoundException {
        int i10;
        if (Build.VERSION.SDK_INT >= 24) {
            i10 = a.a() | 128;
        } else {
            i10 = 640;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, a0.class), i10);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
