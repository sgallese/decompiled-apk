package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: d  reason: collision with root package name */
    private static final x7.f f10928d = new x7.f("PackMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f10929a;

    /* renamed from: b  reason: collision with root package name */
    private final q2 f10930b;

    /* renamed from: c  reason: collision with root package name */
    private final w7.b f10931c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(d0 d0Var, q2 q2Var, w7.b bVar) {
        this.f10929a = d0Var;
        this.f10930b = q2Var;
        this.f10931c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        if (this.f10931c.a("assetOnlyUpdates") && this.f10929a.f(str)) {
            int a10 = this.f10930b.a();
            d0 d0Var = this.f10929a;
            File x10 = d0Var.x(str, a10, d0Var.r(str));
            try {
                if (!x10.exists()) {
                    return String.valueOf(a10);
                }
                FileInputStream fileInputStream = new FileInputStream(x10);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    String property = properties.getProperty("moduleVersionTag");
                    if (property == null) {
                        return String.valueOf(a10);
                    }
                    return property;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                f10928d.b("Failed to read pack version tag for pack %s", str);
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, int i10, long j10, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i10);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File x10 = this.f10929a.x(str, i10, j10);
        x10.getParentFile().mkdirs();
        x10.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(x10);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
