package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* loaded from: classes3.dex */
public class v implements da.j {

    /* renamed from: a  reason: collision with root package name */
    private final long f12065a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12066b;

    /* renamed from: c  reason: collision with root package name */
    private final da.k f12067c;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f12068a;

        /* renamed from: b  reason: collision with root package name */
        private int f12069b;

        /* renamed from: c  reason: collision with root package name */
        private da.k f12070c;

        private b() {
        }

        public v a() {
            return new v(this.f12068a, this.f12069b, this.f12070c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(da.k kVar) {
            this.f12070c = kVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i10) {
            this.f12069b = i10;
            return this;
        }

        public b d(long j10) {
            this.f12068a = j10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b() {
        return new b();
    }

    @Override // da.j
    public int a() {
        return this.f12066b;
    }

    private v(long j10, int i10, da.k kVar) {
        this.f12065a = j10;
        this.f12066b = i10;
        this.f12067c = kVar;
    }
}
