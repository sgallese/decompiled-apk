package o3;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: AdServicesInfo.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20470a = new b();

    /* compiled from: AdServicesInfo.kt */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20471a = new a();

        private a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f20471a.a();
        }
        return 0;
    }
}
