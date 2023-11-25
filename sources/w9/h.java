package w9;

import aa.k;
import ba.h;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: NetworkRequestMetricBuilder.java */
/* loaded from: classes3.dex */
public final class h extends com.google.firebase.perf.application.b implements z9.a {

    /* renamed from: v  reason: collision with root package name */
    private static final v9.a f25486v = v9.a.e();

    /* renamed from: f  reason: collision with root package name */
    private final List<PerfSession> f25487f;

    /* renamed from: m  reason: collision with root package name */
    private final GaugeManager f25488m;

    /* renamed from: p  reason: collision with root package name */
    private final k f25489p;

    /* renamed from: q  reason: collision with root package name */
    private final h.b f25490q;

    /* renamed from: r  reason: collision with root package name */
    private final WeakReference<z9.a> f25491r;

    /* renamed from: s  reason: collision with root package name */
    private String f25492s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f25493t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f25494u;

    private h(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static h c(k kVar) {
        return new h(kVar);
    }

    private boolean g() {
        return this.f25490q.H();
    }

    private boolean h() {
        return this.f25490q.J();
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // z9.a
    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            f25486v.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (g() && !h()) {
            this.f25487f.add(perfSession);
        }
    }

    public ba.h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f25491r);
        unregisterForAppState();
        ba.k[] b10 = PerfSession.b(d());
        if (b10 != null) {
            this.f25490q.E(Arrays.asList(b10));
        }
        ba.h build = this.f25490q.build();
        if (!y9.f.c(this.f25492s)) {
            f25486v.a("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        } else if (!this.f25493t) {
            this.f25489p.B(build, getAppState());
            this.f25493t = true;
            return build;
        } else {
            if (this.f25494u) {
                f25486v.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
    }

    List<PerfSession> d() {
        List<PerfSession> unmodifiableList;
        synchronized (this.f25487f) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f25487f) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public long e() {
        return this.f25490q.G();
    }

    public boolean f() {
        return this.f25490q.I();
    }

    public h k(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar = h.d.OPTIONS;
                    break;
                case 1:
                    dVar = h.d.GET;
                    break;
                case 2:
                    dVar = h.d.PUT;
                    break;
                case 3:
                    dVar = h.d.HEAD;
                    break;
                case 4:
                    dVar = h.d.POST;
                    break;
                case 5:
                    dVar = h.d.PATCH;
                    break;
                case 6:
                    dVar = h.d.TRACE;
                    break;
                case 7:
                    dVar = h.d.CONNECT;
                    break;
                case '\b':
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f25490q.L(dVar);
        }
        return this;
    }

    public h l(int i10) {
        this.f25490q.M(i10);
        return this;
    }

    public h n() {
        this.f25490q.N(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h o(long j10) {
        this.f25490q.O(j10);
        return this;
    }

    public h p(long j10) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f25491r);
        this.f25490q.K(j10);
        a(perfSession);
        if (perfSession.f()) {
            this.f25488m.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public h q(String str) {
        if (str == null) {
            this.f25490q.F();
            return this;
        }
        if (i(str)) {
            this.f25490q.P(str);
        } else {
            f25486v.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public h r(long j10) {
        this.f25490q.Q(j10);
        return this;
    }

    public h s(long j10) {
        this.f25490q.R(j10);
        return this;
    }

    public h t(long j10) {
        this.f25490q.S(j10);
        if (SessionManager.getInstance().perfSession().f()) {
            this.f25488m.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h u(long j10) {
        this.f25490q.T(j10);
        return this;
    }

    public h v(String str) {
        if (str != null) {
            this.f25490q.U(n.e(n.d(str), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE));
        }
        return this;
    }

    public h w(String str) {
        this.f25492s = str;
        return this;
    }

    public h(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f25490q = ba.h.B0();
        this.f25491r = new WeakReference<>(this);
        this.f25489p = kVar;
        this.f25488m = gaugeManager;
        this.f25487f = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
