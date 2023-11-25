package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import r8.b0;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes3.dex */
class f implements z {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11355a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11356b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11357c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str, String str2, byte[] bArr) {
        this.f11356b = str;
        this.f11357c = str2;
        this.f11355a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f11355a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f11355a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.common.z
    public String a() {
        return this.f11357c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.z
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f11355a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.z
    public b0.d.b c() {
        byte[] d10 = d();
        if (d10 == null) {
            return null;
        }
        return b0.d.b.a().b(d10).c(this.f11356b).a();
    }
}
