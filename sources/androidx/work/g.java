package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f7447a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7448b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f7449c;

    public g(int i10, Notification notification, int i11) {
        this.f7447a = i10;
        this.f7449c = notification;
        this.f7448b = i11;
    }

    public int a() {
        return this.f7448b;
    }

    public Notification b() {
        return this.f7449c;
    }

    public int c() {
        return this.f7447a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7447a != gVar.f7447a || this.f7448b != gVar.f7448b) {
            return false;
        }
        return this.f7449c.equals(gVar.f7449c);
    }

    public int hashCode() {
        return (((this.f7447a * 31) + this.f7448b) * 31) + this.f7449c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f7447a + ", mForegroundServiceType=" + this.f7448b + ", mNotification=" + this.f7449c + '}';
    }
}
