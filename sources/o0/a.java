package o0;

/* compiled from: PersistentOrderedSet.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f20324a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f20325b;

    public a(Object obj, Object obj2) {
        this.f20324a = obj;
        this.f20325b = obj2;
    }

    public final boolean a() {
        if (this.f20325b != p0.c.f20742a) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f20324a != p0.c.f20742a) {
            return true;
        }
        return false;
    }

    public final Object c() {
        return this.f20325b;
    }

    public final Object d() {
        return this.f20324a;
    }

    public final a e(Object obj) {
        return new a(this.f20324a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f20325b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r1 = this;
            p0.c r0 = p0.c.f20742a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.<init>():void");
    }

    public a(Object obj) {
        this(obj, p0.c.f20742a);
    }
}
