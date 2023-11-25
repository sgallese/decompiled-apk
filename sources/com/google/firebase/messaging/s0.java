package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11683a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11684b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11685c;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11687e;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f11686d = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f11688f = false;

    private s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f11683a = sharedPreferences;
        this.f11684b = str;
        this.f11685c = str2;
        this.f11687e = executor;
    }

    private boolean b(boolean z10) {
        if (z10 && !this.f11688f) {
            i();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        s0 s0Var = new s0(sharedPreferences, str, str2, executor);
        s0Var.d();
        return s0Var;
    }

    private void d() {
        synchronized (this.f11686d) {
            this.f11686d.clear();
            String string = this.f11683a.getString(this.f11684b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f11685c)) {
                String[] split = string.split(this.f11685c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f11686d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f11686d) {
            this.f11683a.edit().putString(this.f11684b, g()).commit();
        }
    }

    private void i() {
        this.f11687e.execute(new Runnable() { // from class: com.google.firebase.messaging.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0.this.h();
            }
        });
    }

    public String e() {
        String peek;
        synchronized (this.f11686d) {
            peek = this.f11686d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean b10;
        synchronized (this.f11686d) {
            b10 = b(this.f11686d.remove(obj));
        }
        return b10;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f11686d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f11685c);
        }
        return sb2.toString();
    }
}
