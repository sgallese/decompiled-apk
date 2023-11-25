package h6;

import h6.k;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f16550a;

    /* renamed from: b  reason: collision with root package name */
    private final h6.a f16551b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* loaded from: classes.dex */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f16552a;

        /* renamed from: b  reason: collision with root package name */
        private h6.a f16553b;

        @Override // h6.k.a
        public k a() {
            return new e(this.f16552a, this.f16553b);
        }

        @Override // h6.k.a
        public k.a b(h6.a aVar) {
            this.f16553b = aVar;
            return this;
        }

        @Override // h6.k.a
        public k.a c(k.b bVar) {
            this.f16552a = bVar;
            return this;
        }
    }

    @Override // h6.k
    public h6.a b() {
        return this.f16551b;
    }

    @Override // h6.k
    public k.b c() {
        return this.f16550a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f16550a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            h6.a aVar = this.f16551b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        k.b bVar = this.f16550a;
        int i10 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        h6.a aVar = this.f16551b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f16550a + ", androidClientInfo=" + this.f16551b + "}";
    }

    private e(k.b bVar, h6.a aVar) {
        this.f16550a = bVar;
        this.f16551b = aVar;
    }
}
