package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* compiled from: SharingStarted.kt */
/* loaded from: classes4.dex */
final class j0 implements h0 {

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<h<? super f0>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13337f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13338m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ l0<Integer> f13339p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SharingStarted.kt */
        /* renamed from: dd.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0308a<T> implements h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ qc.b0 f13340f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ h<f0> f13341m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SharingStarted.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: dd.j0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0309a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f13342f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ C0308a<T> f13343m;

                /* renamed from: p  reason: collision with root package name */
                int f13344p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0309a(C0308a<? super T> c0308a, Continuation<? super C0309a> continuation) {
                    super(continuation);
                    this.f13343m = c0308a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13342f = obj;
                    this.f13344p |= RecyclerView.UNDEFINED_DURATION;
                    return this.f13343m.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0308a(qc.b0 b0Var, h<? super f0> hVar) {
                this.f13340f = b0Var;
                this.f13341m = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof dd.j0.a.C0308a.C0309a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dd.j0$a$a$a r0 = (dd.j0.a.C0308a.C0309a) r0
                    int r1 = r0.f13344p
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13344p = r1
                    goto L18
                L13:
                    dd.j0$a$a$a r0 = new dd.j0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f13342f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f13344p
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    dc.n.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    dc.n.b(r6)
                    if (r5 <= 0) goto L4e
                    qc.b0 r5 = r4.f13340f
                    boolean r6 = r5.f21657f
                    if (r6 != 0) goto L4e
                    r5.f21657f = r3
                    dd.h<dd.f0> r5 = r4.f13341m
                    dd.f0 r6 = dd.f0.START
                    r0.f13344p = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    dc.w r5 = dc.w.f13270a
                    return r5
                L4e:
                    dc.w r5 = dc.w.f13270a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: dd.j0.a.C0308a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // dd.h
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0<Integer> l0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13339p = l0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(h<? super f0> hVar, Continuation<? super dc.w> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f13339p, continuation);
            aVar.f13338m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f13337f;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                h hVar = (h) this.f13338m;
                qc.b0 b0Var = new qc.b0();
                l0<Integer> l0Var = this.f13339p;
                C0308a c0308a = new C0308a(b0Var, hVar);
                this.f13337f = 1;
                if (l0Var.collect(c0308a, this) == d10) {
                    return d10;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // dd.h0
    public g<f0> a(l0<Integer> l0Var) {
        return i.z(new a(l0Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
