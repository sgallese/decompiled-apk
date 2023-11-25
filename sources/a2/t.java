package a2;

import a2.z0;
import ad.h0;
import ad.s2;
import ad.x1;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final a f324c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final w f325d = new w();

    /* renamed from: e  reason: collision with root package name */
    private static final ad.h0 f326e = new c(ad.h0.f516a);

    /* renamed from: a  reason: collision with root package name */
    private final h f327a;

    /* renamed from: b  reason: collision with root package name */
    private ad.k0 f328b;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f329f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f330m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f330m = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f330m, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f329f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g gVar = this.f330m;
                this.f329f = 1;
                if (gVar.j(this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public t(h hVar, hc.f fVar) {
        qc.q.i(hVar, "asyncTypefaceCache");
        qc.q.i(fVar, "injectedContext");
        this.f327a = hVar;
        this.f328b = ad.l0.a(f326e.plus(fVar).plus(s2.a((x1) fVar.get(x1.f574b))));
    }

    public z0 a(x0 x0Var, h0 h0Var, pc.l<? super z0.b, dc.w> lVar, pc.l<? super x0, ? extends Object> lVar2) {
        dc.l b10;
        qc.q.i(x0Var, "typefaceRequest");
        qc.q.i(h0Var, "platformFontLoader");
        qc.q.i(lVar, "onAsyncCompletion");
        qc.q.i(lVar2, "createDefaultTypeface");
        qc.h hVar = null;
        if (x0Var.c() instanceof s) {
            b10 = u.b(f325d.a(((s) x0Var.c()).l(), x0Var.f(), x0Var.d()), x0Var, this.f327a, h0Var, lVar2);
            List list = (List) b10.a();
            Object b11 = b10.b();
            if (list == null) {
                return new z0.b(b11, false, 2, hVar);
            }
            g gVar = new g(list, b11, x0Var, this.f327a, lVar, h0Var);
            ad.i.d(this.f328b, null, ad.m0.UNDISPATCHED, new b(gVar, null), 1, null);
            return new z0.a(gVar);
        }
        return null;
    }

    public /* synthetic */ t(h hVar, hc.f fVar, int i10, qc.h hVar2) {
        this((i10 & 1) != 0 ? new h() : hVar, (i10 & 2) != 0 ? hc.g.f16601f : fVar);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends hc.a implements ad.h0 {
        public c(h0.a aVar) {
            super(aVar);
        }

        @Override // ad.h0
        public void handleException(hc.f fVar, Throwable th) {
        }
    }
}
