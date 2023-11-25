package i6;

import i6.i;
import java.util.Map;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f17036a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f17037b;

    /* renamed from: c  reason: collision with root package name */
    private final h f17038c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17039d;

    /* renamed from: e  reason: collision with root package name */
    private final long f17040e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f17041f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: i6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0401b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f17042a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f17043b;

        /* renamed from: c  reason: collision with root package name */
        private h f17044c;

        /* renamed from: d  reason: collision with root package name */
        private Long f17045d;

        /* renamed from: e  reason: collision with root package name */
        private Long f17046e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f17047f;

        @Override // i6.i.a
        public i d() {
            String str = "";
            if (this.f17042a == null) {
                str = " transportName";
            }
            if (this.f17044c == null) {
                str = str + " encodedPayload";
            }
            if (this.f17045d == null) {
                str = str + " eventMillis";
            }
            if (this.f17046e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f17047f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f17042a, this.f17043b, this.f17044c, this.f17045d.longValue(), this.f17046e.longValue(), this.f17047f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i6.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f17047f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // i6.i.a
        public i.a f(Map<String, String> map) {
            if (map != null) {
                this.f17047f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // i6.i.a
        public i.a g(Integer num) {
            this.f17043b = num;
            return this;
        }

        @Override // i6.i.a
        public i.a h(h hVar) {
            if (hVar != null) {
                this.f17044c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // i6.i.a
        public i.a i(long j10) {
            this.f17045d = Long.valueOf(j10);
            return this;
        }

        @Override // i6.i.a
        public i.a j(String str) {
            if (str != null) {
                this.f17042a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // i6.i.a
        public i.a k(long j10) {
            this.f17046e = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i6.i
    public Map<String, String> c() {
        return this.f17041f;
    }

    @Override // i6.i
    public Integer d() {
        return this.f17037b;
    }

    @Override // i6.i
    public h e() {
        return this.f17038c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f17036a.equals(iVar.j()) && ((num = this.f17037b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f17038c.equals(iVar.e()) && this.f17039d == iVar.f() && this.f17040e == iVar.k() && this.f17041f.equals(iVar.c())) {
            return true;
        }
        return false;
    }

    @Override // i6.i
    public long f() {
        return this.f17039d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f17036a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f17037b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f17038c.hashCode()) * 1000003;
        long j10 = this.f17039d;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f17040e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f17041f.hashCode();
    }

    @Override // i6.i
    public String j() {
        return this.f17036a;
    }

    @Override // i6.i
    public long k() {
        return this.f17040e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f17036a + ", code=" + this.f17037b + ", encodedPayload=" + this.f17038c + ", eventMillis=" + this.f17039d + ", uptimeMillis=" + this.f17040e + ", autoMetadata=" + this.f17041f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f17036a = str;
        this.f17037b = num;
        this.f17038c = hVar;
        this.f17039d = j10;
        this.f17040e = j11;
        this.f17041f = map;
    }
}
