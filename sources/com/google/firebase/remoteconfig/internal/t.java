package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigStorageClient.java */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, t> f12062c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f12063a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12064b;

    private t(Context context, String str) {
        this.f12063a = context;
        this.f12064b = str;
    }

    public static synchronized t c(Context context, String str) {
        t tVar;
        synchronized (t.class) {
            Map<String, t> map = f12062c;
            if (!map.containsKey(str)) {
                map.put(str, new t(context, str));
            }
            tVar = map.get(str);
        }
        return tVar;
    }

    public synchronized Void a() {
        this.f12063a.deleteFile(this.f12064b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f12064b;
    }

    public synchronized g d() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f12063a.openFileInput(this.f12064b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                g b10 = g.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStream.close();
                return b10;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public synchronized Void e(g gVar) throws IOException {
        FileOutputStream openFileOutput = this.f12063a.openFileOutput(this.f12064b, 0);
        try {
            openFileOutput.write(gVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
