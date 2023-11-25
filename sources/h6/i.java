package h6;

import h6.o;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f16583a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f16584b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f16585a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f16586b;

        @Override // h6.o.a
        public o a() {
            return new i(this.f16585a, this.f16586b);
        }

        @Override // h6.o.a
        public o.a b(o.b bVar) {
            this.f16586b = bVar;
            return this;
        }

        @Override // h6.o.a
        public o.a c(o.c cVar) {
            this.f16585a = cVar;
            return this;
        }
    }

    @Override // h6.o
    public o.b b() {
        return this.f16584b;
    }

    @Override // h6.o
    public o.c c() {
        return this.f16583a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f16583a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f16584b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        o.c cVar = this.f16583a;
        int i10 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        o.b bVar = this.f16584b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16583a + ", mobileSubtype=" + this.f16584b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f16583a = cVar;
        this.f16584b = bVar;
    }
}
