package p1;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NodeCoordinator.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    private float f20756c;

    /* renamed from: d  reason: collision with root package name */
    private float f20757d;

    /* renamed from: e  reason: collision with root package name */
    private float f20758e;

    /* renamed from: f  reason: collision with root package name */
    private float f20759f;

    /* renamed from: g  reason: collision with root package name */
    private float f20760g;

    /* renamed from: a  reason: collision with root package name */
    private float f20754a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f20755b = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f20761h = 8.0f;

    /* renamed from: i  reason: collision with root package name */
    private long f20762i = androidx.compose.ui.graphics.g.f2458b.a();

    public final void a(androidx.compose.ui.graphics.d dVar) {
        qc.q.i(dVar, "scope");
        this.f20754a = dVar.B();
        this.f20755b = dVar.c1();
        this.f20756c = dVar.F0();
        this.f20757d = dVar.r0();
        this.f20758e = dVar.I0();
        this.f20759f = dVar.Z();
        this.f20760g = dVar.f0();
        this.f20761h = dVar.C0();
        this.f20762i = dVar.H0();
    }

    public final void b(a0 a0Var) {
        qc.q.i(a0Var, TaskSetupFragment.TYPE_OTHER);
        this.f20754a = a0Var.f20754a;
        this.f20755b = a0Var.f20755b;
        this.f20756c = a0Var.f20756c;
        this.f20757d = a0Var.f20757d;
        this.f20758e = a0Var.f20758e;
        this.f20759f = a0Var.f20759f;
        this.f20760g = a0Var.f20760g;
        this.f20761h = a0Var.f20761h;
        this.f20762i = a0Var.f20762i;
    }

    public final boolean c(a0 a0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        qc.q.i(a0Var, TaskSetupFragment.TYPE_OTHER);
        if (this.f20754a == a0Var.f20754a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f20755b == a0Var.f20755b) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f20756c == a0Var.f20756c) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.f20757d == a0Var.f20757d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (this.f20758e == a0Var.f20758e) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (this.f20759f == a0Var.f20759f) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                if (this.f20760g == a0Var.f20760g) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    if (this.f20761h == a0Var.f20761h) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17 && androidx.compose.ui.graphics.g.e(this.f20762i, a0Var.f20762i)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
