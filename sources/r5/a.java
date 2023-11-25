package r5;

import qc.q;
import r5.c;
import r5.f;

/* compiled from: Plugin.kt */
/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: p  reason: collision with root package name */
    public p5.a f22147p;

    /* renamed from: f  reason: collision with root package name */
    private final f.b f22145f = f.b.Destination;

    /* renamed from: m  reason: collision with root package name */
    private final g f22146m = new g();

    /* renamed from: q  reason: collision with root package name */
    private boolean f22148q = true;

    @Override // r5.f
    public final q5.a a(q5.a aVar) {
        q.i(aVar, "event");
        return null;
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        c.a.e(this, aVar);
        this.f22146m.g(aVar);
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f22147p = aVar;
    }

    @Override // r5.c
    public q5.c d(q5.c cVar) {
        return c.a.b(this, cVar);
    }

    @Override // r5.c
    public q5.i e(q5.i iVar) {
        return c.a.d(this, iVar);
    }

    @Override // r5.c
    public q5.a f(q5.a aVar) {
        return c.a.f(this, aVar);
    }

    @Override // r5.c
    public void flush() {
        c.a.a(this);
    }

    @Override // r5.c
    public q5.e g(q5.e eVar) {
        return c.a.c(this, eVar);
    }

    @Override // r5.f
    public f.b getType() {
        return this.f22145f;
    }

    public final void h(f fVar) {
        q.i(fVar, "plugin");
        fVar.c(i());
        this.f22146m.a(fVar);
    }

    public p5.a i() {
        p5.a aVar = this.f22147p;
        if (aVar != null) {
            return aVar;
        }
        q.z("amplitude");
        return null;
    }

    public final q5.a j(q5.a aVar) {
        q5.a f10;
        if (!this.f22148q) {
            return null;
        }
        q5.a d10 = this.f22146m.d(f.b.Enrichment, this.f22146m.d(f.b.Before, aVar));
        if (d10 == null) {
            return null;
        }
        if (d10 instanceof q5.e) {
            f10 = g((q5.e) d10);
        } else if (d10 instanceof q5.c) {
            f10 = d((q5.c) d10);
        } else if (d10 instanceof q5.i) {
            f10 = e((q5.i) d10);
        } else {
            f10 = f(d10);
        }
        return f10;
    }
}
