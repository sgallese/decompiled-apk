package c5;

/* compiled from: Dimension.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: Dimension.kt */
    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8840a;

        public a(int i10) {
            super(null);
            boolean z10;
            this.f8840a = i10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            throw new IllegalArgumentException("px must be > 0.".toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f8840a == ((a) obj).f8840a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8840a;
        }

        public String toString() {
            return String.valueOf(this.f8840a);
        }
    }

    /* compiled from: Dimension.kt */
    /* loaded from: classes.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8841a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    private c() {
    }

    public /* synthetic */ c(qc.h hVar) {
        this();
    }
}
