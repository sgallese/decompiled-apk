package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: BundleCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
