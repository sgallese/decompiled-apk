package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class l0 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f10880a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10881b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10882c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10883d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10884e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f10885f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.f10880a = str;
        this.f10881b = j10;
        this.f10882c = i10;
        this.f10883d = z10;
        this.f10884e = z11;
        this.f10885f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.g3
    public final int a() {
        return this.f10882c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.g3
    public final long b() {
        return this.f10881b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.g3
    public final String c() {
        return this.f10880a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.g3
    public final boolean d() {
        return this.f10884e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.g3
    public final boolean e() {
        return this.f10883d;
    }

    public final boolean equals(Object obj) {
        byte[] f10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g3) {
            g3 g3Var = (g3) obj;
            String str = this.f10880a;
            if (str != null ? str.equals(g3Var.c()) : g3Var.c() == null) {
                if (this.f10881b == g3Var.b() && this.f10882c == g3Var.a() && this.f10883d == g3Var.e() && this.f10884e == g3Var.d()) {
                    byte[] bArr = this.f10885f;
                    if (g3Var instanceof l0) {
                        f10 = ((l0) g3Var).f10885f;
                    } else {
                        f10 = g3Var.f();
                    }
                    if (Arrays.equals(bArr, f10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.g3
    public final byte[] f() {
        return this.f10885f;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        String str = this.f10880a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f10881b;
        int i11 = (((((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f10882c) * 1000003;
        int i12 = 1237;
        if (true != this.f10883d) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        int i13 = (i11 ^ i10) * 1000003;
        if (true == this.f10884e) {
            i12 = 1231;
        }
        return ((i13 ^ i12) * 1000003) ^ Arrays.hashCode(this.f10885f);
    }

    public final String toString() {
        String str = this.f10880a;
        long j10 = this.f10881b;
        int i10 = this.f10882c;
        boolean z10 = this.f10883d;
        boolean z11 = this.f10884e;
        String arrays = Arrays.toString(this.f10885f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i10);
        sb2.append(", isPartial=");
        sb2.append(z10);
        sb2.append(", isEndOfArchive=");
        sb2.append(z11);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
