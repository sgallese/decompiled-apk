package androidx.fragment.app;

import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;

/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<y0.b> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f4795f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f4795f = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final y0.b invoke() {
            y0.b defaultViewModelProviderFactory = this.f4795f.getDefaultViewModelProviderFactory();
            qc.q.h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final <VM extends androidx.lifecycle.v0> dc.f<VM> b(Fragment fragment, wc.b<VM> bVar, pc.a<? extends b1> aVar, pc.a<? extends j3.a> aVar2, pc.a<? extends y0.b> aVar3) {
        qc.q.i(fragment, "<this>");
        qc.q.i(bVar, "viewModelClass");
        qc.q.i(aVar, "storeProducer");
        qc.q.i(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new a(fragment);
        }
        return new x0(bVar, aVar, aVar3, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 c(dc.f<? extends c1> fVar) {
        return fVar.getValue();
    }
}
