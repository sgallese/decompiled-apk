package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes3.dex */
final class v extends b0.e.AbstractC0518e {

    /* renamed from: a  reason: collision with root package name */
    private final int f22504a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22505b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22506c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22507d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.AbstractC0518e.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f22508a;

        /* renamed from: b  reason: collision with root package name */
        private String f22509b;

        /* renamed from: c  reason: collision with root package name */
        private String f22510c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f22511d;

        @Override // r8.b0.e.AbstractC0518e.a
        public b0.e.AbstractC0518e a() {
            String str = "";
            if (this.f22508a == null) {
                str = " platform";
            }
            if (this.f22509b == null) {
                str = str + " version";
            }
            if (this.f22510c == null) {
                str = str + " buildVersion";
            }
            if (this.f22511d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new v(this.f22508a.intValue(), this.f22509b, this.f22510c, this.f22511d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.AbstractC0518e.a
        public b0.e.AbstractC0518e.a b(String str) {
            if (str != null) {
                this.f22510c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // r8.b0.e.AbstractC0518e.a
        public b0.e.AbstractC0518e.a c(boolean z10) {
            this.f22511d = Boolean.valueOf(z10);
            return this;
        }

        @Override // r8.b0.e.AbstractC0518e.a
        public b0.e.AbstractC0518e.a d(int i10) {
            this.f22508a = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.AbstractC0518e.a
        public b0.e.AbstractC0518e.a e(String str) {
            if (str != null) {
                this.f22509b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // r8.b0.e.AbstractC0518e
    public String b() {
        return this.f22506c;
    }

    @Override // r8.b0.e.AbstractC0518e
    public int c() {
        return this.f22504a;
    }

    @Override // r8.b0.e.AbstractC0518e
    public String d() {
        return this.f22505b;
    }

    @Override // r8.b0.e.AbstractC0518e
    public boolean e() {
        return this.f22507d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.AbstractC0518e)) {
            return false;
        }
        b0.e.AbstractC0518e abstractC0518e = (b0.e.AbstractC0518e) obj;
        if (this.f22504a == abstractC0518e.c() && this.f22505b.equals(abstractC0518e.d()) && this.f22506c.equals(abstractC0518e.b()) && this.f22507d == abstractC0518e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((this.f22504a ^ 1000003) * 1000003) ^ this.f22505b.hashCode()) * 1000003) ^ this.f22506c.hashCode()) * 1000003;
        if (this.f22507d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f22504a + ", version=" + this.f22505b + ", buildVersion=" + this.f22506c + ", jailbroken=" + this.f22507d + "}";
    }

    private v(int i10, String str, String str2, boolean z10) {
        this.f22504a = i10;
        this.f22505b = str;
        this.f22506c = str2;
        this.f22507d = z10;
    }
}
