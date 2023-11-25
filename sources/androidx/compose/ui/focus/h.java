package androidx.compose.ui.focus;

import androidx.compose.ui.focus.k;

/* compiled from: FocusProperties.kt */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2382a = true;

    /* renamed from: b  reason: collision with root package name */
    private k f2383b;

    /* renamed from: c  reason: collision with root package name */
    private k f2384c;

    /* renamed from: d  reason: collision with root package name */
    private k f2385d;

    /* renamed from: e  reason: collision with root package name */
    private k f2386e;

    /* renamed from: f  reason: collision with root package name */
    private k f2387f;

    /* renamed from: g  reason: collision with root package name */
    private k f2388g;

    /* renamed from: h  reason: collision with root package name */
    private k f2389h;

    /* renamed from: i  reason: collision with root package name */
    private k f2390i;

    /* renamed from: j  reason: collision with root package name */
    private pc.l<? super d, k> f2391j;

    /* renamed from: k  reason: collision with root package name */
    private pc.l<? super d, k> f2392k;

    /* compiled from: FocusProperties.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<d, k> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2393f = new a();

        a() {
            super(1);
        }

        public final k a(int i10) {
            return k.f2395b.b();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ k invoke(d dVar) {
            return a(dVar.o());
        }
    }

    /* compiled from: FocusProperties.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<d, k> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2394f = new b();

        b() {
            super(1);
        }

        public final k a(int i10) {
            return k.f2395b.b();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ k invoke(d dVar) {
            return a(dVar.o());
        }
    }

    public h() {
        k.a aVar = k.f2395b;
        this.f2383b = aVar.b();
        this.f2384c = aVar.b();
        this.f2385d = aVar.b();
        this.f2386e = aVar.b();
        this.f2387f = aVar.b();
        this.f2388g = aVar.b();
        this.f2389h = aVar.b();
        this.f2390i = aVar.b();
        this.f2391j = a.f2393f;
        this.f2392k = b.f2394f;
    }

    @Override // androidx.compose.ui.focus.g
    public k a() {
        return this.f2389h;
    }

    @Override // androidx.compose.ui.focus.g
    public k b() {
        return this.f2387f;
    }

    @Override // androidx.compose.ui.focus.g
    public k c() {
        return this.f2383b;
    }

    @Override // androidx.compose.ui.focus.g
    public k f() {
        return this.f2388g;
    }

    @Override // androidx.compose.ui.focus.g
    public boolean g() {
        return this.f2382a;
    }

    @Override // androidx.compose.ui.focus.g
    public k h() {
        return this.f2384c;
    }

    @Override // androidx.compose.ui.focus.g
    public k i() {
        return this.f2385d;
    }

    @Override // androidx.compose.ui.focus.g
    public pc.l<d, k> j() {
        return this.f2392k;
    }

    @Override // androidx.compose.ui.focus.g
    public k k() {
        return this.f2390i;
    }

    @Override // androidx.compose.ui.focus.g
    public k l() {
        return this.f2386e;
    }

    @Override // androidx.compose.ui.focus.g
    public void m(boolean z10) {
        this.f2382a = z10;
    }

    @Override // androidx.compose.ui.focus.g
    public pc.l<d, k> n() {
        return this.f2391j;
    }
}
