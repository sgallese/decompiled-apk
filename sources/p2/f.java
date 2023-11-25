package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    m f21020d;

    /* renamed from: f  reason: collision with root package name */
    int f21022f;

    /* renamed from: g  reason: collision with root package name */
    public int f21023g;

    /* renamed from: a  reason: collision with root package name */
    public d f21017a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21018b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21019c = false;

    /* renamed from: e  reason: collision with root package name */
    a f21021e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    int f21024h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f21025i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f21026j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f21027k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f21028l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f21020d = mVar;
    }

    @Override // p2.d
    public void a(d dVar) {
        Iterator<f> it = this.f21028l.iterator();
        while (it.hasNext()) {
            if (!it.next().f21026j) {
                return;
            }
        }
        this.f21019c = true;
        d dVar2 = this.f21017a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f21018b) {
            this.f21020d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f21028l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f21026j) {
            g gVar = this.f21025i;
            if (gVar != null) {
                if (gVar.f21026j) {
                    this.f21022f = this.f21024h * gVar.f21023g;
                } else {
                    return;
                }
            }
            d(fVar.f21023g + this.f21022f);
        }
        d dVar3 = this.f21017a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f21027k.add(dVar);
        if (this.f21026j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f21028l.clear();
        this.f21027k.clear();
        this.f21026j = false;
        this.f21023g = 0;
        this.f21019c = false;
        this.f21018b = false;
    }

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

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21020d.f21044b.r());
        sb2.append(":");
        sb2.append(this.f21021e);
        sb2.append("(");
        if (this.f21026j) {
            obj = Integer.valueOf(this.f21023g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f21028l.size());
        sb2.append(":d=");
        sb2.append(this.f21027k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
