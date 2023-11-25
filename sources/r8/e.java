package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes3.dex */
final class e extends b0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f22353a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f22355a;

        /* renamed from: b  reason: collision with root package name */
        private String f22356b;

        @Override // r8.b0.c.a
        public b0.c a() {
            String str = "";
            if (this.f22355a == null) {
                str = " key";
            }
            if (this.f22356b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f22355a, this.f22356b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.c.a
        public b0.c.a b(String str) {
            if (str != null) {
                this.f22355a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // r8.b0.c.a
        public b0.c.a c(String str) {
            if (str != null) {
                this.f22356b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // r8.b0.c
    public String b() {
        return this.f22353a;
    }

    @Override // r8.b0.c
    public String c() {
        return this.f22354b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.c)) {
            return false;
        }
        b0.c cVar = (b0.c) obj;
        if (this.f22353a.equals(cVar.b()) && this.f22354b.equals(cVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22353a.hashCode() ^ 1000003) * 1000003) ^ this.f22354b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f22353a + ", value=" + this.f22354b + "}";
    }

    private e(String str, String str2) {
        this.f22353a = str;
        this.f22354b = str2;
    }
}
