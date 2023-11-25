package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3935a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
