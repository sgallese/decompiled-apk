package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes3.dex */
public class w implements da.l {

    /* renamed from: a  reason: collision with root package name */
    private final String f12071a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12072b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(String str, int i10) {
        this.f12071a = str;
        this.f12072b = i10;
    }

    private String f() {
        return d().trim();
    }

    private void g() {
        if (this.f12071a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // da.l
    public long a() {
        if (this.f12072b == 0) {
            return 0L;
        }
        String f10 = f();
        try {
            return Long.valueOf(f10).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "long"), e10);
        }
    }

    @Override // da.l
    public int b() {
        return this.f12072b;
    }

    @Override // da.l
    public double c() {
        if (this.f12072b == 0) {
            return 0.0d;
        }
        String f10 = f();
        try {
            return Double.valueOf(f10).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "double"), e10);
        }
    }

    @Override // da.l
    public String d() {
        if (this.f12072b == 0) {
            return "";
        }
        g();
        return this.f12071a;
    }

    @Override // da.l
    public boolean e() throws IllegalArgumentException {
        if (this.f12072b == 0) {
            return false;
        }
        String f10 = f();
        if (o.f12015f.matcher(f10).matches()) {
            return true;
        }
        if (o.f12016g.matcher(f10).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "boolean"));
    }
}
