package ba;

import com.google.protobuf.r0;
import com.google.protobuf.x;
import com.google.protobuf.y0;

/* compiled from: AndroidApplicationInfo.java */
/* loaded from: classes3.dex */
public final class a extends x<a, b> implements r0 {
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile y0<a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* compiled from: AndroidApplicationInfo.java */
    /* renamed from: ba.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C0186a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8094a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8094a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8094a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8094a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8094a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8094a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8094a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8094a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AndroidApplicationInfo.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<a, b> implements r0 {
        /* synthetic */ b(C0186a c0186a) {
            this();
        }

        public b E(String str) {
            y();
            ((a) this.f12465m).Y(str);
            return this;
        }

        public b F(String str) {
            y();
            ((a) this.f12465m).Z(str);
            return this;
        }

        public b G(String str) {
            y();
            ((a) this.f12465m).a0(str);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        x.O(a.class, aVar);
    }

    private a() {
    }

    public static a U() {
        return DEFAULT_INSTANCE;
    }

    public static b X() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        C0186a c0186a = null;
        switch (C0186a.f8094a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0186a);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<a> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (a.class) {
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

    public boolean V() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean W() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }
}
