package com.google.gson;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes3.dex */
public final class o extends l {

    /* renamed from: m  reason: collision with root package name */
    private static final Class<?>[] f12239m = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: f  reason: collision with root package name */
    private Object f12240f;

    public o(Boolean bool) {
        y(bool);
    }

    private static boolean u(o oVar) {
        Object obj = oVar.f12240f;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    private static boolean w(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f12239m) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.l
    public boolean a() {
        if (t()) {
            return r().booleanValue();
        }
        return Boolean.parseBoolean(l());
    }

    @Override // com.google.gson.l
    public double e() {
        if (v()) {
            return s().doubleValue();
        }
        return Double.parseDouble(l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f12240f == null) {
            if (oVar.f12240f == null) {
                return true;
            }
            return false;
        } else if (u(this) && u(oVar)) {
            if (s().longValue() == oVar.s().longValue()) {
                return true;
            }
            return false;
        } else {
            Object obj2 = this.f12240f;
            if ((obj2 instanceof Number) && (oVar.f12240f instanceof Number)) {
                double doubleValue = s().doubleValue();
                double doubleValue2 = oVar.s().doubleValue();
                if (doubleValue == doubleValue2) {
                    return true;
                }
                if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                    return true;
                }
                return false;
            }
            return obj2.equals(oVar.f12240f);
        }
    }

    @Override // com.google.gson.l
    public float f() {
        if (v()) {
            return s().floatValue();
        }
        return Float.parseFloat(l());
    }

    @Override // com.google.gson.l
    public int g() {
        if (v()) {
            return s().intValue();
        }
        return Integer.parseInt(l());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f12240f == null) {
            return 31;
        }
        if (u(this)) {
            doubleToLongBits = s().longValue();
        } else {
            Object obj = this.f12240f;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(s().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.l
    public long k() {
        if (v()) {
            return s().longValue();
        }
        return Long.parseLong(l());
    }

    @Override // com.google.gson.l
    public String l() {
        if (v()) {
            return s().toString();
        }
        if (t()) {
            return r().toString();
        }
        return (String) this.f12240f;
    }

    Boolean r() {
        return (Boolean) this.f12240f;
    }

    public Number s() {
        Object obj = this.f12240f;
        if (obj instanceof String) {
            return new ga.f((String) obj);
        }
        return (Number) obj;
    }

    public boolean t() {
        return this.f12240f instanceof Boolean;
    }

    public boolean v() {
        return this.f12240f instanceof Number;
    }

    public boolean x() {
        return this.f12240f instanceof String;
    }

    void y(Object obj) {
        boolean z10;
        if (obj instanceof Character) {
            this.f12240f = String.valueOf(((Character) obj).charValue());
            return;
        }
        if (!(obj instanceof Number) && !w(obj)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ga.a.a(z10);
        this.f12240f = obj;
    }

    public o(Number number) {
        y(number);
    }

    public o(String str) {
        y(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Object obj) {
        y(obj);
    }
}
