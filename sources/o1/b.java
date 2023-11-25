package o1;

import qc.q;

/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20335a = new b();

    private b() {
        super(null);
    }

    @Override // o1.g
    public boolean a(c<?> cVar) {
        q.i(cVar, "key");
        return false;
    }

    @Override // o1.g
    public <T> T b(c<T> cVar) {
        q.i(cVar, "key");
        throw new IllegalStateException("".toString());
    }
}
