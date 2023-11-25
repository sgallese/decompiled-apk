package androidx.lifecycle;

import androidx.lifecycle.v0;
import androidx.lifecycle.y0;

/* compiled from: ViewModelLazy.kt */
/* loaded from: classes.dex */
public final class x0<VM extends v0> implements dc.f<VM> {

    /* renamed from: f  reason: collision with root package name */
    private final wc.b<VM> f5069f;

    /* renamed from: m  reason: collision with root package name */
    private final pc.a<b1> f5070m;

    /* renamed from: p  reason: collision with root package name */
    private final pc.a<y0.b> f5071p;

    /* renamed from: q  reason: collision with root package name */
    private final pc.a<j3.a> f5072q;

    /* renamed from: r  reason: collision with root package name */
    private VM f5073r;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(wc.b<VM> bVar, pc.a<? extends b1> aVar, pc.a<? extends y0.b> aVar2, pc.a<? extends j3.a> aVar3) {
        qc.q.i(bVar, "viewModelClass");
        qc.q.i(aVar, "storeProducer");
        qc.q.i(aVar2, "factoryProducer");
        qc.q.i(aVar3, "extrasProducer");
        this.f5069f = bVar;
        this.f5070m = aVar;
        this.f5071p = aVar2;
        this.f5072q = aVar3;
    }

    @Override // dc.f
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.f5073r;
        if (vm == null) {
            VM vm2 = (VM) new y0(this.f5070m.invoke(), this.f5071p.invoke(), this.f5072q.invoke()).a(oc.a.a(this.f5069f));
            this.f5073r = vm2;
            return vm2;
        }
        return vm;
    }
}
