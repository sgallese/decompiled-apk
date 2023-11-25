package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f11448a;

    /* renamed from: b  reason: collision with root package name */
    private final u8.f f11449b;

    public n(String str, u8.f fVar) {
        this.f11448a = str;
        this.f11449b = fVar;
    }

    private File b() {
        return this.f11449b.e(this.f11448a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            n8.f.f().e("Error creating marker: " + this.f11448a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
