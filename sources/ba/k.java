package ba;

import com.google.protobuf.a0;
import com.google.protobuf.r0;
import com.google.protobuf.x;
import com.google.protobuf.y0;
import com.google.protobuf.z;

/* compiled from: PerfSession.java */
/* loaded from: classes3.dex */
public final class k extends x<k, c> implements r0 {
    private static final k DEFAULT_INSTANCE;
    private static volatile y0<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final a0<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private z.g sessionVerbosity_ = x.C();

    /* compiled from: PerfSession.java */
    /* loaded from: classes3.dex */
    class a implements a0<Integer, l> {
        a() {
        }

        @Override // com.google.protobuf.a0
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public l convert(Integer num) {
            l forNumber = l.forNumber(num.intValue());
            if (forNumber == null) {
                return l.SESSION_VERBOSITY_NONE;
            }
            return forNumber;
        }
    }

    /* compiled from: PerfSession.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8107a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8107a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8107a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8107a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8107a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8107a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8107a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8107a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfSession.java */
    /* loaded from: classes3.dex */
    public static final class c extends x.a<k, c> implements r0 {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c E(l lVar) {
            y();
            ((k) this.f12465m).T(lVar);
            return this;
        }

        public c F(String str) {
            y();
            ((k) this.f12465m).Y(str);
            return this;
        }

        private c() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        x.O(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(l lVar) {
        lVar.getClass();
        U();
        this.sessionVerbosity_.q(lVar.getNumber());
    }

    private void U() {
        z.g gVar = this.sessionVerbosity_;
        if (!gVar.R0()) {
            this.sessionVerbosity_ = x.J(gVar);
        }
    }

    public static c X() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (b.f8107a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<k> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (k.class) {
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

    public l V(int i10) {
        return sessionVerbosity_converter_.convert(Integer.valueOf(this.sessionVerbosity_.getInt(i10)));
    }

    public int W() {
        return this.sessionVerbosity_.size();
    }
}
