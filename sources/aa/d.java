package aa;

import android.content.Context;
import ba.l;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.n;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RateLimiter.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f416a;

    /* renamed from: b  reason: collision with root package name */
    private final float f417b;

    /* renamed from: c  reason: collision with root package name */
    private final float f418c;

    /* renamed from: d  reason: collision with root package name */
    private a f419d;

    /* renamed from: e  reason: collision with root package name */
    private a f420e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f421f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RateLimiter.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        private static final v9.a f422k = v9.a.e();

        /* renamed from: l  reason: collision with root package name */
        private static final long f423l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        private final com.google.firebase.perf.util.a f424a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f425b;

        /* renamed from: c  reason: collision with root package name */
        private Timer f426c;

        /* renamed from: d  reason: collision with root package name */
        private com.google.firebase.perf.util.i f427d;

        /* renamed from: e  reason: collision with root package name */
        private long f428e;

        /* renamed from: f  reason: collision with root package name */
        private double f429f;

        /* renamed from: g  reason: collision with root package name */
        private com.google.firebase.perf.util.i f430g;

        /* renamed from: h  reason: collision with root package name */
        private com.google.firebase.perf.util.i f431h;

        /* renamed from: i  reason: collision with root package name */
        private long f432i;

        /* renamed from: j  reason: collision with root package name */
        private long f433j;

        a(com.google.firebase.perf.util.i iVar, long j10, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z10) {
            this.f424a = aVar;
            this.f428e = j10;
            this.f427d = iVar;
            this.f429f = j10;
            this.f426c = aVar.a();
            g(aVar2, str, z10);
            this.f425b = z10;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.E();
            }
            return aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.t();
            }
            return aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.F();
            }
            return aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.t();
            }
            return aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            long f10 = f(aVar, str);
            long e10 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.google.firebase.perf.util.i iVar = new com.google.firebase.perf.util.i(e10, f10, timeUnit);
            this.f430g = iVar;
            this.f432i = e10;
            if (z10) {
                f422k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(e10));
            }
            long d10 = d(aVar, str);
            long c10 = c(aVar, str);
            com.google.firebase.perf.util.i iVar2 = new com.google.firebase.perf.util.i(c10, d10, timeUnit);
            this.f431h = iVar2;
            this.f433j = c10;
            if (z10) {
                f422k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(c10));
            }
        }

        synchronized void a(boolean z10) {
            com.google.firebase.perf.util.i iVar;
            long j10;
            if (z10) {
                iVar = this.f430g;
            } else {
                iVar = this.f431h;
            }
            this.f427d = iVar;
            if (z10) {
                j10 = this.f432i;
            } else {
                j10 = this.f433j;
            }
            this.f428e = j10;
        }

        synchronized boolean b(ba.i iVar) {
            Timer a10 = this.f424a.a();
            double d10 = (this.f426c.d(a10) * this.f427d.a()) / f423l;
            if (d10 > 0.0d) {
                this.f429f = Math.min(this.f429f + d10, this.f428e);
                this.f426c = a10;
            }
            double d11 = this.f429f;
            if (d11 >= 1.0d) {
                this.f429f = d11 - 1.0d;
                return true;
            }
            if (this.f425b) {
                f422k.j("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public d(Context context, com.google.firebase.perf.util.i iVar, long j10) {
        this(iVar, j10, new com.google.firebase.perf.util.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f421f = n.b(context);
    }

    @VisibleForTesting
    static float b() {
        return new Random().nextFloat();
    }

    private boolean c(List<ba.k> list) {
        if (list.size() <= 0 || list.get(0).W() <= 0 || list.get(0).V(0) != l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.f418c < this.f416a.f()) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (this.f417b < this.f416a.s()) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if (this.f417b < this.f416a.G()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f419d.a(z10);
        this.f420e.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(ba.i iVar) {
        if (!j(iVar)) {
            return false;
        }
        if (iVar.i()) {
            return !this.f420e.b(iVar);
        }
        if (!iVar.f()) {
            return true;
        }
        return !this.f419d.b(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(ba.i iVar) {
        if (iVar.f() && !f() && !c(iVar.g().p0())) {
            return false;
        }
        if (i(iVar) && !d() && !c(iVar.g().p0())) {
            return false;
        }
        if (iVar.i() && !e() && !c(iVar.j().l0())) {
            return false;
        }
        return true;
    }

    protected boolean i(ba.i iVar) {
        if (iVar.f() && iVar.g().o0().startsWith("_st_") && iVar.g().e0("Hosting_activity")) {
            return true;
        }
        return false;
    }

    boolean j(ba.i iVar) {
        if ((iVar.f() && ((iVar.g().o0().equals(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString()) || iVar.g().o0().equals(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString())) && iVar.g().h0() > 0)) || iVar.a()) {
            return false;
        }
        return true;
    }

    d(com.google.firebase.perf.util.i iVar, long j10, com.google.firebase.perf.util.a aVar, float f10, float f11, com.google.firebase.perf.config.a aVar2) {
        this.f419d = null;
        this.f420e = null;
        boolean z10 = false;
        this.f421f = false;
        n.a(0.0f <= f10 && f10 < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        if (0.0f <= f11 && f11 < 1.0f) {
            z10 = true;
        }
        n.a(z10, "Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f417b = f10;
        this.f418c = f11;
        this.f416a = aVar2;
        this.f419d = new a(iVar, j10, aVar, aVar2, "Trace", this.f421f);
        this.f420e = new a(iVar, j10, aVar, aVar2, "Network", this.f421f);
    }
}
