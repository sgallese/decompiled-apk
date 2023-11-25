package qc;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes4.dex */
public class h0 {
    public wc.b b(Class cls) {
        return new f(cls);
    }

    public wc.c c(Class cls, String str) {
        return new v(cls, str);
    }

    public String g(l lVar) {
        String obj = lVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String h(r rVar) {
        return g(rVar);
    }

    public wc.d a(m mVar) {
        return mVar;
    }

    public wc.e d(s sVar) {
        return sVar;
    }

    public wc.f e(w wVar) {
        return wVar;
    }

    public wc.g f(y yVar) {
        return yVar;
    }
}
