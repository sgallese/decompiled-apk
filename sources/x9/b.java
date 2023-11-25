package x9;

import ba.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebasePerfGaugeMetricValidator.java */
/* loaded from: classes3.dex */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final g f25880a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar) {
        this.f25880a = gVar;
    }

    @Override // x9.e
    public boolean c() {
        if (this.f25880a.e0() && (this.f25880a.a0() > 0 || this.f25880a.Z() > 0 || (this.f25880a.d0() && this.f25880a.c0().V()))) {
            return true;
        }
        return false;
    }
}
