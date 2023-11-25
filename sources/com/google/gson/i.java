package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes3.dex */
public final class i extends l implements Iterable<l> {

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f12121f = new ArrayList();

    @Override // com.google.gson.l
    public boolean a() {
        if (this.f12121f.size() == 1) {
            return this.f12121f.get(0).a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public double e() {
        if (this.f12121f.size() == 1) {
            return this.f12121f.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof i) || !((i) obj).f12121f.equals(this.f12121f))) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.l
    public float f() {
        if (this.f12121f.size() == 1) {
            return this.f12121f.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public int g() {
        if (this.f12121f.size() == 1) {
            return this.f12121f.get(0).g();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f12121f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f12121f.iterator();
    }

    @Override // com.google.gson.l
    public long k() {
        if (this.f12121f.size() == 1) {
            return this.f12121f.get(0).k();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public String l() {
        if (this.f12121f.size() == 1) {
            return this.f12121f.get(0).l();
        }
        throw new IllegalStateException();
    }

    public void r(l lVar) {
        if (lVar == null) {
            lVar = m.f12237f;
        }
        this.f12121f.add(lVar);
    }

    public void s(String str) {
        l oVar;
        List<l> list = this.f12121f;
        if (str == null) {
            oVar = m.f12237f;
        } else {
            oVar = new o(str);
        }
        list.add(oVar);
    }

    public int size() {
        return this.f12121f.size();
    }

    public l t(int i10) {
        return this.f12121f.get(i10);
    }
}
