package a2;

import a2.z0;
import androidx.recyclerview.widget.RecyclerView;
import j0.d3;
import j0.g3;
import j0.j1;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class g implements g3<Object> {

    /* renamed from: f  reason: collision with root package name */
    private final List<k> f256f;

    /* renamed from: m  reason: collision with root package name */
    private final x0 f257m;

    /* renamed from: p  reason: collision with root package name */
    private final h f258p;

    /* renamed from: q  reason: collision with root package name */
    private final pc.l<z0.b, dc.w> f259q;

    /* renamed from: r  reason: collision with root package name */
    private final h0 f260r;

    /* renamed from: s  reason: collision with root package name */
    private final j1 f261s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f262t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {268, 281}, m = "load")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f263f;

        /* renamed from: m  reason: collision with root package name */
        Object f264m;

        /* renamed from: p  reason: collision with root package name */
        Object f265p;

        /* renamed from: q  reason: collision with root package name */
        int f266q;

        /* renamed from: r  reason: collision with root package name */
        int f267r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f268s;

        /* renamed from: u  reason: collision with root package name */
        int f270u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f268s = obj;
            this.f270u |= RecyclerView.UNDEFINED_DURATION;
            return g.this.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {269}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super Object>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f271f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k f273p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f273p = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Continuation<?> continuation) {
            return new b(this.f273p, continuation);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f271f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g gVar = g.this;
                k kVar = this.f273p;
                this.f271f = 1;
                obj = gVar.k(kVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            return obj;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((b) create(continuation)).invokeSuspend(dc.w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {300}, m = "loadWithTimeoutOrNull$ui_text_release")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f274f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f275m;

        /* renamed from: q  reason: collision with root package name */
        int f277q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f275m = obj;
            this.f277q |= RecyclerView.UNDEFINED_DURATION;
            return g.this.k(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {301}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super Object>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f278f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k f280p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k kVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f280p = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new d(this.f280p, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ad.k0 k0Var, Continuation<Object> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f278f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                h0 h0Var = g.this.f260r;
                k kVar = this.f280p;
                this.f278f = 1;
                obj = h0Var.c(kVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            return obj;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Continuation<? super Object> continuation) {
            return invoke2(k0Var, (Continuation<Object>) continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends k> list, Object obj, x0 x0Var, h hVar, pc.l<? super z0.b, dc.w> lVar, h0 h0Var) {
        j1 e10;
        qc.q.i(list, "fontList");
        qc.q.i(obj, "initialType");
        qc.q.i(x0Var, "typefaceRequest");
        qc.q.i(hVar, "asyncTypefaceCache");
        qc.q.i(lVar, "onCompletion");
        qc.q.i(h0Var, "platformFontLoader");
        this.f256f = list;
        this.f257m = x0Var;
        this.f258p = hVar;
        this.f259q = lVar;
        this.f260r = h0Var;
        e10 = d3.e(obj, null, 2, null);
        this.f261s = e10;
        this.f262t = true;
    }

    private void setValue(Object obj) {
        this.f261s.setValue(obj);
    }

    public final boolean f() {
        return this.f262t;
    }

    @Override // j0.g3
    public Object getValue() {
        return this.f261s.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0102 -> B:42:0x0103). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010a -> B:46:0x010c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super dc.w> r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(a2.k r7, kotlin.coroutines.Continuation<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a2.g.c
            if (r0 == 0) goto L13
            r0 = r8
            a2.g$c r0 = (a2.g.c) r0
            int r1 = r0.f277q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277q = r1
            goto L18
        L13:
            a2.g$c r0 = new a2.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f275m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f277q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.f274f
            a2.k r7 = (a2.k) r7
            dc.n.b(r8)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            dc.n.b(r8)
            a2.g$d r8 = new a2.g$d     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.f274f = r7     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.f277q = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = ad.x2.c(r2, r8, r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r4 = r8
            goto L85
        L4d:
            r8 = move-exception
            hc.f r1 = r0.getContext()
            ad.h0$a r2 = ad.h0.f516a
            hc.f$b r1 = r1.get(r2)
            ad.h0 r1 = (ad.h0) r1
            if (r1 == 0) goto L85
            hc.f r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L85
        L7a:
            r7 = move-exception
            hc.f r8 = r0.getContext()
            boolean r8 = ad.a2.m(r8)
            if (r8 == 0) goto L86
        L85:
            return r4
        L86:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.k(a2.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
