package androidx.compose.foundation;

import androidx.compose.ui.e;
import dc.w;
import n1.w0;
import n1.x0;
import p1.c1;
import p1.d1;
import qc.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class l extends e.c implements p1.h, c1 {
    private w0.a A;
    private boolean B;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0<w0> f2003f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f2004m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0<w0> f0Var, l lVar) {
            super(0);
            this.f2003f = f0Var;
            this.f2004m = lVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2003f.f21676f = p1.i.a(this.f2004m, x0.a());
        }
    }

    private final w0 I1() {
        f0 f0Var = new f0();
        d1.a(this, new a(f0Var, this));
        return (w0) f0Var.f21676f;
    }

    @Override // p1.c1
    public void E0() {
        w0.a aVar;
        w0 I1 = I1();
        if (this.B) {
            w0.a aVar2 = this.A;
            if (aVar2 != null) {
                aVar2.release();
            }
            if (I1 != null) {
                aVar = I1.a();
            } else {
                aVar = null;
            }
            this.A = aVar;
        }
    }

    public final void J1(boolean z10) {
        w0.a aVar = null;
        if (z10) {
            w0 I1 = I1();
            if (I1 != null) {
                aVar = I1.a();
            }
            this.A = aVar;
        } else {
            w0.a aVar2 = this.A;
            if (aVar2 != null) {
                aVar2.release();
            }
            this.A = null;
        }
        this.B = z10;
    }

    @Override // androidx.compose.ui.e.c
    public void u1() {
        w0.a aVar = this.A;
        if (aVar != null) {
            aVar.release();
        }
        this.A = null;
    }
}
