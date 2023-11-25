package b1;

/* compiled from: Adaptation.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static final d f7627b = new d(null);

    /* renamed from: c  reason: collision with root package name */
    private static final a f7628c = new C0175a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d  reason: collision with root package name */
    private static final a f7629d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e  reason: collision with root package name */
    private static final a f7630e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a  reason: collision with root package name */
    private final float[] f7631a;

    /* compiled from: Adaptation.kt */
    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0175a extends a {
        C0175a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* compiled from: Adaptation.kt */
    /* loaded from: classes.dex */
    public static final class b extends a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* compiled from: Adaptation.kt */
    /* loaded from: classes.dex */
    public static final class c extends a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* compiled from: Adaptation.kt */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(qc.h hVar) {
            this();
        }

        public final a a() {
            return a.f7628c;
        }
    }

    public /* synthetic */ a(float[] fArr, qc.h hVar) {
        this(fArr);
    }

    public final float[] b() {
        return this.f7631a;
    }

    private a(float[] fArr) {
        this.f7631a = fArr;
    }
}
