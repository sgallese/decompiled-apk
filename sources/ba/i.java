package ba;

import ba.c;
import com.google.protobuf.x;
import com.google.protobuf.y0;

/* compiled from: PerfMetric.java */
/* loaded from: classes3.dex */
public final class i extends x<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile y0<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* compiled from: PerfMetric.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8106a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8106a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8106a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8106a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8106a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8106a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8106a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8106a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfMetric.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(c.b bVar) {
            y();
            ((i) this.f12465m).Y(bVar.build());
            return this;
        }

        public b F(g gVar) {
            y();
            ((i) this.f12465m).Z(gVar);
            return this;
        }

        public b G(h hVar) {
            y();
            ((i) this.f12465m).a0(hVar);
            return this;
        }

        public b H(m mVar) {
            y();
            ((i) this.f12465m).b0(mVar);
            return this;
        }

        @Override // ba.j
        public boolean a() {
            return ((i) this.f12465m).a();
        }

        @Override // ba.j
        public boolean f() {
            return ((i) this.f12465m).f();
        }

        @Override // ba.j
        public m g() {
            return ((i) this.f12465m).g();
        }

        @Override // ba.j
        public boolean i() {
            return ((i) this.f12465m).i();
        }

        @Override // ba.j
        public h j() {
            return ((i) this.f12465m).j();
        }

        @Override // ba.j
        public g l() {
            return ((i) this.f12465m).l();
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        x.O(i.class, iVar);
    }

    private i() {
    }

    public static b X() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8106a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<i> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (i.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new x.b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c V() {
        c cVar = this.applicationInfo_;
        if (cVar == null) {
            return c.X();
        }
        return cVar;
    }

    public boolean W() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // ba.j
    public boolean a() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // ba.j
    public boolean f() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // ba.j
    public m g() {
        m mVar = this.traceMetric_;
        if (mVar == null) {
            return m.k0();
        }
        return mVar;
    }

    @Override // ba.j
    public boolean i() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // ba.j
    public h j() {
        h hVar = this.networkRequestMetric_;
        if (hVar == null) {
            return h.i0();
        }
        return hVar;
    }

    @Override // ba.j
    public g l() {
        g gVar = this.gaugeMetric_;
        if (gVar == null) {
            return g.b0();
        }
        return gVar;
    }
}
