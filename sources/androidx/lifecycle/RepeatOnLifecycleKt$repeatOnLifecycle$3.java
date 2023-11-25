package androidx.lifecycle;

import ad.i2;
import androidx.lifecycle.p;
import kotlin.coroutines.Continuation;

/* compiled from: RepeatOnLifecycle.kt */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

    /* renamed from: f  reason: collision with root package name */
    int f4886f;

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ Object f4887m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ p f4888p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ p.b f4889q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ pc.p<ad.k0, Continuation<? super dc.w>, Object> f4890r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RepeatOnLifecycle.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f4891f;

        /* renamed from: m  reason: collision with root package name */
        Object f4892m;

        /* renamed from: p  reason: collision with root package name */
        Object f4893p;

        /* renamed from: q  reason: collision with root package name */
        Object f4894q;

        /* renamed from: r  reason: collision with root package name */
        Object f4895r;

        /* renamed from: s  reason: collision with root package name */
        Object f4896s;

        /* renamed from: t  reason: collision with root package name */
        int f4897t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ p f4898u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ p.b f4899v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ ad.k0 f4900w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ pc.p<ad.k0, Continuation<? super dc.w>, Object> f4901x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p pVar, p.b bVar, ad.k0 k0Var, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f4898u = pVar;
            this.f4899v = bVar;
            this.f4900w = k0Var;
            this.f4901x = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.f4898u, this.f4899v, this.f4900w, this.f4901x, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(p pVar, p.b bVar, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.f4888p = pVar;
        this.f4889q = bVar;
        this.f4890r = pVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f4888p, this.f4889q, this.f4890r, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f4887m = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.f4886f;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            ad.k0 k0Var = (ad.k0) this.f4887m;
            i2 N0 = ad.a1.c().N0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4888p, this.f4889q, k0Var, this.f4890r, null);
            this.f4886f = 1;
            if (ad.g.g(N0, anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
