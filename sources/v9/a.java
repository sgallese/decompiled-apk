package v9;

import java.util.Locale;

/* compiled from: AndroidLogger.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f25105c;

    /* renamed from: a  reason: collision with root package name */
    private final c f25106a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25107b;

    public a(c cVar) {
        this.f25107b = false;
        this.f25106a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f25105c == null) {
            synchronized (a.class) {
                if (f25105c == null) {
                    f25105c = new a();
                }
            }
        }
        return f25105c;
    }

    public void a(String str) {
        if (this.f25107b) {
            this.f25106a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f25107b) {
            this.f25106a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f25107b) {
            this.f25106a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f25107b) {
            this.f25106a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f25107b) {
            this.f25106a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f25107b) {
            this.f25106a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f25107b;
    }

    public void i(boolean z10) {
        this.f25107b = z10;
    }

    public void j(String str) {
        if (this.f25107b) {
            this.f25106a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f25107b) {
            this.f25106a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}
