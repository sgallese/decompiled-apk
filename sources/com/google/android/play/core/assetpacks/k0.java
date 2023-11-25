package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class k0 extends z2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f10860a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10861b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10862c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10863d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10864e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(int i10, String str, long j10, long j11, int i11) {
        this.f10860a = i10;
        this.f10861b = str;
        this.f10862c = j10;
        this.f10863d = j11;
        this.f10864e = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.z2
    public final int a() {
        return this.f10860a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.z2
    public final int b() {
        return this.f10864e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.z2
    public final long c() {
        return this.f10862c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.z2
    public final long d() {
        return this.f10863d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.z2
    public final String e() {
        return this.f10861b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (this.f10860a == z2Var.a() && ((str = this.f10861b) != null ? str.equals(z2Var.e()) : z2Var.e() == null) && this.f10862c == z2Var.c() && this.f10863d == z2Var.d() && this.f10864e == z2Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (this.f10860a ^ 1000003) * 1000003;
        String str = this.f10861b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f10862c;
        long j11 = this.f10863d;
        return ((((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10864e;
    }

    public final String toString() {
        int i10 = this.f10860a;
        String str = this.f10861b;
        long j10 = this.f10862c;
        long j11 = this.f10863d;
        int i11 = this.f10864e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i10);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j10);
        sb2.append(", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
