package q8;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MetaDataStore.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f21572b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final u8.f f21573a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetaDataStore.java */
    /* loaded from: classes3.dex */
    public class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21574a;

        a(String str) throws JSONException {
            this.f21574a = str;
            put(TaskFormActivity.USER_ID_KEY, str);
        }
    }

    public d(u8.f fVar) {
        this.f21573a = fVar;
    }

    private static Map<String, String> d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, k(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) throws JSONException {
        return k(new JSONObject(str), TaskFormActivity.USER_ID_KEY);
    }

    private static String f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static void i(File file) {
        if (file.exists() && file.delete()) {
            n8.f.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String j(String str) throws JSONException {
        return new a(str).toString();
    }

    private static String k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f21573a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.f21573a.o(str, "keys");
    }

    public File c(String str) {
        return this.f21573a.o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> g(String str, boolean z10) {
        File b10;
        FileInputStream fileInputStream;
        Exception e10;
        if (z10) {
            b10 = a(str);
        } else {
            b10 = b(str);
        }
        if (b10.exists() && b10.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(b10);
                try {
                    try {
                        Map<String, String> d10 = d(com.google.firebase.crashlytics.internal.common.h.D(fileInputStream));
                        com.google.firebase.crashlytics.internal.common.h.e(fileInputStream, "Failed to close user metadata file.");
                        return d10;
                    } catch (Exception e11) {
                        e10 = e11;
                        n8.f.f().l("Error deserializing user metadata.", e10);
                        i(b10);
                        com.google.firebase.crashlytics.internal.common.h.e(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    com.google.firebase.crashlytics.internal.common.h.e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.h.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            i(b10);
            return Collections.emptyMap();
        }
    }

    public String h(String str) {
        FileInputStream fileInputStream;
        File c10 = c(str);
        FileInputStream fileInputStream2 = null;
        if (c10.exists() && c10.length() != 0) {
            try {
                fileInputStream = new FileInputStream(c10);
                try {
                    try {
                        String e10 = e(com.google.firebase.crashlytics.internal.common.h.D(fileInputStream));
                        n8.f.f().b("Loaded userId " + e10 + " for session " + str);
                        com.google.firebase.crashlytics.internal.common.h.e(fileInputStream, "Failed to close user metadata file.");
                        return e10;
                    } catch (Exception e11) {
                        e = e11;
                        n8.f.f().l("Error deserializing user metadata.", e);
                        i(c10);
                        com.google.firebase.crashlytics.internal.common.h.e(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    com.google.firebase.crashlytics.internal.common.h.e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.h.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            n8.f.f().b("No userId set for session " + str);
            i(c10);
            return null;
        }
    }

    public void l(String str, Map<String, String> map, boolean z10) {
        File b10;
        String f10;
        BufferedWriter bufferedWriter;
        if (z10) {
            b10 = a(str);
        } else {
            b10 = b(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f10 = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f21572b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            bufferedWriter.write(f10);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.h.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            n8.f.f().l("Error serializing key/value metadata.", e);
            i(b10);
            com.google.firebase.crashlytics.internal.common.h.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.h.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void m(String str, String str2) {
        String j10;
        BufferedWriter bufferedWriter;
        File c10 = c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                j10 = j(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c10), f21572b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(j10);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.h.e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            n8.f.f().l("Error serializing user metadata.", e);
            com.google.firebase.crashlytics.internal.common.h.e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.h.e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
