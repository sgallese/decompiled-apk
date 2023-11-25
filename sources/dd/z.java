package dd;

import ad.x1;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: classes4.dex */
public final class z<T> implements l0<T>, g, ed.o<T> {

    /* renamed from: f  reason: collision with root package name */
    private final x1 f13563f;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ l0<T> f13564m;

    /* JADX WARN: Multi-variable type inference failed */
    public z(l0<? extends T> l0Var, x1 x1Var) {
        this.f13563f = x1Var;
        this.f13564m = l0Var;
    }

    @Override // dd.b0
    public List<T> a() {
        return this.f13564m.a();
    }

    @Override // dd.b0, dd.g
    public Object collect(h<? super T> hVar, Continuation<?> continuation) {
        return this.f13564m.collect(hVar, continuation);
    }

    @Override // ed.o
    public g<T> d(hc.f fVar, int i10, cd.a aVar) {
        return n0.d(this, fVar, i10, aVar);
    }

    @Override // dd.l0
    public T getValue() {
        return this.f13564m.getValue();
    }
}
