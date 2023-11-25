package ba;

import com.google.protobuf.r0;
import com.google.protobuf.x;
import com.google.protobuf.y0;

/* compiled from: CpuMetricReading.java */
/* loaded from: classes3.dex */
public final class e extends x<e, b> implements r0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile y0<e> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* compiled from: CpuMetricReading.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8099a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8099a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8099a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8099a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8099a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8099a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8099a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8099a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CpuMetricReading.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<e, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(long j10) {
            y();
            ((e) this.f12465m).V(j10);
            return this;
        }

        public b F(long j10) {
            y();
            ((e) this.f12465m).W(j10);
            return this;
        }

        public b G(long j10) {
            y();
            ((e) this.f12465m).X(j10);
            return this;
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        x.O(e.class, eVar);
    }

    private e() {
    }

    public static b U() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(long j10) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(long j10) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j10;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8099a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<e> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (e.class) {
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
}
