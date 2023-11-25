package ad;

import hc.f;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class a extends qc.r implements pc.p<hc.f, f.b, hc.f> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f498f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final hc.f invoke(hc.f fVar, f.b bVar) {
            if (bVar instanceof e0) {
                return fVar.plus(((e0) bVar).Y());
            }
            return fVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class b extends qc.r implements pc.p<hc.f, f.b, hc.f> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.f0<hc.f> f499f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f500m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qc.f0<hc.f> f0Var, boolean z10) {
            super(2);
            this.f499f = f0Var;
            this.f500m = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [hc.f, T] */
        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final hc.f invoke(hc.f fVar, f.b bVar) {
            if (!(bVar instanceof e0)) {
                return fVar.plus(bVar);
            }
            f.b bVar2 = this.f499f.f21676f.get(bVar.getKey());
            if (bVar2 == null) {
                e0 e0Var = (e0) bVar;
                if (this.f500m) {
                    e0Var = e0Var.Y();
                }
                return fVar.plus(e0Var);
            }
            qc.f0<hc.f> f0Var = this.f499f;
            f0Var.f21676f = f0Var.f21676f.minusKey(bVar.getKey());
            return fVar.plus(((e0) bVar).q0(bVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class c extends qc.r implements pc.p<Boolean, f.b, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f501f = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, f.b bVar) {
            boolean z11;
            if (!z10 && !(bVar instanceof e0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, f.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final hc.f a(hc.f fVar, hc.f fVar2, boolean z10) {
        boolean c10 = c(fVar);
        boolean c11 = c(fVar2);
        if (!c10 && !c11) {
            return fVar.plus(fVar2);
        }
        qc.f0 f0Var = new qc.f0();
        f0Var.f21676f = fVar2;
        hc.g gVar = hc.g.f16601f;
        hc.f fVar3 = (hc.f) fVar.fold(gVar, new b(f0Var, z10));
        if (c11) {
            f0Var.f21676f = ((hc.f) f0Var.f21676f).fold(gVar, a.f498f);
        }
        return fVar3.plus((hc.f) f0Var.f21676f);
    }

    public static final String b(hc.f fVar) {
        return null;
    }

    private static final boolean c(hc.f fVar) {
        return ((Boolean) fVar.fold(Boolean.FALSE, c.f501f)).booleanValue();
    }

    public static final hc.f d(k0 k0Var, hc.f fVar) {
        hc.f a10 = a(k0Var.getCoroutineContext(), fVar, true);
        if (a10 != a1.a() && a10.get(hc.d.f16598i) == null) {
            return a10.plus(a1.a());
        }
        return a10;
    }

    public static final hc.f e(hc.f fVar, hc.f fVar2) {
        if (!c(fVar2)) {
            return fVar.plus(fVar2);
        }
        return a(fVar, fVar2, false);
    }

    public static final z2<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof w0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof z2) {
                return (z2) eVar;
            }
        }
        return null;
    }

    public static final z2<?> g(Continuation<?> continuation, hc.f fVar, Object obj) {
        boolean z10;
        if (!(continuation instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (fVar.get(a3.f467f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        z2<?> f10 = f((kotlin.coroutines.jvm.internal.e) continuation);
        if (f10 != null) {
            f10.Y0(fVar, obj);
        }
        return f10;
    }
}
