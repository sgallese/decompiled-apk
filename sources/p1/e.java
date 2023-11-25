package p1;

/* compiled from: NodeKind.kt */
/* loaded from: classes.dex */
final class e implements androidx.compose.ui.focus.g {

    /* renamed from: a  reason: collision with root package name */
    public static final e f20781a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f20782b;

    private e() {
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k a() {
        return androidx.compose.ui.focus.f.i(this);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k b() {
        return androidx.compose.ui.focus.f.e(this);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k c() {
        return androidx.compose.ui.focus.f.f(this);
    }

    public final boolean d() {
        if (f20782b != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        f20782b = null;
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k f() {
        return androidx.compose.ui.focus.f.h(this);
    }

    @Override // androidx.compose.ui.focus.g
    public boolean g() {
        Boolean bool = f20782b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k h() {
        return androidx.compose.ui.focus.f.g(this);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k i() {
        return androidx.compose.ui.focus.f.j(this);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ pc.l j() {
        return androidx.compose.ui.focus.f.d(this);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k k() {
        return androidx.compose.ui.focus.f.b(this);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ androidx.compose.ui.focus.k l() {
        return androidx.compose.ui.focus.f.a(this);
    }

    @Override // androidx.compose.ui.focus.g
    public void m(boolean z10) {
        f20782b = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.g
    public /* synthetic */ pc.l n() {
        return androidx.compose.ui.focus.f.c(this);
    }
}
