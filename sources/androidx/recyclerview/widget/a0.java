package androidx.recyclerview.widget;

/* compiled from: StableIdStorage.java */
/* loaded from: classes.dex */
interface a0 {

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public static class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        long f6673a = 0;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0154a implements d {

            /* renamed from: a  reason: collision with root package name */
            private final androidx.collection.e<Long> f6674a = new androidx.collection.e<>();

            C0154a() {
            }

            @Override // androidx.recyclerview.widget.a0.d
            public long a(long j10) {
                Long f10 = this.f6674a.f(j10);
                if (f10 == null) {
                    f10 = Long.valueOf(a.this.b());
                    this.f6674a.k(j10, f10);
                }
                return f10.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.a0
        public d a() {
            return new C0154a();
        }

        long b() {
            long j10 = this.f6673a;
            this.f6673a = 1 + j10;
            return j10;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public static class b implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private final d f6676a = new a();

        /* compiled from: StableIdStorage.java */
        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.a0.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.a0
        public d a() {
            return this.f6676a;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j10);
    }

    d a();

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public static class c implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private final d f6678a = new a();

        @Override // androidx.recyclerview.widget.a0
        public d a() {
            return this.f6678a;
        }

        /* compiled from: StableIdStorage.java */
        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.a0.d
            public long a(long j10) {
                return j10;
            }
        }
    }
}
