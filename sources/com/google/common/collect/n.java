package com.google.common.collect;

import com.google.common.collect.o;
import e8.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MapMaker.java */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    boolean f11164a;

    /* renamed from: b  reason: collision with root package name */
    int f11165b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f11166c = -1;

    /* renamed from: d  reason: collision with root package name */
    o.n f11167d;

    /* renamed from: e  reason: collision with root package name */
    o.n f11168e;

    /* renamed from: f  reason: collision with root package name */
    e8.b<Object> f11169f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int i10 = this.f11166c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        int i10 = this.f11165b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8.b<Object> c() {
        return (e8.b) e8.e.a(this.f11169f, d().defaultEquivalence());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o.n d() {
        return (o.n) e8.e.a(this.f11167d, o.n.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o.n e() {
        return (o.n) e8.e.a(this.f11168e, o.n.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        if (!this.f11164a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        return o.b(this);
    }

    n g(o.n nVar) {
        boolean z10;
        o.n nVar2 = this.f11167d;
        if (nVar2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e8.h.l(z10, "Key strength was already set to %s", nVar2);
        this.f11167d = (o.n) e8.h.g(nVar);
        if (nVar != o.n.STRONG) {
            this.f11164a = true;
        }
        return this;
    }

    public n h() {
        return g(o.n.WEAK);
    }

    public String toString() {
        e.b b10 = e8.e.b(this);
        int i10 = this.f11165b;
        if (i10 != -1) {
            b10.a("initialCapacity", i10);
        }
        int i11 = this.f11166c;
        if (i11 != -1) {
            b10.a("concurrencyLevel", i11);
        }
        o.n nVar = this.f11167d;
        if (nVar != null) {
            b10.b("keyStrength", e8.a.b(nVar.toString()));
        }
        o.n nVar2 = this.f11168e;
        if (nVar2 != null) {
            b10.b("valueStrength", e8.a.b(nVar2.toString()));
        }
        if (this.f11169f != null) {
            b10.h("keyEquivalence");
        }
        return b10.toString();
    }
}
