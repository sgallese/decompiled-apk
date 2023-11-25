package c4;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c4.l;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class p extends l {
    int X;
    private ArrayList<l> V = new ArrayList<>();
    private boolean W = true;
    boolean Y = false;
    private int Z = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f8824a;

        a(l lVar) {
            this.f8824a = lVar;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            this.f8824a.U();
            lVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        p f8826a;

        b(p pVar) {
            this.f8826a = pVar;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            p pVar = this.f8826a;
            int i10 = pVar.X - 1;
            pVar.X = i10;
            if (i10 == 0) {
                pVar.Y = false;
                pVar.p();
            }
            lVar.Q(this);
        }

        @Override // c4.m, c4.l.f
        public void c(l lVar) {
            p pVar = this.f8826a;
            if (!pVar.Y) {
                pVar.b0();
                this.f8826a.Y = true;
            }
        }
    }

    private void g0(l lVar) {
        this.V.add(lVar);
        lVar.E = this;
    }

    private void p0() {
        b bVar = new b(this);
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.X = this.V.size();
    }

    @Override // c4.l
    public void O(View view) {
        super.O(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).O(view);
        }
    }

    @Override // c4.l
    public void S(View view) {
        super.S(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).S(view);
        }
    }

    @Override // c4.l
    protected void U() {
        if (this.V.isEmpty()) {
            b0();
            p();
            return;
        }
        p0();
        if (!this.W) {
            for (int i10 = 1; i10 < this.V.size(); i10++) {
                this.V.get(i10 - 1).a(new a(this.V.get(i10)));
            }
            l lVar = this.V.get(0);
            if (lVar != null) {
                lVar.U();
                return;
            }
            return;
        }
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            it.next().U();
        }
    }

    @Override // c4.l
    public void W(l.e eVar) {
        super.W(eVar);
        this.Z |= 8;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).W(eVar);
        }
    }

    @Override // c4.l
    public void Y(g gVar) {
        super.Y(gVar);
        this.Z |= 4;
        if (this.V != null) {
            for (int i10 = 0; i10 < this.V.size(); i10++) {
                this.V.get(i10).Y(gVar);
            }
        }
    }

    @Override // c4.l
    public void Z(o oVar) {
        super.Z(oVar);
        this.Z |= 2;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).Z(oVar);
        }
    }

    @Override // c4.l
    String c0(String str) {
        String c02 = super.c0(str);
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c02);
            sb2.append("\n");
            sb2.append(this.V.get(i10).c0(str + "  "));
            c02 = sb2.toString();
        }
        return c02;
    }

    @Override // c4.l
    protected void cancel() {
        super.cancel();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).cancel();
        }
    }

    @Override // c4.l
    /* renamed from: d0  reason: merged with bridge method [inline-methods] */
    public p a(l.f fVar) {
        return (p) super.a(fVar);
    }

    @Override // c4.l
    /* renamed from: e0  reason: merged with bridge method [inline-methods] */
    public p b(View view) {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            this.V.get(i10).b(view);
        }
        return (p) super.b(view);
    }

    @Override // c4.l
    public void f(s sVar) {
        if (H(sVar.f8831b)) {
            Iterator<l> it = this.V.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.H(sVar.f8831b)) {
                    next.f(sVar);
                    sVar.f8832c.add(next);
                }
            }
        }
    }

    public p f0(l lVar) {
        g0(lVar);
        long j10 = this.f8777p;
        if (j10 >= 0) {
            lVar.V(j10);
        }
        if ((this.Z & 1) != 0) {
            lVar.X(s());
        }
        if ((this.Z & 2) != 0) {
            w();
            lVar.Z(null);
        }
        if ((this.Z & 4) != 0) {
            lVar.Y(v());
        }
        if ((this.Z & 8) != 0) {
            lVar.W(r());
        }
        return this;
    }

    @Override // c4.l
    void h(s sVar) {
        super.h(sVar);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).h(sVar);
        }
    }

    public l h0(int i10) {
        if (i10 >= 0 && i10 < this.V.size()) {
            return this.V.get(i10);
        }
        return null;
    }

    @Override // c4.l
    public void i(s sVar) {
        if (H(sVar.f8831b)) {
            Iterator<l> it = this.V.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.H(sVar.f8831b)) {
                    next.i(sVar);
                    sVar.f8832c.add(next);
                }
            }
        }
    }

    public int i0() {
        return this.V.size();
    }

    @Override // c4.l
    /* renamed from: j0  reason: merged with bridge method [inline-methods] */
    public p Q(l.f fVar) {
        return (p) super.Q(fVar);
    }

    @Override // c4.l
    /* renamed from: k0  reason: merged with bridge method [inline-methods] */
    public p R(View view) {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            this.V.get(i10).R(view);
        }
        return (p) super.R(view);
    }

    @Override // c4.l
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.V = new ArrayList<>();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.g0(this.V.get(i10).clone());
        }
        return pVar;
    }

    @Override // c4.l
    /* renamed from: l0  reason: merged with bridge method [inline-methods] */
    public p V(long j10) {
        ArrayList<l> arrayList;
        super.V(j10);
        if (this.f8777p >= 0 && (arrayList = this.V) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.V.get(i10).V(j10);
            }
        }
        return this;
    }

    @Override // c4.l
    /* renamed from: m0  reason: merged with bridge method [inline-methods] */
    public p X(TimeInterpolator timeInterpolator) {
        this.Z |= 1;
        ArrayList<l> arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.V.get(i10).X(timeInterpolator);
            }
        }
        return (p) super.X(timeInterpolator);
    }

    public p n0(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.W = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
        } else {
            this.W = true;
        }
        return this;
    }

    @Override // c4.l
    protected void o(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long z10 = z();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = this.V.get(i10);
            if (z10 > 0 && (this.W || i10 == 0)) {
                long z11 = lVar.z();
                if (z11 > 0) {
                    lVar.a0(z11 + z10);
                } else {
                    lVar.a0(z10);
                }
            }
            lVar.o(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // c4.l
    /* renamed from: o0  reason: merged with bridge method [inline-methods] */
    public p a0(long j10) {
        return (p) super.a0(j10);
    }
}
