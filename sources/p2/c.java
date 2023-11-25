package p2;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<m> f21006k;

    /* renamed from: l  reason: collision with root package name */
    private int f21007l;

    public c(o2.e eVar, int i10) {
        super(eVar);
        this.f21006k = new ArrayList<>();
        this.f21048f = i10;
        q();
    }

    private void q() {
        o2.e eVar;
        boolean z10;
        int L;
        o2.e eVar2 = this.f21044b;
        o2.e H = eVar2.H(this.f21048f);
        while (true) {
            o2.e eVar3 = H;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            H = eVar2.H(this.f21048f);
        }
        this.f21044b = eVar;
        this.f21006k.add(eVar.J(this.f21048f));
        o2.e F = eVar.F(this.f21048f);
        while (F != null) {
            this.f21006k.add(F.J(this.f21048f));
            F = F.F(this.f21048f);
        }
        Iterator<m> it = this.f21006k.iterator();
        while (it.hasNext()) {
            m next = it.next();
            int i10 = this.f21048f;
            if (i10 == 0) {
                next.f21044b.f20383c = this;
            } else if (i10 == 1) {
                next.f21044b.f20385d = this;
            }
        }
        if (this.f21048f == 0 && ((o2.f) this.f21044b.G()).a1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f21006k.size() > 1) {
            ArrayList<m> arrayList = this.f21006k;
            this.f21044b = arrayList.get(arrayList.size() - 1).f21044b;
        }
        if (this.f21048f == 0) {
            L = this.f21044b.x();
        } else {
            L = this.f21044b.L();
        }
        this.f21007l = L;
    }

    private o2.e r() {
        for (int i10 = 0; i10 < this.f21006k.size(); i10++) {
            m mVar = this.f21006k.get(i10);
            if (mVar.f21044b.O() != 8) {
                return mVar.f21044b;
            }
        }
        return null;
    }

    private o2.e s() {
        for (int size = this.f21006k.size() - 1; size >= 0; size--) {
            m mVar = this.f21006k.get(size);
            if (mVar.f21044b.O() != 8) {
                return mVar.f21044b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a6, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cc, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ce, code lost:
    
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d1, code lost:
    
        r9.f21047e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x041a, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // p2.m, p2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p2.d r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.a(p2.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void d() {
        Iterator<m> it = this.f21006k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f21006k.size();
        if (size < 1) {
            return;
        }
        o2.e eVar = this.f21006k.get(0).f21044b;
        o2.e eVar2 = this.f21006k.get(size - 1).f21044b;
        if (this.f21048f == 0) {
            o2.d dVar = eVar.B;
            o2.d dVar2 = eVar2.D;
            f i10 = i(dVar, 0);
            int c10 = dVar.c();
            o2.e r10 = r();
            if (r10 != null) {
                c10 = r10.B.c();
            }
            if (i10 != null) {
                b(this.f21050h, i10, c10);
            }
            f i11 = i(dVar2, 0);
            int c11 = dVar2.c();
            o2.e s10 = s();
            if (s10 != null) {
                c11 = s10.D.c();
            }
            if (i11 != null) {
                b(this.f21051i, i11, -c11);
            }
        } else {
            o2.d dVar3 = eVar.C;
            o2.d dVar4 = eVar2.E;
            f i12 = i(dVar3, 1);
            int c12 = dVar3.c();
            o2.e r11 = r();
            if (r11 != null) {
                c12 = r11.C.c();
            }
            if (i12 != null) {
                b(this.f21050h, i12, c12);
            }
            f i13 = i(dVar4, 1);
            int c13 = dVar4.c();
            o2.e s11 = s();
            if (s11 != null) {
                c13 = s11.E.c();
            }
            if (i13 != null) {
                b(this.f21051i, i13, -c13);
            }
        }
        this.f21050h.f21017a = this;
        this.f21051i.f21017a = this;
    }

    @Override // p2.m
    public void e() {
        for (int i10 = 0; i10 < this.f21006k.size(); i10++) {
            this.f21006k.get(i10).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void f() {
        this.f21045c = null;
        Iterator<m> it = this.f21006k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // p2.m
    public long j() {
        int size = this.f21006k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f21050h.f21022f + this.f21006k.get(i10).j() + r4.f21051i.f21022f;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public boolean m() {
        int size = this.f21006k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f21006k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        if (this.f21048f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        Iterator<m> it = this.f21006k.iterator();
        while (it.hasNext()) {
            String str2 = sb3 + "<";
            sb3 = (str2 + it.next()) + "> ";
        }
        return sb3;
    }
}
