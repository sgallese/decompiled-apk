package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: GetTopicsRequest.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f6434a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6435b;

    /* compiled from: GetTopicsRequest.kt */
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0151a {

        /* renamed from: a  reason: collision with root package name */
        private String f6436a = "";

        /* renamed from: b  reason: collision with root package name */
        private boolean f6437b = true;

        public final a a() {
            boolean z10;
            if (this.f6436a.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new a(this.f6436a, this.f6437b);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final C0151a b(String str) {
            qc.q.i(str, "adsSdkName");
            this.f6436a = str;
            return this;
        }

        public final C0151a c(boolean z10) {
            this.f6437b = z10;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v0, types: [qc.h, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r3 = this;
            r0 = 0
            r1 = 3
            r2 = 0
            r3.<init>(r2, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.a.<init>():void");
    }

    public final String a() {
        return this.f6434a;
    }

    public final boolean b() {
        return this.f6435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (qc.q.d(this.f6434a, aVar.f6434a) && this.f6435b == aVar.f6435b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f6434a.hashCode() * 31) + t.k.a(this.f6435b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f6434a + ", shouldRecordObservation=" + this.f6435b;
    }

    public a(String str, boolean z10) {
        qc.q.i(str, "adsSdkName");
        this.f6434a = str;
        this.f6435b = z10;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
