package u4;

import ad.g0;
import okio.f;
import okio.j;
import okio.r0;
import qc.h;
import u4.a;
import u4.b;

/* compiled from: RealDiskCache.kt */
/* loaded from: classes.dex */
public final class d implements u4.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f24144e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f24145a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f24146b;

    /* renamed from: c  reason: collision with root package name */
    private final j f24147c;

    /* renamed from: d  reason: collision with root package name */
    private final u4.b f24148d;

    /* compiled from: RealDiskCache.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealDiskCache.kt */
    /* loaded from: classes.dex */
    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final b.C0566b f24149a;

        public b(b.C0566b c0566b) {
            this.f24149a = c0566b;
        }

        @Override // u4.a.b
        public void abort() {
            this.f24149a.a();
        }

        @Override // u4.a.b
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public c a() {
            b.d c10 = this.f24149a.c();
            if (c10 != null) {
                return new c(c10);
            }
            return null;
        }

        @Override // u4.a.b
        public r0 getData() {
            return this.f24149a.f(1);
        }

        @Override // u4.a.b
        public r0 getMetadata() {
            return this.f24149a.f(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealDiskCache.kt */
    /* loaded from: classes.dex */
    public static final class c implements a.c {

        /* renamed from: f  reason: collision with root package name */
        private final b.d f24150f;

        public c(b.d dVar) {
            this.f24150f = dVar;
        }

        @Override // u4.a.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public b S() {
            b.C0566b b10 = this.f24150f.b();
            if (b10 != null) {
                return new b(b10);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f24150f.close();
        }

        @Override // u4.a.c
        public r0 getData() {
            return this.f24150f.c(1);
        }

        @Override // u4.a.c
        public r0 getMetadata() {
            return this.f24150f.c(0);
        }
    }

    public d(long j10, r0 r0Var, j jVar, g0 g0Var) {
        this.f24145a = j10;
        this.f24146b = r0Var;
        this.f24147c = jVar;
        this.f24148d = new u4.b(c(), d(), g0Var, e(), 1, 2);
    }

    private final String f(String str) {
        return f.f20621q.d(str).C().n();
    }

    @Override // u4.a
    public a.b a(String str) {
        b.C0566b Y = this.f24148d.Y(f(str));
        if (Y != null) {
            return new b(Y);
        }
        return null;
    }

    @Override // u4.a
    public a.c b(String str) {
        b.d c02 = this.f24148d.c0(f(str));
        if (c02 != null) {
            return new c(c02);
        }
        return null;
    }

    @Override // u4.a
    public j c() {
        return this.f24147c;
    }

    public r0 d() {
        return this.f24146b;
    }

    public long e() {
        return this.f24145a;
    }
}
