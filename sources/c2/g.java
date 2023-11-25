package c2;

import android.os.Build;

/* compiled from: AndroidPlatformLocale.android.kt */
/* loaded from: classes.dex */
public final class g {
    public static final k a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return new f();
        }
        return new b();
    }
}
