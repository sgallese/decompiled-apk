package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes3.dex */
final class d extends b0.a.AbstractC0503a {

    /* renamed from: a  reason: collision with root package name */
    private final String f22347a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22348b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22349c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.a.AbstractC0503a.AbstractC0504a {

        /* renamed from: a  reason: collision with root package name */
        private String f22350a;

        /* renamed from: b  reason: collision with root package name */
        private String f22351b;

        /* renamed from: c  reason: collision with root package name */
        private String f22352c;

        @Override // r8.b0.a.AbstractC0503a.AbstractC0504a
        public b0.a.AbstractC0503a a() {
            String str = "";
            if (this.f22350a == null) {
                str = " arch";
            }
            if (this.f22351b == null) {
                str = str + " libraryName";
            }
            if (this.f22352c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new d(this.f22350a, this.f22351b, this.f22352c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.a.AbstractC0503a.AbstractC0504a
        public b0.a.AbstractC0503a.AbstractC0504a b(String str) {
            if (str != null) {
                this.f22350a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // r8.b0.a.AbstractC0503a.AbstractC0504a
        public b0.a.AbstractC0503a.AbstractC0504a c(String str) {
            if (str != null) {
                this.f22352c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // r8.b0.a.AbstractC0503a.AbstractC0504a
        public b0.a.AbstractC0503a.AbstractC0504a d(String str) {
            if (str != null) {
                this.f22351b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // r8.b0.a.AbstractC0503a
    public String b() {
        return this.f22347a;
    }

    @Override // r8.b0.a.AbstractC0503a
    public String c() {
        return this.f22349c;
    }

    @Override // r8.b0.a.AbstractC0503a
    public String d() {
        return this.f22348b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a.AbstractC0503a)) {
            return false;
        }
        b0.a.AbstractC0503a abstractC0503a = (b0.a.AbstractC0503a) obj;
        if (this.f22347a.equals(abstractC0503a.b()) && this.f22348b.equals(abstractC0503a.d()) && this.f22349c.equals(abstractC0503a.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22347a.hashCode() ^ 1000003) * 1000003) ^ this.f22348b.hashCode()) * 1000003) ^ this.f22349c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f22347a + ", libraryName=" + this.f22348b + ", buildId=" + this.f22349c + "}";
    }

    private d(String str, String str2, String str3) {
        this.f22347a = str;
        this.f22348b = str2;
        this.f22349c = str3;
    }
}
