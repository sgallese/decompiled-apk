package androidx.compose.foundation;

import androidx.compose.ui.e;
import dc.w;
import p1.r1;
import p1.s1;
import t1.v;
import t1.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class h extends e.c implements s1 {
    private boolean A;
    private String B;
    private t1.i C;
    private pc.a<w> D;
    private String E;
    private pc.a<w> F;

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            h.this.D.invoke();
            return Boolean.TRUE;
        }
    }

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            pc.a aVar = h.this.F;
            if (aVar != null) {
                aVar.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ h(boolean z10, String str, t1.i iVar, pc.a aVar, String str2, pc.a aVar2, qc.h hVar) {
        this(z10, str, iVar, aVar, str2, aVar2);
    }

    public final void K1(boolean z10, String str, t1.i iVar, pc.a<w> aVar, String str2, pc.a<w> aVar2) {
        qc.q.i(aVar, "onClick");
        this.A = z10;
        this.B = str;
        this.C = iVar;
        this.D = aVar;
        this.E = str2;
        this.F = aVar2;
    }

    @Override // p1.s1
    public void Z0(x xVar) {
        qc.q.i(xVar, "<this>");
        t1.i iVar = this.C;
        if (iVar != null) {
            qc.q.f(iVar);
            v.R(xVar, iVar.n());
        }
        v.r(xVar, this.B, new a());
        if (this.F != null) {
            v.t(xVar, this.E, new b());
        }
        if (!this.A) {
            v.g(xVar);
        }
    }

    @Override // p1.s1
    public /* synthetic */ boolean b0() {
        return r1.a(this);
    }

    @Override // p1.s1
    public boolean b1() {
        return true;
    }

    private h(boolean z10, String str, t1.i iVar, pc.a<w> aVar, String str2, pc.a<w> aVar2) {
        qc.q.i(aVar, "onClick");
        this.A = z10;
        this.B = str;
        this.C = iVar;
        this.D = aVar;
        this.E = str2;
        this.F = aVar2;
    }
}
