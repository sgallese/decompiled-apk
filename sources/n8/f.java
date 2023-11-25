package n8;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    static final f f20296c = new f("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f20297a;

    /* renamed from: b  reason: collision with root package name */
    private int f20298b = 4;

    public f(String str) {
        this.f20297a = str;
    }

    private boolean a(int i10) {
        if (this.f20298b > i10 && !Log.isLoggable(this.f20297a, i10)) {
            return false;
        }
        return true;
    }

    public static f f() {
        return f20296c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f20297a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f20297a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f20297a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f20297a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f20297a, str, th);
        }
    }
}
