package r;

import a1.p1;
import a1.r1;
import s.i1;
import s.k1;

/* compiled from: ColorVectorConverter.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final pc.l<b1.c, i1<p1, s.p>> f21971a = a.f21972f;

    /* compiled from: ColorVectorConverter.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<b1.c, i1<p1, s.p>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f21972f = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ColorVectorConverter.kt */
        /* renamed from: r.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0493a extends qc.r implements pc.l<p1, s.p> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0493a f21973f = new C0493a();

            C0493a() {
                super(1);
            }

            public final s.p a(long j10) {
                long m10 = p1.m(j10, b1.g.f7641a.t());
                return new s.p(p1.k(m10), p1.h(m10), p1.i(m10), p1.j(m10));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ s.p invoke(p1 p1Var) {
                return a(p1Var.y());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ColorVectorConverter.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<s.p, p1> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b1.c f21974f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b1.c cVar) {
                super(1);
                this.f21974f = cVar;
            }

            public final long a(s.p pVar) {
                float k10;
                float k11;
                float k12;
                float k13;
                qc.q.i(pVar, "vector");
                k10 = vc.l.k(pVar.g(), 0.0f, 1.0f);
                k11 = vc.l.k(pVar.h(), -0.5f, 0.5f);
                k12 = vc.l.k(pVar.i(), -0.5f, 0.5f);
                k13 = vc.l.k(pVar.f(), 0.0f, 1.0f);
                return p1.m(r1.a(k10, k11, k12, k13, b1.g.f7641a.t()), this.f21974f);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ p1 invoke(s.p pVar) {
                return p1.g(a(pVar));
            }
        }

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final i1<p1, s.p> invoke(b1.c cVar) {
            qc.q.i(cVar, "colorSpace");
            return k1.a(C0493a.f21973f, new b(cVar));
        }
    }

    public static final pc.l<b1.c, i1<p1, s.p>> a(p1.a aVar) {
        qc.q.i(aVar, "<this>");
        return f21971a;
    }
}
