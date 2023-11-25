package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f12014e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    static final Pattern f12015f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g  reason: collision with root package name */
    static final Pattern f12016g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    private final Set<BiConsumer<String, g>> f12017a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f12018b;

    /* renamed from: c  reason: collision with root package name */
    private final f f12019c;

    /* renamed from: d  reason: collision with root package name */
    private final f f12020d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f12018b = executor;
        this.f12019c = fVar;
        this.f12020d = fVar2;
    }

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f12017a) {
            for (final BiConsumer<String, g> biConsumer : this.f12017a) {
                this.f12018b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        BiConsumer.this.accept(str, gVar);
                    }
                });
            }
        }
    }

    private static g f(f fVar) {
        return fVar.f();
    }

    private static Set<String> g(f fVar) {
        HashSet hashSet = new HashSet();
        g f10 = f(fVar);
        if (f10 == null) {
            return hashSet;
        }
        Iterator<String> keys = f10.f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static Long i(f fVar, String str) {
        g f10 = f(fVar);
        if (f10 == null) {
            return null;
        }
        try {
            return Long.valueOf(f10.f().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String k(f fVar, String str) {
        g f10 = f(fVar);
        if (f10 == null) {
            return null;
        }
        try {
            return f10.f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void n(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer<String, g> biConsumer) {
        synchronized (this.f12017a) {
            this.f12017a.add(biConsumer);
        }
    }

    public Map<String, da.l> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(g(this.f12019c));
        hashSet.addAll(g(this.f12020d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, l(str));
        }
        return hashMap;
    }

    public boolean e(String str) {
        String k10 = k(this.f12019c, str);
        if (k10 != null) {
            if (f12015f.matcher(k10).matches()) {
                c(str, f(this.f12019c));
                return true;
            } else if (f12016g.matcher(k10).matches()) {
                c(str, f(this.f12019c));
                return false;
            }
        }
        String k11 = k(this.f12020d, str);
        if (k11 != null) {
            if (f12015f.matcher(k11).matches()) {
                return true;
            }
            if (f12016g.matcher(k11).matches()) {
                return false;
            }
        }
        n(str, "Boolean");
        return false;
    }

    public long h(String str) {
        Long i10 = i(this.f12019c, str);
        if (i10 != null) {
            c(str, f(this.f12019c));
            return i10.longValue();
        }
        Long i11 = i(this.f12020d, str);
        if (i11 != null) {
            return i11.longValue();
        }
        n(str, "Long");
        return 0L;
    }

    public String j(String str) {
        String k10 = k(this.f12019c, str);
        if (k10 != null) {
            c(str, f(this.f12019c));
            return k10;
        }
        String k11 = k(this.f12020d, str);
        if (k11 != null) {
            return k11;
        }
        n(str, "String");
        return "";
    }

    public da.l l(String str) {
        String k10 = k(this.f12019c, str);
        if (k10 != null) {
            c(str, f(this.f12019c));
            return new w(k10, 2);
        }
        String k11 = k(this.f12020d, str);
        if (k11 != null) {
            return new w(k11, 1);
        }
        n(str, "FirebaseRemoteConfigValue");
        return new w("", 0);
    }
}
