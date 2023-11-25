package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import r8.b0;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes3.dex */
class v implements z {

    /* renamed from: a  reason: collision with root package name */
    private final File f11487a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11488b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11489c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(String str, String str2, File file) {
        this.f11488b = str;
        this.f11489c = str2;
        this.f11487a = file;
    }

    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream b10 = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b10 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b10 != null) {
                            b10.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = b10.read(bArr);
                            if (read > 0) {
                                gZIPOutputStream.write(bArr, 0, read);
                            } else {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                b10.close();
                                return byteArray;
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.z
    public String a() {
        return this.f11489c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.z
    public InputStream b() {
        if (this.f11487a.exists() && this.f11487a.isFile()) {
            try {
                return new FileInputStream(this.f11487a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.z
    public b0.d.b c() {
        byte[] d10 = d();
        if (d10 != null) {
            return b0.d.b.a().b(d10).c(this.f11488b).a();
        }
        return null;
    }
}
