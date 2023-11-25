package v1;

/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public static final a f24515c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final w f24516d = new w();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24517a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24518b;

    /* compiled from: AndroidTextStyle.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final w a() {
            return w.f24516d;
        }
    }

    public /* synthetic */ w(int i10, boolean z10, qc.h hVar) {
        this(i10, z10);
    }

    public final int b() {
        return this.f24518b;
    }

    public final boolean c() {
        return this.f24517a;
    }

    public final w d(w wVar) {
        if (wVar == null) {
            return this;
        }
        return wVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f24517a == wVar.f24517a && g.f(this.f24518b, wVar.f24518b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (t.k.a(this.f24517a) * 31) + g.g(this.f24518b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f24517a + ", emojiSupportMatch=" + ((Object) g.h(this.f24518b)) + ')';
    }

    public w(boolean z10) {
        this.f24517a = z10;
        this.f24518b = g.f24444b.a();
    }

    private w(int i10, boolean z10) {
        this.f24517a = z10;
        this.f24518b = i10;
    }

    public w() {
        this(g.f24444b.a(), true, null);
    }
}
