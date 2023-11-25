package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BatteryState.java */
/* loaded from: classes3.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final Float f11350a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11351b;

    private d(Float f10, boolean z10) {
        this.f11351b = z10;
        this.f11350a = f10;
    }

    public static d a(Context context) {
        boolean z10 = false;
        Float f10 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z10 = e(registerReceiver);
                f10 = d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            n8.f.f().e("An error occurred getting battery state.", e10);
        }
        return new d(f10, z10);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public Float b() {
        return this.f11350a;
    }

    public int c() {
        Float f10;
        if (this.f11351b && (f10 = this.f11350a) != null) {
            if (f10.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
