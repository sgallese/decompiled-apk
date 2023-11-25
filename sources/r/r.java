package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22022a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final r f22023b = new s(new l0(null, null, null, null, 15, null));

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ r(qc.h hVar) {
        this();
    }

    public abstract l0 a();

    public final r b(r rVar) {
        qc.q.i(rVar, "enter");
        w b10 = a().b();
        if (b10 == null) {
            b10 = rVar.a().b();
        }
        g0 d10 = a().d();
        if (d10 == null) {
            d10 = rVar.a().d();
        }
        m a10 = a().a();
        if (a10 == null) {
            a10 = rVar.a().a();
        }
        b0 c10 = a().c();
        if (c10 == null) {
            c10 = rVar.a().c();
        }
        return new s(new l0(b10, d10, a10, c10));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof r) && qc.q.d(((r) obj).a(), a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (qc.q.d(this, f22023b)) {
            return "EnterTransition.None";
        }
        l0 a10 = a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        w b10 = a10.b();
        String str4 = null;
        if (b10 != null) {
            str = b10.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        g0 d10 = a10.d();
        if (d10 != null) {
            str2 = d10.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        m a11 = a10.a();
        if (a11 != null) {
            str3 = a11.toString();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append(",\nScale - ");
        b0 c10 = a10.c();
        if (c10 != null) {
            str4 = c10.toString();
        }
        sb2.append(str4);
        return sb2.toString();
    }

    private r() {
    }
}
