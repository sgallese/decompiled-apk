package t9;

import com.google.firebase.e;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import g6.g;
import u9.d;
import u9.f;
import u9.h;

/* compiled from: DaggerFirebasePerformanceComponent.java */
/* loaded from: classes3.dex */
public final class a implements t9.b {

    /* renamed from: a  reason: collision with root package name */
    private cc.a<e> f23716a;

    /* renamed from: b  reason: collision with root package name */
    private cc.a<i9.b<c>> f23717b;

    /* renamed from: c  reason: collision with root package name */
    private cc.a<j9.e> f23718c;

    /* renamed from: d  reason: collision with root package name */
    private cc.a<i9.b<g>> f23719d;

    /* renamed from: e  reason: collision with root package name */
    private cc.a<RemoteConfigManager> f23720e;

    /* renamed from: f  reason: collision with root package name */
    private cc.a<com.google.firebase.perf.config.a> f23721f;

    /* renamed from: g  reason: collision with root package name */
    private cc.a<SessionManager> f23722g;

    /* renamed from: h  reason: collision with root package name */
    private cc.a<s9.e> f23723h;

    /* compiled from: DaggerFirebasePerformanceComponent.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private u9.a f23724a;

        public t9.b a() {
            bb.b.a(this.f23724a, u9.a.class);
            return new a(this.f23724a);
        }

        public b b(u9.a aVar) {
            this.f23724a = (u9.a) bb.b.b(aVar);
            return this;
        }

        private b() {
        }
    }

    public static b b() {
        return new b();
    }

    private void c(u9.a aVar) {
        this.f23716a = u9.c.a(aVar);
        this.f23717b = u9.e.a(aVar);
        this.f23718c = d.a(aVar);
        this.f23719d = h.a(aVar);
        this.f23720e = f.a(aVar);
        this.f23721f = u9.b.a(aVar);
        u9.g a10 = u9.g.a(aVar);
        this.f23722g = a10;
        this.f23723h = bb.a.a(s9.g.a(this.f23716a, this.f23717b, this.f23718c, this.f23719d, this.f23720e, this.f23721f, a10));
    }

    @Override // t9.b
    public s9.e a() {
        return this.f23723h.get();
    }

    private a(u9.a aVar) {
        c(aVar);
    }
}
