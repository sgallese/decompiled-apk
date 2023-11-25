package j2;

/* compiled from: IntRect.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18995e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final n f18996f = new n(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f18997a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18998b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18999c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19000d;

    /* compiled from: IntRect.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public n(int i10, int i11, int i12, int i13) {
        this.f18997a = i10;
        this.f18998b = i11;
        this.f18999c = i12;
        this.f19000d = i13;
    }

    public final int a() {
        return this.f19000d - this.f18998b;
    }

    public final int b() {
        return this.f18997a;
    }

    public final int c() {
        return this.f18998b;
    }

    public final int d() {
        return this.f18999c - this.f18997a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f18997a == nVar.f18997a && this.f18998b == nVar.f18998b && this.f18999c == nVar.f18999c && this.f19000d == nVar.f19000d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f18997a * 31) + this.f18998b) * 31) + this.f18999c) * 31) + this.f19000d;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f18997a + ", " + this.f18998b + ", " + this.f18999c + ", " + this.f19000d + ')';
    }
}
