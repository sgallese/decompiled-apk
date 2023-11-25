package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: NotificationParams.java */
/* loaded from: classes3.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f11643a;

    public g0(Bundle bundle) {
        if (bundle != null) {
            this.f11643a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals("from")) {
            return false;
        }
        return true;
    }

    public static boolean t(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    private static boolean u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    private static String v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.f11643a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v10 = v(str);
            if (this.f11643a.containsKey(v10)) {
                return v10;
            }
        }
        return str;
    }

    private static String z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public boolean a(String str) {
        String p10 = p(str);
        if (!"1".equals(p10) && !Boolean.parseBoolean(p10)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String p10 = p(str);
        if (!TextUtils.isEmpty(p10)) {
            try {
                return Integer.valueOf(Integer.parseInt(p10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p10 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        String p10 = p(str);
        if (!TextUtils.isEmpty(p10)) {
            try {
                return new JSONArray(p10);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p10 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() == 3) {
                iArr[0] = d(c10.optString(0));
                iArr[1] = c10.optInt(1);
                iArr[2] = c10.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c10 + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c10 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String p10 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p10)) {
            p10 = p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p10)) {
            return Uri.parse(p10);
        }
        return null;
    }

    public Object[] g(String str) {
        JSONArray c10 = c(str + "_loc_args");
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = c10.optString(i10);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h10 = h(str2);
        if (TextUtils.isEmpty(h10)) {
            return null;
        }
        int identifier = resources.getIdentifier(h10, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g10 = g(str2);
        if (g10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g10);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g10) + " Default value will be used.", e10);
            return null;
        }
    }

    public Long j(String str) {
        String p10 = p(str);
        if (!TextUtils.isEmpty(p10)) {
            try {
                return Long.valueOf(Long.parseLong(p10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p10 + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer l() {
        Integer b10 = b("gcm.n.notification_count");
        if (b10 == null) {
            return null;
        }
        if (b10.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b10 + ". Skipping setting notificationCount.");
            return null;
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer m() {
        Integer b10 = b("gcm.n.notification_priority");
        if (b10 == null) {
            return null;
        }
        if (b10.intValue() >= -2 && b10.intValue() <= 2) {
            return b10;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b10 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p10 = p(str2);
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return i(resources, str, str2);
    }

    public String o() {
        String p10 = p("gcm.n.sound2");
        if (TextUtils.isEmpty(p10)) {
            return p("gcm.n.sound");
        }
        return p10;
    }

    public String p(String str) {
        return this.f11643a.getString(w(str));
    }

    public long[] q() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() > 1) {
                int length = c10.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = c10.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer r() {
        Integer b10 = b("gcm.n.visibility");
        if (b10 == null) {
            return null;
        }
        if (b10.intValue() >= -1 && b10.intValue() <= 1) {
            return b10;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b10 + ". Skipping setting visibility.");
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f11643a);
        for (String str : this.f11643a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f11643a);
        for (String str : this.f11643a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
