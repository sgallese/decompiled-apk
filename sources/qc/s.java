package qc;

import wc.g;

/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes4.dex */
public abstract class s extends u implements wc.e {
    public s(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // wc.g
    public g.a S() {
        ((wc.e) h()).S();
        return null;
    }

    @Override // qc.d
    protected wc.a b() {
        return g0.d(this);
    }

    @Override // pc.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
