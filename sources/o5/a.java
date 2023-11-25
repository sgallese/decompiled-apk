package o5;

import m5.a;
import qc.h;
import qc.q;

/* compiled from: ConsoleLogger.kt */
/* loaded from: classes.dex */
public final class a implements m5.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0461a f20539b = new C0461a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final a f20540c = new a();

    /* renamed from: a  reason: collision with root package name */
    private a.EnumC0444a f20541a = a.EnumC0444a.INFO;

    /* compiled from: ConsoleLogger.kt */
    /* renamed from: o5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0461a {
        private C0461a() {
        }

        public /* synthetic */ C0461a(h hVar) {
            this();
        }

        public final a a() {
            return a.f20540c;
        }
    }

    private final void g(a.EnumC0444a enumC0444a, String str) {
        if (f().compareTo(enumC0444a) <= 0) {
            System.out.println((Object) str);
        }
    }

    @Override // m5.a
    public void a(String str) {
        q.i(str, "message");
        g(a.EnumC0444a.ERROR, str);
    }

    @Override // m5.a
    public void b(String str) {
        q.i(str, "message");
        g(a.EnumC0444a.DEBUG, str);
    }

    @Override // m5.a
    public void c(String str) {
        q.i(str, "message");
        g(a.EnumC0444a.INFO, str);
    }

    @Override // m5.a
    public void d(String str) {
        q.i(str, "message");
        g(a.EnumC0444a.WARN, str);
    }

    public a.EnumC0444a f() {
        return this.f20541a;
    }
}
