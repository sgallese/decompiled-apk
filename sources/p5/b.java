package p5;

import dc.w;
import pc.q;
import q5.h;
import yc.v;

/* compiled from: Configuration.kt */
/* loaded from: classes.dex */
public class b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f21081q = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f21082a;

    /* renamed from: b  reason: collision with root package name */
    private int f21083b;

    /* renamed from: c  reason: collision with root package name */
    private int f21084c;

    /* renamed from: d  reason: collision with root package name */
    private String f21085d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21086e;

    /* renamed from: f  reason: collision with root package name */
    private final g f21087f;

    /* renamed from: g  reason: collision with root package name */
    private final c f21088g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f21089h;

    /* renamed from: i  reason: collision with root package name */
    private String f21090i;

    /* renamed from: j  reason: collision with root package name */
    private q<? super q5.a, ? super Integer, ? super String, w> f21091j;

    /* renamed from: k  reason: collision with root package name */
    private int f21092k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21093l;

    /* renamed from: m  reason: collision with root package name */
    private d f21094m;

    /* renamed from: n  reason: collision with root package name */
    private String f21095n;

    /* renamed from: o  reason: collision with root package name */
    private h f21096o;

    /* renamed from: p  reason: collision with root package name */
    private q5.g f21097p;

    /* compiled from: Configuration.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public b(String str, int i10, int i11, String str2, boolean z10, g gVar, c cVar, Integer num, String str3, q<? super q5.a, ? super Integer, ? super String, w> qVar, int i12, boolean z11, d dVar, String str4, h hVar, q5.g gVar2) {
        qc.q.i(str, "apiKey");
        qc.q.i(str2, "instanceName");
        qc.q.i(gVar, "storageProvider");
        qc.q.i(cVar, "loggerProvider");
        qc.q.i(dVar, "serverZone");
        this.f21082a = str;
        this.f21083b = i10;
        this.f21084c = i11;
        this.f21085d = str2;
        this.f21086e = z10;
        this.f21087f = gVar;
        this.f21088g = cVar;
        this.f21089h = num;
        this.f21090i = str3;
        this.f21091j = qVar;
        this.f21092k = i12;
        this.f21093l = z11;
        this.f21094m = dVar;
        this.f21095n = str4;
        this.f21096o = hVar;
        this.f21097p = gVar2;
    }

    public final String a() {
        return this.f21082a;
    }

    public q<q5.a, Integer, String, w> b() {
        throw null;
    }

    public int c() {
        throw null;
    }

    public int d() {
        throw null;
    }

    public q5.g e() {
        throw null;
    }

    public String f() {
        throw null;
    }

    public c g() {
        throw null;
    }

    public Integer h() {
        throw null;
    }

    public boolean i() {
        throw null;
    }

    public String j() {
        throw null;
    }

    public h k() {
        throw null;
    }

    public String l() {
        throw null;
    }

    public d m() {
        throw null;
    }

    public g n() {
        throw null;
    }

    public boolean o() {
        throw null;
    }

    public final boolean p() {
        boolean z10;
        Boolean valueOf;
        Integer h10 = h();
        if (h10 == null) {
            valueOf = null;
        } else {
            if (h10.intValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            valueOf = Boolean.valueOf(z10);
        }
        if (valueOf == null) {
            return true;
        }
        return valueOf.booleanValue();
    }

    public final boolean q() {
        boolean u10;
        u10 = v.u(this.f21082a);
        if ((!u10) != false && d() > 0 && c() > 0 && p()) {
            return true;
        }
        return false;
    }
}
