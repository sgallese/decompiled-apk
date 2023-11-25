package androidx.compose.foundation;

import ad.k0;
import android.view.KeyEvent;
import dc.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import p1.n1;
import p1.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public abstract class a extends p1.l implements o1, i1.e {
    private v.m C;
    private boolean D;
    private String E;
    private t1.i F;
    private pc.a<w> G;
    private final C0018a H;

    /* compiled from: Clickable.kt */
    /* renamed from: androidx.compose.foundation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0018a {

        /* renamed from: b  reason: collision with root package name */
        private v.p f1847b;

        /* renamed from: a  reason: collision with root package name */
        private final Map<i1.a, v.p> f1846a = new LinkedHashMap();

        /* renamed from: c  reason: collision with root package name */
        private long f1848c = z0.f.f26354b.c();

        public final long a() {
            return this.f1848c;
        }

        public final Map<i1.a, v.p> b() {
            return this.f1846a;
        }

        public final v.p c() {
            return this.f1847b;
        }

        public final void d(long j10) {
            this.f1848c = j10;
        }

        public final void e(v.p pVar) {
            this.f1847b = pVar;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {718}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1849f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v.p f1851p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v.p pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f1851p = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f1851p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1849f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                v.m mVar = a.this.C;
                v.p pVar = this.f1851p;
                this.f1849f = 1;
                if (mVar.c(pVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {727}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1852f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v.p f1854p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v.p pVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f1854p = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new c(this.f1854p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1852f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                v.m mVar = a.this.C;
                v.q qVar = new v.q(this.f1854p);
                this.f1852f = 1;
                if (mVar.c(qVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public /* synthetic */ a(v.m mVar, boolean z10, String str, t1.i iVar, pc.a aVar, qc.h hVar) {
        this(mVar, z10, str, iVar, aVar);
    }

    @Override // i1.e
    public boolean A(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "event");
        return false;
    }

    @Override // p1.o1
    public void O(k1.r rVar, k1.t tVar, long j10) {
        qc.q.i(rVar, "pointerEvent");
        qc.q.i(tVar, "pass");
        P1().O(rVar, tVar, j10);
    }

    protected final void O1() {
        v.p c10 = this.H.c();
        if (c10 != null) {
            this.C.a(new v.o(c10));
        }
        Iterator<T> it = this.H.b().values().iterator();
        while (it.hasNext()) {
            this.C.a(new v.o((v.p) it.next()));
        }
        this.H.e(null);
        this.H.b().clear();
    }

    public abstract androidx.compose.foundation.b P1();

    @Override // p1.o1
    public /* synthetic */ boolean Q0() {
        return n1.d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C0018a Q1() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R1(v.m mVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        if (!qc.q.d(this.C, mVar)) {
            O1();
            this.C = mVar;
        }
        if (this.D != z10) {
            if (!z10) {
                O1();
            }
            this.D = z10;
        }
        this.E = str;
        this.F = iVar;
        this.G = aVar;
    }

    @Override // p1.o1
    public /* synthetic */ void U0() {
        n1.c(this);
    }

    @Override // i1.e
    public boolean Y(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "event");
        qc.h hVar = null;
        if (this.D && t.l.f(keyEvent)) {
            if (!this.H.b().containsKey(i1.a.k(i1.d.a(keyEvent)))) {
                v.p pVar = new v.p(this.H.a(), hVar);
                this.H.b().put(i1.a.k(i1.d.a(keyEvent)), pVar);
                ad.i.d(i1(), null, null, new b(pVar, null), 3, null);
                return true;
            }
        } else if (this.D && t.l.b(keyEvent)) {
            v.p remove = this.H.b().remove(i1.a.k(i1.d.a(keyEvent)));
            if (remove != null) {
                ad.i.d(i1(), null, null, new c(remove, null), 3, null);
            }
            this.G.invoke();
            return true;
        }
        return false;
    }

    @Override // p1.o1
    public void a0() {
        P1().a0();
    }

    @Override // p1.o1
    public /* synthetic */ boolean g0() {
        return n1.a(this);
    }

    @Override // p1.o1
    public /* synthetic */ void m0() {
        n1.b(this);
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        O1();
    }

    private a(v.m mVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        this.C = mVar;
        this.D = z10;
        this.E = str;
        this.F = iVar;
        this.G = aVar;
        this.H = new C0018a();
    }
}
