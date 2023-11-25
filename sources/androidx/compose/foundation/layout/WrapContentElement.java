package androidx.compose.foundation.layout;

import j2.r;
import p1.u0;
import qc.q;
import v0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class WrapContentElement extends u0<p> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f2043h = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private final w.m f2044c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2045d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.p<j2.p, r, j2.l> f2046e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f2047f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2048g;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Size.kt */
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0023a extends qc.r implements pc.p<j2.p, r, j2.l> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b.c f2049f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0023a(b.c cVar) {
                super(2);
                this.f2049f = cVar;
            }

            public final long a(long j10, r rVar) {
                q.i(rVar, "<anonymous parameter 1>");
                return j2.m.a(0, this.f2049f.a(0, j2.p.f(j10)));
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar, r rVar) {
                return j2.l.b(a(pVar.j(), rVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Size.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<j2.p, r, j2.l> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v0.b f2050f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v0.b bVar) {
                super(2);
                this.f2050f = bVar;
            }

            public final long a(long j10, r rVar) {
                q.i(rVar, "layoutDirection");
                return this.f2050f.a(j2.p.f19001b.a(), j10, rVar);
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar, r rVar) {
                return j2.l.b(a(pVar.j(), rVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Size.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.p<j2.p, r, j2.l> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0571b f2051f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b.InterfaceC0571b interfaceC0571b) {
                super(2);
                this.f2051f = interfaceC0571b;
            }

            public final long a(long j10, r rVar) {
                q.i(rVar, "layoutDirection");
                return j2.m.a(this.f2051f.a(0, j2.p.g(j10), rVar), 0);
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar, r rVar) {
                return j2.l.b(a(pVar.j(), rVar));
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final WrapContentElement a(b.c cVar, boolean z10) {
            q.i(cVar, "align");
            return new WrapContentElement(w.m.Vertical, z10, new C0023a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(v0.b bVar, boolean z10) {
            q.i(bVar, "align");
            return new WrapContentElement(w.m.Both, z10, new b(bVar), bVar, "wrapContentSize");
        }

        public final WrapContentElement c(b.InterfaceC0571b interfaceC0571b, boolean z10) {
            q.i(interfaceC0571b, "align");
            return new WrapContentElement(w.m.Horizontal, z10, new c(interfaceC0571b), interfaceC0571b, "wrapContentWidth");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(w.m mVar, boolean z10, pc.p<? super j2.p, ? super r, j2.l> pVar, Object obj, String str) {
        q.i(mVar, "direction");
        q.i(pVar, "alignmentCallback");
        q.i(obj, "align");
        q.i(str, "inspectorName");
        this.f2044c = mVar;
        this.f2045d = z10;
        this.f2046e = pVar;
        this.f2047f = obj;
        this.f2048g = str;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!q.d(WrapContentElement.class, cls)) {
            return false;
        }
        q.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.layout.WrapContentElement");
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.f2044c == wrapContentElement.f2044c && this.f2045d == wrapContentElement.f2045d && q.d(this.f2047f, wrapContentElement.f2047f)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((this.f2044c.hashCode() * 31) + t.k.a(this.f2045d)) * 31) + this.f2047f.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public p e() {
        return new p(this.f2044c, this.f2045d, this.f2046e);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(p pVar) {
        q.i(pVar, "node");
        pVar.K1(this.f2044c);
        pVar.L1(this.f2045d);
        pVar.J1(this.f2046e);
    }
}
