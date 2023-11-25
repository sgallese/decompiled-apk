package ba;

import com.google.protobuf.r0;
import com.google.protobuf.x;
import com.google.protobuf.y0;
import com.google.protobuf.z;

/* compiled from: TransportInfo.java */
/* loaded from: classes3.dex */
public final class n extends x<n, b> implements r0 {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile y0<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* compiled from: TransportInfo.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8112a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8112a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8112a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8112a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8112a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8112a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8112a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8112a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: TransportInfo.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<n, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TransportInfo.java */
    /* loaded from: classes3.dex */
    public enum c implements z.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final z.d<c> internalValueMap = new a();
        private final int value;

        /* compiled from: TransportInfo.java */
        /* loaded from: classes3.dex */
        class a implements z.d<c> {
            a() {
            }

            @Override // com.google.protobuf.z.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.forNumber(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: TransportInfo.java */
        /* loaded from: classes3.dex */
        public static final class b implements z.e {

            /* renamed from: a  reason: collision with root package name */
            static final z.e f8113a = new b();

            private b() {
            }

            @Override // com.google.protobuf.z.e
            public boolean a(int i10) {
                if (c.forNumber(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c forNumber(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return FL_LEGACY_V1;
            }
            return SOURCE_UNKNOWN;
        }

        public static z.d<c> internalGetValueMap() {
            return internalValueMap;
        }

        public static z.e internalGetVerifier() {
            return b.f8113a;
        }

        @Override // com.google.protobuf.z.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static c valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        x.O(n.class, nVar);
    }

    private n() {
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8112a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<n> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (n.class) {
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
