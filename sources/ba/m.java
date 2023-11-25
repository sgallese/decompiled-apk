package ba;

import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.r1;
import com.google.protobuf.x;
import com.google.protobuf.y0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: TraceMetric.java */
/* loaded from: classes3.dex */
public final class m extends x<m, b> implements r0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile y0<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private k0<String, Long> counters_ = k0.d();
    private k0<String, String> customAttributes_ = k0.d();
    private String name_ = "";
    private z.i<m> subtraces_ = x.D();
    private z.i<k> perfSessions_ = x.D();

    /* compiled from: TraceMetric.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8109a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8109a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8109a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8109a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8109a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8109a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8109a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8109a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: TraceMetric.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<m, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(Iterable<? extends k> iterable) {
            y();
            ((m) this.f12465m).a0(iterable);
            return this;
        }

        public b F(Iterable<? extends m> iterable) {
            y();
            ((m) this.f12465m).b0(iterable);
            return this;
        }

        public b G(k kVar) {
            y();
            ((m) this.f12465m).c0(kVar);
            return this;
        }

        public b H(m mVar) {
            y();
            ((m) this.f12465m).d0(mVar);
            return this;
        }

        public b I(Map<String, Long> map) {
            y();
            ((m) this.f12465m).m0().putAll(map);
            return this;
        }

        public b J(Map<String, String> map) {
            y();
            ((m) this.f12465m).n0().putAll(map);
            return this;
        }

        public b K(String str, long j10) {
            str.getClass();
            y();
            ((m) this.f12465m).m0().put(str, Long.valueOf(j10));
            return this;
        }

        public b L(String str, String str2) {
            str.getClass();
            str2.getClass();
            y();
            ((m) this.f12465m).n0().put(str, str2);
            return this;
        }

        public b M(long j10) {
            y();
            ((m) this.f12465m).x0(j10);
            return this;
        }

        public b N(long j10) {
            y();
            ((m) this.f12465m).y0(j10);
            return this;
        }

        public b O(String str) {
            y();
            ((m) this.f12465m).z0(str);
            return this;
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TraceMetric.java */
    /* loaded from: classes3.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final j0<String, Long> f8110a = j0.d(r1.b.STRING, "", r1.b.INT64, 0L);
    }

    /* compiled from: TraceMetric.java */
    /* loaded from: classes3.dex */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final j0<String, String> f8111a;

        static {
            r1.b bVar = r1.b.STRING;
            f8111a = j0.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        x.O(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(Iterable<? extends k> iterable) {
        f0();
        com.google.protobuf.a.p(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(Iterable<? extends m> iterable) {
        g0();
        com.google.protobuf.a.p(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(k kVar) {
        kVar.getClass();
        f0();
        this.perfSessions_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(m mVar) {
        mVar.getClass();
        g0();
        this.subtraces_.add(mVar);
    }

    private void f0() {
        z.i<k> iVar = this.perfSessions_;
        if (!iVar.R0()) {
            this.perfSessions_ = x.K(iVar);
        }
    }

    private void g0() {
        z.i<m> iVar = this.subtraces_;
        if (!iVar.R0()) {
            this.subtraces_ = x.K(iVar);
        }
    }

    public static m k0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> m0() {
        return u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> n0() {
        return v0();
    }

    private k0<String, Long> s0() {
        return this.counters_;
    }

    private k0<String, String> t0() {
        return this.customAttributes_;
    }

    private k0<String, Long> u0() {
        if (!this.counters_.i()) {
            this.counters_ = this.counters_.l();
        }
        return this.counters_;
    }

    private k0<String, String> v0() {
        if (!this.customAttributes_.i()) {
            this.customAttributes_ = this.customAttributes_.l();
        }
        return this.customAttributes_;
    }

    public static b w0() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8109a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f8110a, "subtraces_", m.class, "customAttributes_", d.f8111a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<m> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (m.class) {
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

    public boolean e0(String str) {
        str.getClass();
        return t0().containsKey(str);
    }

    public int h0() {
        return s0().size();
    }

    public Map<String, Long> i0() {
        return Collections.unmodifiableMap(s0());
    }

    public Map<String, String> j0() {
        return Collections.unmodifiableMap(t0());
    }

    public long l0() {
        return this.durationUs_;
    }

    public String o0() {
        return this.name_;
    }

    public List<k> p0() {
        return this.perfSessions_;
    }

    public List<m> q0() {
        return this.subtraces_;
    }

    public boolean r0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }
}
