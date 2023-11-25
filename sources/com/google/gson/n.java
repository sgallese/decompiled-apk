package com.google.gson;

import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* loaded from: classes3.dex */
public final class n extends l {

    /* renamed from: f  reason: collision with root package name */
    private final ga.g<String, l> f12238f = new ga.g<>();

    private l v(Object obj) {
        if (obj == null) {
            return m.f12237f;
        }
        return new o(obj);
    }

    public n A(String str) {
        return (n) this.f12238f.get(str);
    }

    public o C(String str) {
        return (o) this.f12238f.get(str);
    }

    public boolean D(String str) {
        return this.f12238f.containsKey(str);
    }

    public Set<String> E() {
        return this.f12238f.keySet();
    }

    public l F(String str) {
        return this.f12238f.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof n) || !((n) obj).f12238f.equals(this.f12238f))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12238f.hashCode();
    }

    public void r(String str, l lVar) {
        if (lVar == null) {
            lVar = m.f12237f;
        }
        this.f12238f.put(str, lVar);
    }

    public void s(String str, Boolean bool) {
        r(str, v(bool));
    }

    public void t(String str, Number number) {
        r(str, v(number));
    }

    public void u(String str, String str2) {
        r(str, v(str2));
    }

    public Set<Map.Entry<String, l>> w() {
        return this.f12238f.entrySet();
    }

    public l x(String str) {
        return this.f12238f.get(str);
    }

    public i y(String str) {
        return (i) this.f12238f.get(str);
    }
}
