package m9;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f19804d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f19805e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final h f19806a = h.c();

    /* renamed from: b  reason: collision with root package name */
    private long f19807b;

    /* renamed from: c  reason: collision with root package name */
    private int f19808c;

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f19804d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f19808c) + this.f19806a.e(), f19805e);
    }

    private static boolean c(int i10) {
        if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
            return false;
        }
        return true;
    }

    private static boolean d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            return false;
        }
        return true;
    }

    private synchronized void e() {
        this.f19808c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f19808c != 0) {
            if (this.f19806a.a() <= this.f19807b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f19808c++;
        this.f19807b = this.f19806a.a() + a(i10);
    }
}
