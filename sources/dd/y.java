package dd;

import ad.x1;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: classes4.dex */
public final class y<T> implements b0<T>, g, ed.o<T> {

    /* renamed from: f  reason: collision with root package name */
    private final x1 f13561f;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ b0<T> f13562m;

    /* JADX WARN: Multi-variable type inference failed */
    public y(b0<? extends T> b0Var, x1 x1Var) {
        this.f13561f = x1Var;
        this.f13562m = b0Var;
    }

    @Override // dd.b0
    public List<T> a() {
        return this.f13562m.a();
    }

    @Override // dd.b0, dd.g
    public Object collect(h<? super T> hVar, Continuation<?> continuation) {
        return this.f13562m.collect(hVar, continuation);
    }

    @Override // ed.o
    public g<T> d(hc.f fVar, int i10, cd.a aVar) {
        return d0.e(this, fVar, i10, aVar);
    }
}
