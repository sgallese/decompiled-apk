package com.google.android.play.core.review;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class zza extends ReviewInfo {

    /* renamed from: f  reason: collision with root package name */
    private final PendingIntent f11135f;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11136m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f11135f = pendingIntent;
            this.f11136m = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.f11135f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.f11136m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f11135f.equals(reviewInfo.a()) && this.f11136m == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f11135f.hashCode() ^ 1000003) * 1000003;
        if (true != this.f11136m) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String obj = this.f11135f.toString();
        boolean z10 = this.f11136m;
        StringBuilder sb2 = new StringBuilder(obj.length() + 40);
        sb2.append("ReviewInfo{pendingIntent=");
        sb2.append(obj);
        sb2.append(", isNoOp=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
