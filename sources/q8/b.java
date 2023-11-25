package q8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes3.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f21566a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f21567b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21568c;

    public b(int i10, int i11) {
        this.f21567b = i10;
        this.f21568c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f21568c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i10) {
                return trim.substring(0, i10);
            }
            return trim;
        }
        return str;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f21566a));
    }

    public synchronized boolean d(String str, String str2) {
        String b10 = b(str);
        if (this.f21566a.size() >= this.f21567b && !this.f21566a.containsKey(b10)) {
            n8.f.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f21567b);
            return false;
        }
        String c10 = c(str2, this.f21568c);
        if (com.google.firebase.crashlytics.internal.common.h.B(this.f21566a.get(b10), c10)) {
            return false;
        }
        Map<String, String> map = this.f21566a;
        if (str2 == null) {
            c10 = "";
        }
        map.put(b10, c10);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        String c10;
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b10 = b(entry.getKey());
            if (this.f21566a.size() >= this.f21567b && !this.f21566a.containsKey(b10)) {
                i10++;
            }
            String value = entry.getValue();
            Map<String, String> map2 = this.f21566a;
            if (value == null) {
                c10 = "";
            } else {
                c10 = c(value, this.f21568c);
            }
            map2.put(b10, c10);
        }
        if (i10 > 0) {
            n8.f.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f21567b);
        }
    }
}
