package androidx.compose.ui.focus;

/* compiled from: FocusRequester.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2395b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final k f2396c = new k();

    /* renamed from: d  reason: collision with root package name */
    private static final k f2397d = new k();

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<y0.n> f2398a = new k0.f<>(new y0.n[16], 0);

    /* compiled from: FocusRequester.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final k a() {
            return k.f2397d;
        }

        public final k b() {
            return k.f2396c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusRequester.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<FocusTargetNode, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2399f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            qc.q.i(focusTargetNode, "it");
            return Boolean.valueOf(o.j(focusTargetNode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0064, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k.c():boolean");
    }

    public final k0.f<y0.n> d() {
        return this.f2398a;
    }

    public final void e() {
        c();
    }
}
