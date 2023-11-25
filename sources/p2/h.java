package p2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class h extends m {
    public h(o2.e eVar) {
        super(eVar);
        eVar.f20387e.f();
        eVar.f20389f.f();
        this.f21048f = ((o2.h) eVar).K0();
    }

    private void q(f fVar) {
        this.f21050h.f21027k.add(fVar);
        fVar.f21028l.add(this.f21050h);
    }

    @Override // p2.m, p2.d
    public void a(d dVar) {
        f fVar = this.f21050h;
        if (!fVar.f21019c || fVar.f21026j) {
            return;
        }
        this.f21050h.d((int) ((fVar.f21028l.get(0).f21023g * ((o2.h) this.f21044b).N0()) + 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void d() {
        o2.h hVar = (o2.h) this.f21044b;
        int L0 = hVar.L0();
        int M0 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            if (L0 != -1) {
                this.f21050h.f21028l.add(this.f21044b.N.f20387e.f21050h);
                this.f21044b.N.f20387e.f21050h.f21027k.add(this.f21050h);
                this.f21050h.f21022f = L0;
            } else if (M0 != -1) {
                this.f21050h.f21028l.add(this.f21044b.N.f20387e.f21051i);
                this.f21044b.N.f20387e.f21051i.f21027k.add(this.f21050h);
                this.f21050h.f21022f = -M0;
            } else {
                f fVar = this.f21050h;
                fVar.f21018b = true;
                fVar.f21028l.add(this.f21044b.N.f20387e.f21051i);
                this.f21044b.N.f20387e.f21051i.f21027k.add(this.f21050h);
            }
            q(this.f21044b.f20387e.f21050h);
            q(this.f21044b.f20387e.f21051i);
            return;
        }
        if (L0 != -1) {
            this.f21050h.f21028l.add(this.f21044b.N.f20389f.f21050h);
            this.f21044b.N.f20389f.f21050h.f21027k.add(this.f21050h);
            this.f21050h.f21022f = L0;
        } else if (M0 != -1) {
            this.f21050h.f21028l.add(this.f21044b.N.f20389f.f21051i);
            this.f21044b.N.f20389f.f21051i.f21027k.add(this.f21050h);
            this.f21050h.f21022f = -M0;
        } else {
            f fVar2 = this.f21050h;
            fVar2.f21018b = true;
            fVar2.f21028l.add(this.f21044b.N.f20389f.f21051i);
            this.f21044b.N.f20389f.f21051i.f21027k.add(this.f21050h);
        }
        q(this.f21044b.f20389f.f21050h);
        q(this.f21044b.f20389f.f21051i);
    }

    @Override // p2.m
    public void e() {
        if (((o2.h) this.f21044b).K0() == 1) {
            this.f21044b.F0(this.f21050h.f21023g);
        } else {
            this.f21044b.G0(this.f21050h.f21023g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void f() {
        this.f21050h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public boolean m() {
        return false;
    }
}
