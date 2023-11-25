package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store.java */
/* loaded from: classes3.dex */
class t0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f11690a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Store.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f11691d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f11692a;

        /* renamed from: b  reason: collision with root package name */
        final String f11693b;

        /* renamed from: c  reason: collision with root package name */
        final long f11694c;

        private a(String str, String str2, long j10) {
            this.f11692a = str;
            this.f11693b = str2;
            this.f11694c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(String str) {
            if (System.currentTimeMillis() <= this.f11694c + f11691d && str.equals(this.f11693b)) {
                return false;
            }
            return true;
        }
    }

    public t0(Context context) {
        this.f11690a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.a.h(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !e()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                c();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f11690a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f11690a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f11690a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f11690a.edit();
        edit.putString(b(str, str2), a10);
        edit.commit();
    }
}
