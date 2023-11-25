package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes3.dex */
final class f extends b0.d {

    /* renamed from: a  reason: collision with root package name */
    private final c0<b0.d.b> f22357a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22358b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.d.a {

        /* renamed from: a  reason: collision with root package name */
        private c0<b0.d.b> f22359a;

        /* renamed from: b  reason: collision with root package name */
        private String f22360b;

        @Override // r8.b0.d.a
        public b0.d a() {
            String str = "";
            if (this.f22359a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new f(this.f22359a, this.f22360b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.d.a
        public b0.d.a b(c0<b0.d.b> c0Var) {
            if (c0Var != null) {
                this.f22359a = c0Var;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // r8.b0.d.a
        public b0.d.a c(String str) {
            this.f22360b = str;
            return this;
        }
    }

    @Override // r8.b0.d
    public c0<b0.d.b> b() {
        return this.f22357a;
    }

    @Override // r8.b0.d
    public String c() {
        return this.f22358b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d)) {
            return false;
        }
        b0.d dVar = (b0.d) obj;
        if (this.f22357a.equals(dVar.b())) {
            String str = this.f22358b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f22357a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22358b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f22357a + ", orgId=" + this.f22358b + "}";
    }

    private f(c0<b0.d.b> c0Var, String str) {
        this.f22357a = c0Var;
        this.f22358b = str;
    }
}
