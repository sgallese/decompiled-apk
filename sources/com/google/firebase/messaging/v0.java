package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes3.dex */
final class v0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f11705d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f11706a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11707b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11708c;

    private v0(String str, String str2) {
        this.f11706a = d(str2, str);
        this.f11707b = str;
        this.f11708c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new v0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f11705d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String b() {
        return this.f11707b;
    }

    public String c() {
        return this.f11706a;
    }

    public String e() {
        return this.f11708c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!this.f11706a.equals(v0Var.f11706a) || !this.f11707b.equals(v0Var.f11707b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f11707b, this.f11706a);
    }
}
