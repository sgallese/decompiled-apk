package androidx.paging;

import androidx.paging.d1;

/* compiled from: PagingData.kt */
/* loaded from: classes.dex */
public final class s1<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final d f6038e = new d(null);

    /* renamed from: f  reason: collision with root package name */
    private static final m2 f6039f = new c();

    /* renamed from: g  reason: collision with root package name */
    private static final b0 f6040g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final dd.g<d1<T>> f6041a;

    /* renamed from: b  reason: collision with root package name */
    private final m2 f6042b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f6043c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.a<d1.b<T>> f6044d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagingData.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a {

        /* renamed from: f  reason: collision with root package name */
        public static final a f6045f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* compiled from: PagingData.kt */
    /* loaded from: classes.dex */
    public static final class b implements b0 {
        b() {
        }

        @Override // androidx.paging.b0
        public void a(o2 o2Var) {
            qc.q.i(o2Var, "viewportHint");
        }
    }

    /* compiled from: PagingData.kt */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s1(dd.g<? extends d1<T>> gVar, m2 m2Var, b0 b0Var, pc.a<d1.b<T>> aVar) {
        qc.q.i(gVar, "flow");
        qc.q.i(m2Var, "uiReceiver");
        qc.q.i(b0Var, "hintReceiver");
        qc.q.i(aVar, "cachedPageEvent");
        this.f6041a = gVar;
        this.f6042b = m2Var;
        this.f6043c = b0Var;
        this.f6044d = aVar;
    }

    public final d1.b<T> a() {
        return this.f6044d.invoke();
    }

    public final dd.g<d1<T>> b() {
        return this.f6041a;
    }

    public final b0 c() {
        return this.f6043c;
    }

    public final m2 d() {
        return this.f6042b;
    }

    public /* synthetic */ s1(dd.g gVar, m2 m2Var, b0 b0Var, pc.a aVar, int i10, qc.h hVar) {
        this(gVar, m2Var, b0Var, (i10 & 8) != 0 ? a.f6045f : aVar);
    }

    /* compiled from: PagingData.kt */
    /* loaded from: classes.dex */
    public static final class c implements m2 {
        c() {
        }

        @Override // androidx.paging.m2
        public void a() {
        }
    }
}
