package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1770a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final b.b f1771b;

    /* renamed from: c  reason: collision with root package name */
    private final b.a f1772c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f1773d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f1774e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1771b = bVar;
        this.f1772c = aVar;
        this.f1773d = componentName;
        this.f1774e = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder a() {
        return this.f1772c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f1773d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent c() {
        return this.f1774e;
    }
}
