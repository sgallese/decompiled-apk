package com.google.protobuf;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: e  reason: collision with root package name */
    private static final o f12267e = o.b();

    /* renamed from: a  reason: collision with root package name */
    private h f12268a;

    /* renamed from: b  reason: collision with root package name */
    private o f12269b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile q0 f12270c;

    /* renamed from: d  reason: collision with root package name */
    private volatile h f12271d;

    protected void a(q0 q0Var) {
        if (this.f12270c != null) {
            return;
        }
        synchronized (this) {
            if (this.f12270c != null) {
                return;
            }
            try {
                if (this.f12268a != null) {
                    this.f12270c = q0Var.o().a(this.f12268a, this.f12269b);
                    this.f12271d = this.f12268a;
                } else {
                    this.f12270c = q0Var;
                    this.f12271d = h.f12293m;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f12270c = q0Var;
                this.f12271d = h.f12293m;
            }
        }
    }

    public int b() {
        if (this.f12271d != null) {
            return this.f12271d.size();
        }
        h hVar = this.f12268a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f12270c != null) {
            return this.f12270c.k();
        }
        return 0;
    }

    public q0 c(q0 q0Var) {
        a(q0Var);
        return this.f12270c;
    }

    public q0 d(q0 q0Var) {
        q0 q0Var2 = this.f12270c;
        this.f12268a = null;
        this.f12271d = null;
        this.f12270c = q0Var;
        return q0Var2;
    }

    public h e() {
        if (this.f12271d != null) {
            return this.f12271d;
        }
        h hVar = this.f12268a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f12271d != null) {
                return this.f12271d;
            }
            if (this.f12270c == null) {
                this.f12271d = h.f12293m;
            } else {
                this.f12271d = this.f12270c.h();
            }
            return this.f12271d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        q0 q0Var = this.f12270c;
        q0 q0Var2 = d0Var.f12270c;
        if (q0Var == null && q0Var2 == null) {
            return e().equals(d0Var.e());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.c(q0Var.c()));
        }
        return c(q0Var2.c()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
