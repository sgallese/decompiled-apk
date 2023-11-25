package w8;

/* compiled from: Settings.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f25444a;

    /* renamed from: b  reason: collision with root package name */
    public final a f25445b;

    /* renamed from: c  reason: collision with root package name */
    public final long f25446c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25447d;

    /* renamed from: e  reason: collision with root package name */
    public final int f25448e;

    /* renamed from: f  reason: collision with root package name */
    public final double f25449f;

    /* renamed from: g  reason: collision with root package name */
    public final double f25450g;

    /* renamed from: h  reason: collision with root package name */
    public final int f25451h;

    /* compiled from: Settings.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f25452a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25453b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f25454c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f25452a = z10;
            this.f25453b = z11;
            this.f25454c = z12;
        }
    }

    /* compiled from: Settings.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f25455a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25456b;

        public b(int i10, int i11) {
            this.f25455a = i10;
            this.f25456b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f25446c = j10;
        this.f25444a = bVar;
        this.f25445b = aVar;
        this.f25447d = i10;
        this.f25448e = i11;
        this.f25449f = d10;
        this.f25450g = d11;
        this.f25451h = i12;
    }

    public boolean a(long j10) {
        if (this.f25446c < j10) {
            return true;
        }
        return false;
    }
}
