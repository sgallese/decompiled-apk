package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22025a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final t f22026b = new u(new l0(null, null, null, null, 15, null));

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final t a() {
            return t.f22026b;
        }
    }

    public /* synthetic */ t(qc.h hVar) {
        this();
    }

    public abstract l0 b();

    public final t c(t tVar) {
        qc.q.i(tVar, "exit");
        w b10 = b().b();
        if (b10 == null) {
            b10 = tVar.b().b();
        }
        g0 d10 = b().d();
        if (d10 == null) {
            d10 = tVar.b().d();
        }
        m a10 = b().a();
        if (a10 == null) {
            a10 = tVar.b().a();
        }
        b0 c10 = b().c();
        if (c10 == null) {
            c10 = tVar.b().c();
        }
        return new u(new l0(b10, d10, a10, c10));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof t) && qc.q.d(((t) obj).b(), b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (qc.q.d(this, f22026b)) {
            return "ExitTransition.None";
        }
        l0 b10 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
        w b11 = b10.b();
        String str4 = null;
        if (b11 != null) {
            str = b11.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        g0 d10 = b10.d();
        if (d10 != null) {
            str2 = d10.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        m a10 = b10.a();
        if (a10 != null) {
            str3 = a10.toString();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append(",\nScale - ");
        b0 c10 = b10.c();
        if (c10 != null) {
            str4 = c10.toString();
        }
        sb2.append(str4);
        return sb2.toString();
    }

    private t() {
    }
}
