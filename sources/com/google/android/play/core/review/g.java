package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import c8.o;
import x7.m;
import x7.r;
import x7.v;

/* compiled from: com.google.android.play:core@@1.10.3 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final x7.f f11132c = new x7.f("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    r f11133a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11134b;

    public g(Context context) {
        this.f11134b = context.getPackageName();
        if (v.b(context)) {
            this.f11133a = new r(context, f11132c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new m() { // from class: z7.b
                @Override // x7.m
                public final Object zza(IBinder iBinder) {
                    return x7.b.K(iBinder);
                }
            }, null);
        }
    }

    public final c8.d b() {
        x7.f fVar = f11132c;
        fVar.d("requestInAppReview (%s)", this.f11134b);
        if (this.f11133a == null) {
            fVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return c8.f.b(new ReviewException(-1));
        }
        o oVar = new o();
        this.f11133a.q(new d(this, oVar, oVar), oVar);
        return oVar.a();
    }
}
