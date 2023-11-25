package i5;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import okhttp3.internal.http2.Http2;
import pc.q;
import q5.g;
import q5.h;

/* compiled from: Configuration.kt */
/* loaded from: classes.dex */
public class b extends p5.b {
    public static final a Q = new a(null);
    private q<? super q5.a, ? super Integer, ? super String, w> A;
    private int B;
    private boolean C;
    private p5.d D;
    private String E;
    private h F;
    private g G;
    private boolean H;
    private boolean I;
    private boolean J;
    private e K;
    private boolean L;
    private boolean M;
    private boolean N;
    private long O;
    private boolean P;

    /* renamed from: r  reason: collision with root package name */
    private final Context f16973r;

    /* renamed from: s  reason: collision with root package name */
    private int f16974s;

    /* renamed from: t  reason: collision with root package name */
    private int f16975t;

    /* renamed from: u  reason: collision with root package name */
    private String f16976u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f16977v;

    /* renamed from: w  reason: collision with root package name */
    private p5.g f16978w;

    /* renamed from: x  reason: collision with root package name */
    private p5.c f16979x;

    /* renamed from: y  reason: collision with root package name */
    private Integer f16980y;

    /* renamed from: z  reason: collision with root package name */
    private String f16981z;

    /* compiled from: Configuration.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ b(String str, Context context, int i10, int i11, String str2, boolean z10, p5.g gVar, p5.c cVar, Integer num, String str3, q qVar, int i12, boolean z11, p5.d dVar, String str4, h hVar, g gVar2, boolean z12, boolean z13, boolean z14, e eVar, boolean z15, boolean z16, boolean z17, long j10, boolean z18, int i13, qc.h hVar2) {
        this(str, context, (i13 & 4) != 0 ? 30 : i10, (i13 & 8) != 0 ? 30000 : i11, (i13 & 16) != 0 ? "$default_instance" : str2, (i13 & 32) != 0 ? false : z10, (i13 & 64) != 0 ? new l5.d() : gVar, (i13 & 128) != 0 ? new l5.b() : cVar, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : num, (i13 & 512) != 0 ? null : str3, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : qVar, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? 5 : i12, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11, (i13 & 8192) != 0 ? p5.d.US : dVar, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str4, (32768 & i13) != 0 ? null : hVar, (65536 & i13) != 0 ? null : gVar2, (131072 & i13) != 0 ? false : z12, (262144 & i13) != 0 ? false : z13, (524288 & i13) != 0 ? false : z14, (1048576 & i13) != 0 ? new e() : eVar, (2097152 & i13) != 0 ? false : z15, (4194304 & i13) != 0 ? true : z16, (8388608 & i13) != 0 ? true : z17, (16777216 & i13) != 0 ? 300000L : j10, (i13 & 33554432) != 0 ? true : z18);
    }

    public final boolean A() {
        return this.I;
    }

    @Override // p5.b
    public q<q5.a, Integer, String, w> b() {
        return this.A;
    }

    @Override // p5.b
    public int c() {
        return this.f16975t;
    }

    @Override // p5.b
    public int d() {
        return this.f16974s;
    }

    @Override // p5.b
    public g e() {
        return this.G;
    }

    @Override // p5.b
    public String f() {
        return this.f16976u;
    }

    @Override // p5.b
    public p5.c g() {
        return this.f16979x;
    }

    @Override // p5.b
    public Integer h() {
        return this.f16980y;
    }

    @Override // p5.b
    public boolean i() {
        return this.f16977v;
    }

    @Override // p5.b
    public String j() {
        return this.f16981z;
    }

    @Override // p5.b
    public h k() {
        return this.F;
    }

    @Override // p5.b
    public String l() {
        return this.E;
    }

    @Override // p5.b
    public p5.d m() {
        return this.D;
    }

    @Override // p5.b
    public p5.g n() {
        return this.f16978w;
    }

    @Override // p5.b
    public boolean o() {
        return this.C;
    }

    public final Context r() {
        return this.f16973r;
    }

    public final boolean s() {
        return this.L;
    }

    public final boolean t() {
        return this.N;
    }

    public final boolean u() {
        return this.M;
    }

    public final long v() {
        return this.O;
    }

    public final boolean w() {
        return this.J;
    }

    public final e x() {
        return this.K;
    }

    public final boolean y() {
        return this.P;
    }

    public final boolean z() {
        return this.H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Context context, int i10, int i11, String str2, boolean z10, p5.g gVar, p5.c cVar, Integer num, String str3, q<? super q5.a, ? super Integer, ? super String, w> qVar, int i12, boolean z11, p5.d dVar, String str4, h hVar, g gVar2, boolean z12, boolean z13, boolean z14, e eVar, boolean z15, boolean z16, boolean z17, long j10, boolean z18) {
        super(str, i10, i11, str2, z10, gVar, cVar, num, str3, qVar, i12, z11, dVar, str4, hVar, gVar2);
        qc.q.i(str, "apiKey");
        qc.q.i(context, "context");
        qc.q.i(str2, "instanceName");
        qc.q.i(gVar, "storageProvider");
        qc.q.i(cVar, "loggerProvider");
        qc.q.i(dVar, "serverZone");
        qc.q.i(eVar, "trackingOptions");
        this.f16973r = context;
        this.f16974s = i10;
        this.f16975t = i11;
        this.f16976u = str2;
        this.f16977v = z10;
        this.f16978w = gVar;
        this.f16979x = cVar;
        this.f16980y = num;
        this.f16981z = str3;
        this.A = qVar;
        this.B = i12;
        this.C = z11;
        this.D = dVar;
        this.E = str4;
        this.F = hVar;
        this.G = gVar2;
        this.H = z12;
        this.I = z13;
        this.J = z14;
        this.K = eVar;
        this.L = z15;
        this.M = z16;
        this.N = z17;
        this.O = j10;
        this.P = z18;
    }
}
