package da;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final long f13156a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13157b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f13158a = 60;

        /* renamed from: b  reason: collision with root package name */
        private long f13159b = com.google.firebase.remoteconfig.internal.m.f11996j;

        public k c() {
            return new k(this);
        }

        public b d(long j10) throws IllegalArgumentException {
            if (j10 >= 0) {
                this.f13158a = j10;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f13159b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f13156a;
    }

    public long b() {
        return this.f13157b;
    }

    private k(b bVar) {
        this.f13156a = bVar.f13158a;
        this.f13157b = bVar.f13159b;
    }
}
