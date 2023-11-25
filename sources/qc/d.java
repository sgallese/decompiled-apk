package qc;

import java.io.Serializable;

/* compiled from: CallableReference.java */
/* loaded from: classes4.dex */
public abstract class d implements wc.a, Serializable {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f21659t = a.f21666f;

    /* renamed from: f  reason: collision with root package name */
    private transient wc.a f21660f;

    /* renamed from: m  reason: collision with root package name */
    protected final Object f21661m;

    /* renamed from: p  reason: collision with root package name */
    private final Class f21662p;

    /* renamed from: q  reason: collision with root package name */
    private final String f21663q;

    /* renamed from: r  reason: collision with root package name */
    private final String f21664r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f21665s;

    /* compiled from: CallableReference.java */
    /* loaded from: classes4.dex */
    private static class a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        private static final a f21666f = new a();

        private a() {
        }
    }

    public d() {
        this(f21659t);
    }

    public wc.a a() {
        wc.a aVar = this.f21660f;
        if (aVar == null) {
            wc.a b10 = b();
            this.f21660f = b10;
            return b10;
        }
        return aVar;
    }

    protected abstract wc.a b();

    public Object c() {
        return this.f21661m;
    }

    public String d() {
        return this.f21663q;
    }

    public wc.c e() {
        Class cls = this.f21662p;
        if (cls == null) {
            return null;
        }
        if (this.f21665s) {
            return g0.c(cls);
        }
        return g0.b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public wc.a f() {
        wc.a a10 = a();
        if (a10 != this) {
            return a10;
        }
        throw new oc.b();
    }

    public String g() {
        return this.f21664r;
    }

    protected d(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f21661m = obj;
        this.f21662p = cls;
        this.f21663q = str;
        this.f21664r = str2;
        this.f21665s = z10;
    }
}
