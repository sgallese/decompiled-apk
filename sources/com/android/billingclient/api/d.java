package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f9138a;

    /* renamed from: b  reason: collision with root package name */
    private String f9139b;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f9140a;

        /* renamed from: b  reason: collision with root package name */
        private String f9141b = "";

        /* synthetic */ a(x5.y yVar) {
        }

        public d a() {
            d dVar = new d();
            dVar.f9138a = this.f9140a;
            dVar.f9139b = this.f9141b;
            return dVar;
        }

        public a b(String str) {
            this.f9141b = str;
            return this;
        }

        public a c(int i10) {
            this.f9140a = i10;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f9139b;
    }

    public int b() {
        return this.f9138a;
    }

    public String toString() {
        return "Response Code: " + zzb.zzg(this.f9138a) + ", Debug Message: " + this.f9139b;
    }
}
