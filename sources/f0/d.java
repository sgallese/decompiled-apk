package f0;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.q<ad.k0, Float, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14490f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f14491m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ float f14492p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e<T> f14493q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {82}, m = "invokeSuspend")
        /* renamed from: f0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0346a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f14494f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ e<T> f14495m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ float f14496p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0346a(e<T> eVar, float f10, Continuation<? super C0346a> continuation) {
                super(2, continuation);
                this.f14495m = eVar;
                this.f14496p = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0346a(this.f14495m, this.f14496p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0346a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f14494f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    e<T> eVar = this.f14495m;
                    float f10 = this.f14496p;
                    this.f14494f = 1;
                    if (eVar.L(f10, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f14493q = eVar;
        }

        public final Object a(ad.k0 k0Var, float f10, Continuation<? super dc.w> continuation) {
            a aVar = new a(this.f14493q, continuation);
            aVar.f14491m = k0Var;
            aVar.f14492p = f10;
            return aVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Float f10, Continuation<? super dc.w> continuation) {
            return a(k0Var, f10.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f14490f == 0) {
                dc.n.b(obj);
                ad.i.d((ad.k0) this.f14491m, null, null, new C0346a(this.f14493q, this.f14492p, null), 3, null);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {586}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements pc.q<f0.b, Map<T, ? extends Float>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14497f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f14498m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f14499p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ T f14500q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ e<T> f14501r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f14502s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnchoredDraggable.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<Float, Float, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ f0.b f14503f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ qc.c0 f14504m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0.b bVar, qc.c0 c0Var) {
                super(2);
                this.f14503f = bVar;
                this.f14504m = c0Var;
            }

            public final void a(float f10, float f11) {
                this.f14503f.a(f10, f11);
                this.f14504m.f21658f = f10;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T t10, e<T> eVar, float f10, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f14500q = t10;
            this.f14501r = eVar;
            this.f14502s = f10;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(f0.b bVar, Map<T, Float> map, Continuation<? super dc.w> continuation) {
            b bVar2 = new b(this.f14500q, this.f14501r, this.f14502s, continuation);
            bVar2.f14498m = bVar;
            bVar2.f14499p = map;
            return bVar2.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            float A;
            d10 = ic.d.d();
            int i10 = this.f14497f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                f0.b bVar = (f0.b) this.f14498m;
                Float f10 = (Float) ((Map) this.f14499p).get(this.f14500q);
                if (f10 != null) {
                    qc.c0 c0Var = new qc.c0();
                    if (Float.isNaN(this.f14501r.A())) {
                        A = 0.0f;
                    } else {
                        A = this.f14501r.A();
                    }
                    c0Var.f21658f = A;
                    float floatValue = f10.floatValue();
                    float f11 = this.f14502s;
                    s.j<Float> r10 = this.f14501r.r();
                    a aVar = new a(bVar, c0Var);
                    this.f14498m = null;
                    this.f14497f = 1;
                    if (s.c1.b(A, floatValue, f11, r10, aVar, this) == d10) {
                        return d10;
                    }
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c<T> extends kotlin.coroutines.jvm.internal.l implements pc.q<f0.b, Map<T, ? extends Float>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14505f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f14506m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f14507p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ T f14508q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T t10, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f14508q = t10;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(f0.b bVar, Map<T, Float> map, Continuation<? super dc.w> continuation) {
            c cVar = new c(this.f14508q, continuation);
            cVar.f14506m = bVar;
            cVar.f14507p = map;
            return cVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f14505f == 0) {
                dc.n.b(obj);
                f0.b bVar = (f0.b) this.f14506m;
                Float f10 = (Float) ((Map) this.f14507p).get(this.f14508q);
                if (f10 != null) {
                    f0.a.a(bVar, f10.floatValue(), 0.0f, 2, null);
                }
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> androidx.compose.ui.e d(androidx.compose.ui.e eVar, e<T> eVar2, u.o oVar, boolean z10, boolean z11, v.m mVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(eVar2, "state");
        qc.q.i(oVar, "orientation");
        return u.j.i(eVar, eVar2.w(), oVar, z10, mVar, eVar2.D(), null, new a(eVar2, null), z11, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.e e(androidx.compose.ui.e eVar, e eVar2, u.o oVar, boolean z10, boolean z11, v.m mVar, int i10, Object obj) {
        boolean z12;
        boolean z13;
        if ((i10 & 4) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        return d(eVar, eVar2, oVar, z12, z13, mVar);
    }

    public static final <T> Object f(e<T> eVar, T t10, float f10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object l10 = e.l(eVar, t10, null, new b(t10, eVar, f10, null), continuation, 2, null);
        d10 = ic.d.d();
        if (l10 == d10) {
            return l10;
        }
        return dc.w.f13270a;
    }

    public static /* synthetic */ Object g(e eVar, Object obj, float f10, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = eVar.x();
        }
        return f(eVar, obj, f10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T h(Map<T, Float> map, float f10, boolean z10) {
        float f11;
        float f12;
        if ((!map.isEmpty()) != false) {
            Iterator<T> it = map.entrySet().iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z10) {
                        f11 = floatValue - f10;
                    } else {
                        f11 = f10 - floatValue;
                    }
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        T next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z10) {
                            f12 = floatValue2 - f10;
                        } else {
                            f12 = f10 - floatValue2;
                        }
                        if (f12 < 0.0f) {
                            f12 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f11, f12) > 0) {
                            next = next2;
                            f11 = f12;
                        }
                    } while (it.hasNext());
                }
                return (T) ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float i(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float j(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <T> Object k(e<T> eVar, T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object l10 = e.l(eVar, t10, null, new c(t10, null), continuation, 2, null);
        d10 = ic.d.d();
        if (l10 == d10) {
            return l10;
        }
        return dc.w.f13270a;
    }
}
