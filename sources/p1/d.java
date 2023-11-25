package p1;

import androidx.compose.ui.e;

/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final a f20772a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final pc.l<p1.c, dc.w> f20773b = b.f20775f;

    /* renamed from: c  reason: collision with root package name */
    private static final pc.l<p1.c, dc.w> f20774c = c.f20776f;

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class a implements o1.l {
        a() {
        }

        @Override // o1.l
        public <T> T o(o1.c<T> cVar) {
            qc.q.i(cVar, "<this>");
            return cVar.a().invoke();
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<p1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f20775f = new b();

        b() {
            super(1);
        }

        public final void a(p1.c cVar) {
            qc.q.i(cVar, "it");
            cVar.M1();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(p1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<p1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f20776f = new c();

        c() {
            super(1);
        }

        public final void a(p1.c cVar) {
            qc.q.i(cVar, "it");
            cVar.Q1();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(p1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    public static final /* synthetic */ a a() {
        return f20772a;
    }

    public static final /* synthetic */ pc.l b() {
        return f20773b;
    }

    public static final /* synthetic */ pc.l c() {
        return f20774c;
    }

    public static final /* synthetic */ boolean d(p1.c cVar) {
        return e(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(p1.c cVar) {
        e.c o10 = k.k(cVar).i0().o();
        qc.q.g(o10, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((v1) o10).I1();
    }
}
