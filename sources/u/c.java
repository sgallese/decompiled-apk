package u;

import dc.m;
import java.util.concurrent.CancellationException;
import u.d;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<d.a> f23777a = new k0.f<>(new d.a[16], 0);

    /* compiled from: BringIntoViewRequestPriorityQueue.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d.a f23779m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.a aVar) {
            super(1);
            this.f23779m = aVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            c.this.f23777a.v(this.f23779m);
        }
    }

    public final void b(Throwable th) {
        k0.f<d.a> fVar = this.f23777a;
        int o10 = fVar.o();
        ad.m[] mVarArr = new ad.m[o10];
        for (int i10 = 0; i10 < o10; i10++) {
            mVarArr[i10] = fVar.n()[i10].a();
        }
        for (int i11 = 0; i11 < o10; i11++) {
            mVarArr[i11].o(th);
        }
        if (this.f23777a.r()) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean c(d.a aVar) {
        qc.q.i(aVar, "request");
        z0.h invoke = aVar.b().invoke();
        if (invoke == null) {
            ad.m<dc.w> a10 = aVar.a();
            m.a aVar2 = dc.m.f13253f;
            a10.resumeWith(dc.m.a(dc.w.f13270a));
            return false;
        }
        aVar.a().n(new a(aVar));
        vc.f fVar = new vc.f(0, this.f23777a.o() - 1);
        int h10 = fVar.h();
        int i10 = fVar.i();
        if (h10 <= i10) {
            while (true) {
                z0.h invoke2 = this.f23777a.n()[i10].b().invoke();
                if (invoke2 != null) {
                    z0.h o10 = invoke.o(invoke2);
                    if (qc.q.d(o10, invoke)) {
                        this.f23777a.a(i10 + 1, aVar);
                        return true;
                    } else if (!qc.q.d(o10, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int o11 = this.f23777a.o() - 1;
                        if (o11 <= i10) {
                            while (true) {
                                this.f23777a.n()[i10].a().o(cancellationException);
                                if (o11 == i10) {
                                    break;
                                }
                                o11++;
                            }
                        }
                    }
                }
                if (i10 == h10) {
                    break;
                }
                i10--;
            }
        }
        this.f23777a.a(0, aVar);
        return true;
    }

    public final void d() {
        vc.f fVar = new vc.f(0, this.f23777a.o() - 1);
        int h10 = fVar.h();
        int i10 = fVar.i();
        if (h10 <= i10) {
            while (true) {
                this.f23777a.n()[h10].a().resumeWith(dc.m.a(dc.w.f13270a));
                if (h10 == i10) {
                    break;
                }
                h10++;
            }
        }
        this.f23777a.i();
    }
}
