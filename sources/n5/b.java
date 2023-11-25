package n5;

import android.util.Log;
import m5.a;
import qc.h;
import qc.q;

/* compiled from: LogcatLogger.kt */
/* loaded from: classes.dex */
public final class b implements m5.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f20264c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final b f20265d = new b();

    /* renamed from: a  reason: collision with root package name */
    private a.EnumC0444a f20266a = a.EnumC0444a.INFO;

    /* renamed from: b  reason: collision with root package name */
    private final String f20267b = "Amplitude";

    /* compiled from: LogcatLogger.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a() {
            return b.f20265d;
        }
    }

    @Override // m5.a
    public void a(String str) {
        q.i(str, "message");
        if (f().compareTo(a.EnumC0444a.ERROR) <= 0) {
            Log.e(this.f20267b, str);
        }
    }

    @Override // m5.a
    public void b(String str) {
        q.i(str, "message");
        if (f().compareTo(a.EnumC0444a.DEBUG) <= 0) {
            Log.d(this.f20267b, str);
        }
    }

    @Override // m5.a
    public void c(String str) {
        q.i(str, "message");
        if (f().compareTo(a.EnumC0444a.INFO) <= 0) {
            Log.i(this.f20267b, str);
        }
    }

    @Override // m5.a
    public void d(String str) {
        q.i(str, "message");
        if (f().compareTo(a.EnumC0444a.WARN) <= 0) {
            Log.w(this.f20267b, str);
        }
    }

    public a.EnumC0444a f() {
        return this.f20266a;
    }
}
