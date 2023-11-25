package ba;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.r1;
import com.google.protobuf.x;
import com.google.protobuf.y0;
import com.google.protobuf.z;
import java.util.List;

/* compiled from: NetworkRequestMetric.java */
/* loaded from: classes3.dex */
public final class h extends x<h, b> implements r0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile y0<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private k0<String, String> customAttributes_ = k0.d();
    private String url_ = "";
    private String responseContentType_ = "";
    private z.i<k> perfSessions_ = x.D();

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8102a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8102a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8102a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8102a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8102a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8102a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8102a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8102a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<h, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(Iterable<? extends k> iterable) {
            y();
            ((h) this.f12465m).e0(iterable);
            return this;
        }

        public b F() {
            y();
            ((h) this.f12465m).f0();
            return this;
        }

        public long G() {
            return ((h) this.f12465m).r0();
        }

        public boolean H() {
            return ((h) this.f12465m).t0();
        }

        public boolean I() {
            return ((h) this.f12465m).v0();
        }

        public boolean J() {
            return ((h) this.f12465m).z0();
        }

        public b K(long j10) {
            y();
            ((h) this.f12465m).C0(j10);
            return this;
        }

        public b L(d dVar) {
            y();
            ((h) this.f12465m).D0(dVar);
            return this;
        }

        public b M(int i10) {
            y();
            ((h) this.f12465m).E0(i10);
            return this;
        }

        public b N(e eVar) {
            y();
            ((h) this.f12465m).F0(eVar);
            return this;
        }

        public b O(long j10) {
            y();
            ((h) this.f12465m).G0(j10);
            return this;
        }

        public b P(String str) {
            y();
            ((h) this.f12465m).H0(str);
            return this;
        }

        public b Q(long j10) {
            y();
            ((h) this.f12465m).I0(j10);
            return this;
        }

        public b R(long j10) {
            y();
            ((h) this.f12465m).J0(j10);
            return this;
        }

        public b S(long j10) {
            y();
            ((h) this.f12465m).K0(j10);
            return this;
        }

        public b T(long j10) {
            y();
            ((h) this.f12465m).L0(j10);
            return this;
        }

        public b U(String str) {
            y();
            ((h) this.f12465m).M0(str);
            return this;
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes3.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final j0<String, String> f8103a;

        static {
            r1.b bVar = r1.b.STRING;
            f8103a = j0.d(bVar, "", bVar, "");
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes3.dex */
    public enum d implements z.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final z.d<d> internalValueMap = new a();
        private final int value;

        /* compiled from: NetworkRequestMetric.java */
        /* loaded from: classes3.dex */
        class a implements z.d<d> {
            a() {
            }

            @Override // com.google.protobuf.z.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.forNumber(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NetworkRequestMetric.java */
        /* loaded from: classes3.dex */
        public static final class b implements z.e {

            /* renamed from: a  reason: collision with root package name */
            static final z.e f8104a = new b();

            private b() {
            }

            @Override // com.google.protobuf.z.e
            public boolean a(int i10) {
                if (d.forNumber(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        d(int i10) {
            this.value = i10;
        }

        public static d forNumber(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static z.d<d> internalGetValueMap() {
            return internalValueMap;
        }

        public static z.e internalGetVerifier() {
            return b.f8104a;
        }

        @Override // com.google.protobuf.z.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static d valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes3.dex */
    public enum e implements z.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final z.d<e> internalValueMap = new a();
        private final int value;

        /* compiled from: NetworkRequestMetric.java */
        /* loaded from: classes3.dex */
        class a implements z.d<e> {
            a() {
            }

            @Override // com.google.protobuf.z.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public e a(int i10) {
                return e.forNumber(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NetworkRequestMetric.java */
        /* loaded from: classes3.dex */
        public static final class b implements z.e {

            /* renamed from: a  reason: collision with root package name */
            static final z.e f8105a = new b();

            private b() {
            }

            @Override // com.google.protobuf.z.e
            public boolean a(int i10) {
                if (e.forNumber(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        e(int i10) {
            this.value = i10;
        }

        public static e forNumber(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return GENERIC_CLIENT_ERROR;
            }
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }

        public static z.d<e> internalGetValueMap() {
            return internalValueMap;
        }

        public static z.e internalGetVerifier() {
            return b.f8105a;
        }

        @Override // com.google.protobuf.z.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static e valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.O(h.class, hVar);
    }

    private h() {
    }

    public static b B0() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(d dVar) {
        this.httpMethod_ = dVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(e eVar) {
        this.networkClientErrorReason_ = eVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(long j10) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(long j10) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(Iterable<? extends k> iterable) {
        g0();
        com.google.protobuf.a.p(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = i0().n0();
    }

    private void g0() {
        z.i<k> iVar = this.perfSessions_;
        if (!iVar.R0()) {
            this.perfSessions_ = x.K(iVar);
        }
    }

    public static h i0() {
        return DEFAULT_INSTANCE;
    }

    public boolean A0() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8102a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.internalGetVerifier(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.internalGetVerifier(), "customAttributes_", c.f8103a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<h> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (h.class) {
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

    public long h0() {
        return this.clientStartTimeUs_;
    }

    public d j0() {
        d forNumber = d.forNumber(this.httpMethod_);
        if (forNumber == null) {
            return d.HTTP_METHOD_UNKNOWN;
        }
        return forNumber;
    }

    public int k0() {
        return this.httpResponseCode_;
    }

    public List<k> l0() {
        return this.perfSessions_;
    }

    public long m0() {
        return this.requestPayloadBytes_;
    }

    public String n0() {
        return this.responseContentType_;
    }

    public long o0() {
        return this.responsePayloadBytes_;
    }

    public long p0() {
        return this.timeToRequestCompletedUs_;
    }

    public long q0() {
        return this.timeToResponseCompletedUs_;
    }

    public long r0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String s0() {
        return this.url_;
    }

    public boolean t0() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean u0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean v0() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean w0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean x0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean y0() {
        if ((this.bitField0_ & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        if ((this.bitField0_ & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            return true;
        }
        return false;
    }
}
