package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f11548a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11549b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11550c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11551d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11552e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11553f;

    /* renamed from: g  reason: collision with root package name */
    private final String f11554g;

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f11549b = str;
        this.f11548a = str2;
        this.f11550c = str3;
        this.f11551d = str4;
        this.f11552e = str5;
        this.f11553f = str6;
        this.f11554g = str7;
    }

    public static k a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new k(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f11548a;
    }

    public String c() {
        return this.f11549b;
    }

    public String d() {
        return this.f11552e;
    }

    public String e() {
        return this.f11554g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!Objects.equal(this.f11549b, kVar.f11549b) || !Objects.equal(this.f11548a, kVar.f11548a) || !Objects.equal(this.f11550c, kVar.f11550c) || !Objects.equal(this.f11551d, kVar.f11551d) || !Objects.equal(this.f11552e, kVar.f11552e) || !Objects.equal(this.f11553f, kVar.f11553f) || !Objects.equal(this.f11554g, kVar.f11554g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f11549b, this.f11548a, this.f11550c, this.f11551d, this.f11552e, this.f11553f, this.f11554g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f11549b).add("apiKey", this.f11548a).add("databaseUrl", this.f11550c).add("gcmSenderId", this.f11552e).add("storageBucket", this.f11553f).add("projectId", this.f11554g).toString();
    }
}
