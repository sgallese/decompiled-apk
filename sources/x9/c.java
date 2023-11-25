package x9;

import android.content.Context;
import ba.h;
import com.google.firebase.perf.util.l;
import java.net.URI;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebasePerfNetworkValidator.java */
/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final v9.a f25881c = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final h f25882a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f25883b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(h hVar, Context context) {
        this.f25883b = context;
        this.f25882a = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f25881c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return l.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        if (str != null && !i(str) && str.length() <= 255) {
            return true;
        }
        return false;
    }

    private boolean m(int i10) {
        if (i10 > 0) {
            return true;
        }
        return false;
    }

    private boolean n(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    private boolean o(int i10) {
        if (i10 != -1 && i10 <= 0) {
            return false;
        }
        return true;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        if (!"http".equalsIgnoreCase(str) && !"https".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    private boolean q(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    private boolean r(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }

    @Override // x9.e
    public boolean c() {
        h.d dVar;
        if (j(this.f25882a.s0())) {
            f25881c.j("URL is missing:" + this.f25882a.s0());
            return false;
        }
        URI g10 = g(this.f25882a.s0());
        if (g10 == null) {
            f25881c.j("URL cannot be parsed");
            return false;
        } else if (!h(g10, this.f25883b)) {
            f25881c.j("URL fails allowlist rule: " + g10);
            return false;
        } else if (!k(g10.getHost())) {
            f25881c.j("URL host is null or invalid");
            return false;
        } else if (!p(g10.getScheme())) {
            f25881c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g10.getUserInfo())) {
            f25881c.j("URL user info is null");
            return false;
        } else if (!o(g10.getPort())) {
            f25881c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f25882a.u0()) {
                dVar = this.f25882a.j0();
            } else {
                dVar = null;
            }
            if (!l(dVar)) {
                f25881c.j("HTTP Method is null or invalid: " + this.f25882a.j0());
                return false;
            } else if (this.f25882a.v0() && !m(this.f25882a.k0())) {
                f25881c.j("HTTP ResponseCode is a negative value:" + this.f25882a.k0());
                return false;
            } else if (this.f25882a.w0() && !n(this.f25882a.m0())) {
                f25881c.j("Request Payload is a negative value:" + this.f25882a.m0());
                return false;
            } else if (this.f25882a.x0() && !n(this.f25882a.o0())) {
                f25881c.j("Response Payload is a negative value:" + this.f25882a.o0());
                return false;
            } else if (this.f25882a.t0() && this.f25882a.h0() > 0) {
                if (this.f25882a.y0() && !q(this.f25882a.p0())) {
                    f25881c.j("Time to complete the request is a negative value:" + this.f25882a.p0());
                    return false;
                } else if (this.f25882a.A0() && !q(this.f25882a.r0())) {
                    f25881c.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f25882a.r0());
                    return false;
                } else if (this.f25882a.z0() && this.f25882a.q0() > 0) {
                    if (!this.f25882a.v0()) {
                        f25881c.j("Did not receive a HTTP Response Code");
                        return false;
                    }
                    return true;
                } else {
                    f25881c.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f25882a.q0());
                    return false;
                }
            } else {
                f25881c.j("Start time of the request is null, or zero, or a negative value:" + this.f25882a.h0());
                return false;
            }
        }
    }

    boolean l(h.d dVar) {
        if (dVar != null && dVar != h.d.HTTP_METHOD_UNKNOWN) {
            return true;
        }
        return false;
    }
}
