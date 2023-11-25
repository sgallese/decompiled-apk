package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import c8.o;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* compiled from: com.google.android.play:core@@1.10.3 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class c implements z7.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f11124a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f11125b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g gVar) {
        this.f11124a = gVar;
    }

    @Override // z7.a
    public final c8.d<Void> a(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return c8.f.c(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        o oVar = new o();
        intent.putExtra("result_receiver", new zzc(this, this.f11125b, oVar));
        activity.startActivity(intent);
        return oVar.a();
    }

    @Override // z7.a
    public final c8.d<ReviewInfo> b() {
        return this.f11124a.b();
    }
}
