package ba;

import com.google.protobuf.r0;
import com.google.protobuf.x;
import com.google.protobuf.y0;

/* compiled from: AndroidMemoryReading.java */
/* loaded from: classes3.dex */
public final class b extends x<b, C0187b> implements r0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile y0<b> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* compiled from: AndroidMemoryReading.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8095a;

        static {
            int[] iArr = new int[x.f.values().length];
            f8095a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8095a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8095a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8095a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8095a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8095a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8095a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AndroidMemoryReading.java */
    /* renamed from: ba.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0187b extends x.a<b, C0187b> implements r0 {
        /* synthetic */ C0187b(a aVar) {
            this();
        }

        public C0187b E(long j10) {
            y();
            ((b) this.f12465m).U(j10);
            return this;
        }

        public C0187b F(int i10) {
            y();
            ((b) this.f12465m).V(i10);
            return this;
        }

        private C0187b() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        x.O(b.class, bVar);
    }

    private b() {
    }

    public static C0187b T() {
        return DEFAULT_INSTANCE.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i10;
    }

    @Override // com.google.protobuf.x
    protected final Object B(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8095a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0187b(aVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<b> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (b.class) {
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
