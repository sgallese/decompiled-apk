package a5;

import dc.h;
import dc.j;
import g5.l;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import qc.r;

/* compiled from: CacheResponse.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final dc.f f368a;

    /* renamed from: b  reason: collision with root package name */
    private final dc.f f369b;

    /* renamed from: c  reason: collision with root package name */
    private final long f370c;

    /* renamed from: d  reason: collision with root package name */
    private final long f371d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f372e;

    /* renamed from: f  reason: collision with root package name */
    private final Headers f373f;

    /* compiled from: CacheResponse.kt */
    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0003a extends r implements pc.a<CacheControl> {
        C0003a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final CacheControl invoke() {
            return CacheControl.Companion.parse(a.this.d());
        }
    }

    /* compiled from: CacheResponse.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements pc.a<MediaType> {
        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final MediaType invoke() {
            String str = a.this.d().get("Content-Type");
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }
    }

    public a(okio.e eVar) {
        dc.f a10;
        dc.f a11;
        j jVar = j.NONE;
        a10 = h.a(jVar, new C0003a());
        this.f368a = a10;
        a11 = h.a(jVar, new b());
        this.f369b = a11;
        this.f370c = Long.parseLong(eVar.t0());
        this.f371d = Long.parseLong(eVar.t0());
        this.f372e = Integer.parseInt(eVar.t0()) > 0;
        int parseInt = Integer.parseInt(eVar.t0());
        Headers.Builder builder = new Headers.Builder();
        for (int i10 = 0; i10 < parseInt; i10++) {
            l.b(builder, eVar.t0());
        }
        this.f373f = builder.build();
    }

    public final CacheControl a() {
        return (CacheControl) this.f368a.getValue();
    }

    public final MediaType b() {
        return (MediaType) this.f369b.getValue();
    }

    public final long c() {
        return this.f371d;
    }

    public final Headers d() {
        return this.f373f;
    }

    public final long e() {
        return this.f370c;
    }

    public final boolean f() {
        return this.f372e;
    }

    public final void g(okio.d dVar) {
        long j10;
        dVar.P0(this.f370c).D(10);
        dVar.P0(this.f371d).D(10);
        if (this.f372e) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        dVar.P0(j10).D(10);
        dVar.P0(this.f373f.size()).D(10);
        int size = this.f373f.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVar.W(this.f373f.name(i10)).W(": ").W(this.f373f.value(i10)).D(10);
        }
    }

    public a(Response response) {
        dc.f a10;
        dc.f a11;
        j jVar = j.NONE;
        a10 = h.a(jVar, new C0003a());
        this.f368a = a10;
        a11 = h.a(jVar, new b());
        this.f369b = a11;
        this.f370c = response.sentRequestAtMillis();
        this.f371d = response.receivedResponseAtMillis();
        this.f372e = response.handshake() != null;
        this.f373f = response.headers();
    }
}
