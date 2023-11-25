package qc;

/* compiled from: Reflection.java */
/* loaded from: classes4.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h0 f21678a;

    /* renamed from: b  reason: collision with root package name */
    private static final wc.b[] f21679b;

    static {
        h0 h0Var = null;
        try {
            h0Var = (h0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (h0Var == null) {
            h0Var = new h0();
        }
        f21678a = h0Var;
        f21679b = new wc.b[0];
    }

    public static wc.d a(m mVar) {
        return f21678a.a(mVar);
    }

    public static wc.b b(Class cls) {
        return f21678a.b(cls);
    }

    public static wc.c c(Class cls) {
        return f21678a.c(cls, "");
    }

    public static wc.e d(s sVar) {
        return f21678a.d(sVar);
    }

    public static wc.f e(w wVar) {
        return f21678a.e(wVar);
    }

    public static wc.g f(y yVar) {
        return f21678a.f(yVar);
    }

    public static String g(l lVar) {
        return f21678a.g(lVar);
    }

    public static String h(r rVar) {
        return f21678a.h(rVar);
    }
}
