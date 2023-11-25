package i6;

import i6.p;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f17058a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f17059b;

    /* renamed from: c  reason: collision with root package name */
    private final g6.d f17060c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes.dex */
    static final class b extends p.a {

        /* renamed from: a  reason: collision with root package name */
        private String f17061a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f17062b;

        /* renamed from: c  reason: collision with root package name */
        private g6.d f17063c;

        @Override // i6.p.a
        public p a() {
            String str = "";
            if (this.f17061a == null) {
                str = " backendName";
            }
            if (this.f17063c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f17061a, this.f17062b, this.f17063c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i6.p.a
        public p.a b(String str) {
            if (str != null) {
                this.f17061a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // i6.p.a
        public p.a c(byte[] bArr) {
            this.f17062b = bArr;
            return this;
        }

        @Override // i6.p.a
        public p.a d(g6.d dVar) {
            if (dVar != null) {
                this.f17063c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // i6.p
    public String b() {
        return this.f17058a;
    }

    @Override // i6.p
    public byte[] c() {
        return this.f17059b;
    }

    @Override // i6.p
    public g6.d d() {
        return this.f17060c;
    }

    public boolean equals(Object obj) {
        byte[] c10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f17058a.equals(pVar.b())) {
            byte[] bArr = this.f17059b;
            if (pVar instanceof d) {
                c10 = ((d) pVar).f17059b;
            } else {
                c10 = pVar.c();
            }
            if (Arrays.equals(bArr, c10) && this.f17060c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f17058a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17059b)) * 1000003) ^ this.f17060c.hashCode();
    }

    private d(String str, byte[] bArr, g6.d dVar) {
        this.f17058a = str;
        this.f17059b = bArr;
        this.f17060c = dVar;
    }
}
