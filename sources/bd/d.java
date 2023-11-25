package bd;

import ad.a1;
import ad.a2;
import ad.c1;
import ad.k2;
import ad.m;
import android.os.Handler;
import android.os.Looper;
import dc.w;
import java.util.concurrent.CancellationException;
import pc.l;
import qc.h;
import qc.q;
import qc.r;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes4.dex */
public final class d extends e {
    private volatile d _immediate;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f8144m;

    /* renamed from: p  reason: collision with root package name */
    private final String f8145p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f8146q;

    /* renamed from: r  reason: collision with root package name */
    private final d f8147r;

    /* compiled from: Runnable.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m f8148f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f8149m;

        public a(m mVar, d dVar) {
            this.f8148f = mVar;
            this.f8149m = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8148f.f(this.f8149m, w.f13270a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    /* loaded from: classes4.dex */
    static final class b extends r implements l<Throwable, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Runnable f8151m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f8151m = runnable;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            d.this.f8144m.removeCallbacks(this.f8151m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private d(Handler handler, String str, boolean z10) {
        super(0);
        this.f8144m = handler;
        this.f8145p = str;
        this.f8146q = z10;
        this._immediate = z10 ? this : 0;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f8147r = dVar;
    }

    private final void V0(hc.f fVar, Runnable runnable) {
        a2.d(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        a1.b().A0(fVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(d dVar, Runnable runnable) {
        dVar.f8144m.removeCallbacks(runnable);
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        if (!this.f8144m.post(runnable)) {
            V0(fVar, runnable);
        }
    }

    @Override // ad.g0
    public boolean D0(hc.f fVar) {
        if (this.f8146q && q.d(Looper.myLooper(), this.f8144m.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // bd.e
    /* renamed from: X0  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d N0() {
        return this.f8147r;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof d) && ((d) obj).f8144m == this.f8144m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8144m);
    }

    @Override // ad.t0
    public void j(long j10, m<? super w> mVar) {
        long i10;
        a aVar = new a(mVar, this);
        Handler handler = this.f8144m;
        i10 = vc.l.i(j10, 4611686018427387903L);
        if (handler.postDelayed(aVar, i10)) {
            mVar.n(new b(aVar));
        } else {
            V0(mVar.getContext(), aVar);
        }
    }

    @Override // bd.e, ad.t0
    public c1 p0(long j10, final Runnable runnable, hc.f fVar) {
        long i10;
        Handler handler = this.f8144m;
        i10 = vc.l.i(j10, 4611686018427387903L);
        if (handler.postDelayed(runnable, i10)) {
            return new c1() { // from class: bd.c
                @Override // ad.c1
                public final void dispose() {
                    d.Y0(d.this, runnable);
                }
            };
        }
        V0(fVar, runnable);
        return k2.f533f;
    }

    @Override // ad.i2, ad.g0
    public String toString() {
        String J0 = J0();
        if (J0 == null) {
            String str = this.f8145p;
            if (str == null) {
                str = this.f8144m.toString();
            }
            if (this.f8146q) {
                return str + ".immediate";
            }
            return str;
        }
        return J0;
    }

    public /* synthetic */ d(Handler handler, String str, int i10, h hVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
