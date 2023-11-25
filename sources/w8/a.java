package w8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final File f25440a;

    public a(u8.f fVar) {
        this.f25440a = fVar.e("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f25440a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        n8.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a10 = a();
                if (a10.exists()) {
                    fileInputStream = new FileInputStream(a10);
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.h.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        n8.f.f().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.internal.common.h.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    n8.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.internal.common.h.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.h.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.h.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) {
        FileWriter fileWriter;
        n8.f.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j10);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e10) {
                e = e10;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                com.google.firebase.crashlytics.internal.common.h.e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e11) {
                e = e11;
                fileWriter2 = fileWriter;
                n8.f.f().e("Failed to cache settings", e);
                com.google.firebase.crashlytics.internal.common.h.e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.internal.common.h.e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
