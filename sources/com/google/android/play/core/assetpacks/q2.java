package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class q2 {

    /* renamed from: c  reason: collision with root package name */
    private static final x7.f f10952c = new x7.f("PackageStateCache");

    /* renamed from: a  reason: collision with root package name */
    private final Context f10953a;

    /* renamed from: b  reason: collision with root package name */
    private int f10954b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(Context context) {
        this.f10953a = context;
    }

    public final synchronized int a() {
        if (this.f10954b == -1) {
            try {
                this.f10954b = this.f10953a.getPackageManager().getPackageInfo(this.f10953a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f10952c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f10954b;
    }
}
