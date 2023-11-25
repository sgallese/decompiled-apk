package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static final Date f11971g = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f11972a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f11973b;

    /* renamed from: c  reason: collision with root package name */
    private Date f11974c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f11975d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f11976e;

    /* renamed from: f  reason: collision with root package name */
    private long f11977f;

    /* compiled from: ConfigContainer.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f11978a;

        /* renamed from: b  reason: collision with root package name */
        private Date f11979b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f11980c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f11981d;

        /* renamed from: e  reason: collision with root package name */
        private long f11982e;

        public g a() throws JSONException {
            return new g(this.f11978a, this.f11979b, this.f11980c, this.f11981d, this.f11982e);
        }

        public b b(Map<String, String> map) {
            this.f11978a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f11978a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f11980c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f11979b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f11981d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j10) {
            this.f11982e = j10;
            return this;
        }

        private b() {
            this.f11978a = new JSONObject();
            this.f11979b = g.f11971g;
            this.f11980c = new JSONArray();
            this.f11981d = new JSONObject();
            this.f11982e = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    private static g c(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b j() {
        return new b();
    }

    public JSONArray d() {
        return this.f11975d;
    }

    public Set<String> e(g gVar) throws JSONException {
        JSONObject f10 = c(gVar.f11972a).f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!gVar.f().has(next)) {
                hashSet.add(next);
            } else if (!f().get(next).equals(gVar.f().get(next))) {
                hashSet.add(next);
            } else if ((h().has(next) && !gVar.h().has(next)) || (!h().has(next) && gVar.h().has(next))) {
                hashSet.add(next);
            } else if (h().has(next) && gVar.h().has(next) && !h().getJSONObject(next).toString().equals(gVar.h().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                f10.remove(next);
            }
        }
        Iterator<String> keys2 = f10.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f11972a.toString().equals(((g) obj).toString());
    }

    public JSONObject f() {
        return this.f11973b;
    }

    public Date g() {
        return this.f11974c;
    }

    public JSONObject h() {
        return this.f11976e;
    }

    public int hashCode() {
        return this.f11972a.hashCode();
    }

    public long i() {
        return this.f11977f;
    }

    public String toString() {
        return this.f11972a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        this.f11973b = jSONObject;
        this.f11974c = date;
        this.f11975d = jSONArray;
        this.f11976e = jSONObject2;
        this.f11977f = j10;
        this.f11972a = jSONObject3;
    }
}
