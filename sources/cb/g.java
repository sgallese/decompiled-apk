package cb;

/* compiled from: MarkwonConfiguration.java */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final db.c f8906a;

    /* renamed from: b  reason: collision with root package name */
    private final io.noties.markwon.image.b f8907b;

    /* renamed from: c  reason: collision with root package name */
    private final pb.a f8908c;

    /* renamed from: d  reason: collision with root package name */
    private final c f8909d;

    /* renamed from: e  reason: collision with root package name */
    private final ib.a f8910e;

    /* renamed from: f  reason: collision with root package name */
    private final io.noties.markwon.image.m f8911f;

    /* renamed from: g  reason: collision with root package name */
    private final j f8912g;

    /* compiled from: MarkwonConfiguration.java */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private db.c f8913a;

        /* renamed from: b  reason: collision with root package name */
        private io.noties.markwon.image.b f8914b;

        /* renamed from: c  reason: collision with root package name */
        private pb.a f8915c;

        /* renamed from: d  reason: collision with root package name */
        private c f8916d;

        /* renamed from: e  reason: collision with root package name */
        private ib.a f8917e;

        /* renamed from: f  reason: collision with root package name */
        private io.noties.markwon.image.m f8918f;

        /* renamed from: g  reason: collision with root package name */
        private j f8919g;

        public b h(io.noties.markwon.image.b bVar) {
            this.f8914b = bVar;
            return this;
        }

        public g i(db.c cVar, j jVar) {
            this.f8913a = cVar;
            this.f8919g = jVar;
            if (this.f8914b == null) {
                this.f8914b = io.noties.markwon.image.b.c();
            }
            if (this.f8915c == null) {
                this.f8915c = new pb.b();
            }
            if (this.f8916d == null) {
                this.f8916d = new d();
            }
            if (this.f8917e == null) {
                this.f8917e = ib.a.a();
            }
            if (this.f8918f == null) {
                this.f8918f = new io.noties.markwon.image.n();
            }
            return new g(this);
        }

        public b j(io.noties.markwon.image.m mVar) {
            this.f8918f = mVar;
            return this;
        }
    }

    public io.noties.markwon.image.b a() {
        return this.f8907b;
    }

    public ib.a b() {
        return this.f8910e;
    }

    public io.noties.markwon.image.m c() {
        return this.f8911f;
    }

    public c d() {
        return this.f8909d;
    }

    public j e() {
        return this.f8912g;
    }

    public pb.a f() {
        return this.f8908c;
    }

    public db.c g() {
        return this.f8906a;
    }

    private g(b bVar) {
        this.f8906a = bVar.f8913a;
        this.f8907b = bVar.f8914b;
        this.f8908c = bVar.f8915c;
        this.f8909d = bVar.f8916d;
        this.f8910e = bVar.f8917e;
        this.f8911f = bVar.f8918f;
        this.f8912g = bVar.f8919g;
    }
}
