package p2;

import java.util.Iterator;
import p2.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public class i extends m {
    public i(o2.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f21050h.f21027k.add(fVar);
        fVar.f21028l.add(this.f21050h);
    }

    @Override // p2.m, p2.d
    public void a(d dVar) {
        o2.a aVar = (o2.a) this.f21044b;
        int L0 = aVar.L0();
        Iterator<f> it = this.f21050h.f21028l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f21023g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (L0 != 0 && L0 != 2) {
            this.f21050h.d(i10 + aVar.M0());
        } else {
            this.f21050h.d(i11 + aVar.M0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void d() {
        o2.e eVar = this.f21044b;
        if (eVar instanceof o2.a) {
            this.f21050h.f21018b = true;
            o2.a aVar = (o2.a) eVar;
            int L0 = aVar.L0();
            boolean K0 = aVar.K0();
            int i10 = 0;
            if (L0 != 0) {
                if (L0 != 1) {
                    if (L0 != 2) {
                        if (L0 == 3) {
                            this.f21050h.f21021e = f.a.BOTTOM;
                            while (i10 < aVar.f20465x0) {
                                o2.e eVar2 = aVar.f20464w0[i10];
                                if (K0 || eVar2.O() != 8) {
                                    f fVar = eVar2.f20389f.f21051i;
                                    fVar.f21027k.add(this.f21050h);
                                    this.f21050h.f21028l.add(fVar);
                                }
                                i10++;
                            }
                            q(this.f21044b.f20389f.f21050h);
                            q(this.f21044b.f20389f.f21051i);
                            return;
                        }
                        return;
                    }
                    this.f21050h.f21021e = f.a.TOP;
                    while (i10 < aVar.f20465x0) {
                        o2.e eVar3 = aVar.f20464w0[i10];
                        if (K0 || eVar3.O() != 8) {
                            f fVar2 = eVar3.f20389f.f21050h;
                            fVar2.f21027k.add(this.f21050h);
                            this.f21050h.f21028l.add(fVar2);
                        }
                        i10++;
                    }
                    q(this.f21044b.f20389f.f21050h);
                    q(this.f21044b.f20389f.f21051i);
                    return;
                }
                this.f21050h.f21021e = f.a.RIGHT;
                while (i10 < aVar.f20465x0) {
                    o2.e eVar4 = aVar.f20464w0[i10];
                    if (K0 || eVar4.O() != 8) {
                        f fVar3 = eVar4.f20387e.f21051i;
                        fVar3.f21027k.add(this.f21050h);
                        this.f21050h.f21028l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f21044b.f20387e.f21050h);
                q(this.f21044b.f20387e.f21051i);
                return;
            }
            this.f21050h.f21021e = f.a.LEFT;
            while (i10 < aVar.f20465x0) {
                o2.e eVar5 = aVar.f20464w0[i10];
                if (K0 || eVar5.O() != 8) {
                    f fVar4 = eVar5.f20387e.f21050h;
                    fVar4.f21027k.add(this.f21050h);
                    this.f21050h.f21028l.add(fVar4);
                }
                i10++;
            }
            q(this.f21044b.f20387e.f21050h);
            q(this.f21044b.f20387e.f21051i);
        }
    }

    @Override // p2.m
    public void e() {
        o2.e eVar = this.f21044b;
        if (eVar instanceof o2.a) {
            int L0 = ((o2.a) eVar).L0();
            if (L0 != 0 && L0 != 1) {
                this.f21044b.G0(this.f21050h.f21023g);
            } else {
                this.f21044b.F0(this.f21050h.f21023g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void f() {
        this.f21045c = null;
        this.f21050h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public boolean m() {
        return false;
    }
}
