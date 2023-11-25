package s;

import s.q;

/* compiled from: Animatable.kt */
/* loaded from: classes.dex */
public final class h<T, V extends q> {

    /* renamed from: a  reason: collision with root package name */
    private final l<T, V> f22702a;

    /* renamed from: b  reason: collision with root package name */
    private final f f22703b;

    public h(l<T, V> lVar, f fVar) {
        qc.q.i(lVar, "endState");
        qc.q.i(fVar, "endReason");
        this.f22702a = lVar;
        this.f22703b = fVar;
    }

    public final f a() {
        return this.f22703b;
    }

    public final l<T, V> b() {
        return this.f22702a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f22703b + ", endState=" + this.f22702a + ')';
    }
}
