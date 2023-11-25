package ba;

import ba.a;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.r1;
import com.google.protobuf.x;
import com.google.protobuf.y0;
import java.util.Map;

/* compiled from: ApplicationInfo.java */
/* loaded from: classes3.dex */
public final class c extends x<c, b> implements r0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile y0<c> PARSER;
    private ba.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private k0<String, String> customAttributes_ = k0.d();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* compiled from: ApplicationInfo.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8096a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8096a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8096a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8096a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8096a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8096a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8096a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8096a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* loaded from: classes3.dex */
    public static final class b extends x.a<c, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean E() {
            return ((c) this.f12465m).a0();
        }

        public b F(Map<String, String> map) {
            y();
            ((c) this.f12465m).Y().putAll(map);
            return this;
        }

        public b G(a.b bVar) {
            y();
            ((c) this.f12465m).f0(bVar.build());
            return this;
        }

        public b H(String str) {
            y();
            ((c) this.f12465m).g0(str);
            return this;
        }

        public b I(d dVar) {
            y();
            ((c) this.f12465m).h0(dVar);
            return this;
        }

        public b J(String str) {
            y();
            ((c) this.f12465m).i0(str);
            return this;
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: ba.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0188c {

        /* renamed from: a  reason: collision with root package name */
        static final j0<String, String> f8097a;

        static {
            r1.b bVar = r1.b.STRING;
            f8097a = j0.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        x.O(c.class, cVar);
    }

    private c() {
    }

    public static c X() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> Y() {
        return d0();
    }

    private k0<String, String> d0() {
        if (!this.customAttributes_.i()) {
            this.customAttributes_ = this.customAttributes_.l();
        }
        return this.customAttributes_;
    }

    public static b e0() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(ba.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(d dVar) {
        this.applicationProcessState_ = dVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8096a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.internalGetVerifier(), "customAttributes_", C0188c.f8097a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<c> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (c.class) {
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

    public ba.a W() {
        ba.a aVar = this.androidAppInfo_;
        if (aVar == null) {
            return ba.a.U();
        }
        return aVar;
    }

    public boolean Z() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean a0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean b0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean c0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
