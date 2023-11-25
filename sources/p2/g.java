package p2;

import p2.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f21029m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f21021e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f21021e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p2.f
    public void d(int i10) {
        if (this.f21026j) {
            return;
        }
        this.f21026j = true;
        this.f21023g = i10;
        for (d dVar : this.f21027k) {
            dVar.a(dVar);
        }
    }
}
