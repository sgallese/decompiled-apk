package ba;

import com.google.protobuf.r0;
import com.google.protobuf.x;
import com.google.protobuf.y0;
import com.google.protobuf.z;

/* compiled from: GaugeMetric.java */
/* loaded from: classes3.dex */
public final class g extends x<g, b> implements r0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile y0<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private z.i<e> cpuMetricReadings_ = x.D();
    private z.i<ba.b> androidMemoryReadings_ = x.D();

    /* compiled from: GaugeMetric.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8101a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8101a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8101a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8101a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8101a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8101a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8101a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8101a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetric.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<g, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(ba.b bVar) {
            y();
            ((g) this.f12465m).V(bVar);
            return this;
        }

        public b F(e eVar) {
            y();
            ((g) this.f12465m).W(eVar);
            return this;
        }

        public b G(f fVar) {
            y();
            ((g) this.f12465m).g0(fVar);
            return this;
        }

        public b H(String str) {
            y();
            ((g) this.f12465m).h0(str);
            return this;
        }

        private b() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        x.O(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(ba.b bVar) {
        bVar.getClass();
        X();
        this.androidMemoryReadings_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(e eVar) {
        eVar.getClass();
        Y();
        this.cpuMetricReadings_.add(eVar);
    }

    private void X() {
        z.i<ba.b> iVar = this.androidMemoryReadings_;
        if (!iVar.R0()) {
            this.androidMemoryReadings_ = x.K(iVar);
        }
    }

    private void Y() {
        z.i<e> iVar = this.cpuMetricReadings_;
        if (!iVar.R0()) {
            this.cpuMetricReadings_ = x.K(iVar);
        }
    }

    public static g b0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8101a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", ba.b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<g> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (g.class) {
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

    public int Z() {
        return this.androidMemoryReadings_.size();
    }

    public int a0() {
        return this.cpuMetricReadings_.size();
    }

    public f c0() {
        f fVar = this.gaugeMetadata_;
        if (fVar == null) {
            return f.U();
        }
        return fVar;
    }

    public boolean d0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean e0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
