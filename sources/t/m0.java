package t;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PlatformMagnifier.kt */
/* loaded from: classes.dex */
public final class m0 implements l0 {

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23189b = new m0();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f23190c = false;

    /* compiled from: PlatformMagnifier.kt */
    /* loaded from: classes.dex */
    public static class a implements k0 {

        /* renamed from: a  reason: collision with root package name */
        private final Magnifier f23191a;

        public a(Magnifier magnifier) {
            qc.q.i(magnifier, "magnifier");
            this.f23191a = magnifier;
        }

        @Override // t.k0
        public long a() {
            return j2.q.a(this.f23191a.getWidth(), this.f23191a.getHeight());
        }

        @Override // t.k0
        public void b(long j10, long j11, float f10) {
            this.f23191a.show(z0.f.o(j10), z0.f.p(j10));
        }

        @Override // t.k0
        public void c() {
            this.f23191a.update();
        }

        public final Magnifier d() {
            return this.f23191a;
        }

        @Override // t.k0
        public void dismiss() {
            this.f23191a.dismiss();
        }
    }

    private m0() {
    }

    @Override // t.l0
    public boolean a() {
        return f23190c;
    }

    @Override // t.l0
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public a b(a0 a0Var, View view, j2.e eVar, float f10) {
        qc.q.i(a0Var, "style");
        qc.q.i(view, "view");
        qc.q.i(eVar, "density");
        return new a(new Magnifier(view));
    }
}
