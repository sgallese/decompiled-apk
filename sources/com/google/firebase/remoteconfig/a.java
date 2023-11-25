package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.e;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.q;
import com.google.firebase.remoteconfig.internal.u;
import da.j;
import da.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l8.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f11909m = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final Context f11910a;

    /* renamed from: b  reason: collision with root package name */
    private final e f11911b;

    /* renamed from: c  reason: collision with root package name */
    private final g8.b f11912c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f11913d;

    /* renamed from: e  reason: collision with root package name */
    private final f f11914e;

    /* renamed from: f  reason: collision with root package name */
    private final f f11915f;

    /* renamed from: g  reason: collision with root package name */
    private final f f11916g;

    /* renamed from: h  reason: collision with root package name */
    private final m f11917h;

    /* renamed from: i  reason: collision with root package name */
    private final o f11918i;

    /* renamed from: j  reason: collision with root package name */
    private final p f11919j;

    /* renamed from: k  reason: collision with root package name */
    private final j9.e f11920k;

    /* renamed from: l  reason: collision with root package name */
    private final q f11921l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, e eVar, j9.e eVar2, g8.b bVar, Executor executor, f fVar, f fVar2, f fVar3, m mVar, o oVar, p pVar, q qVar) {
        this.f11910a = context;
        this.f11911b = eVar;
        this.f11920k = eVar2;
        this.f11912c = bVar;
        this.f11913d = executor;
        this.f11914e = fVar;
        this.f11915f = fVar2;
        this.f11916g = fVar3;
        this.f11917h = mVar;
        this.f11918i = oVar;
        this.f11919j = pVar;
        this.f11921l = qVar;
    }

    private Task<Void> A(Map<String, String> map) {
        try {
            return this.f11916g.k(g.j().b(map).a()).onSuccessTask(k.a(), new SuccessContinuation() { // from class: da.d
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task v10;
                    v10 = com.google.firebase.remoteconfig.a.v((com.google.firebase.remoteconfig.internal.g) obj);
                    return v10;
                }
            });
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            return Tasks.forResult(null);
        }
    }

    static List<Map<String, String>> C(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static a m() {
        return n(e.k());
    }

    public static a n(e eVar) {
        return ((c) eVar.i(c.class)).f();
    }

    private static boolean q(g gVar, g gVar2) {
        if (gVar2 != null && gVar.g().equals(gVar2.g())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task r(Task task, Task task2, Task task3) throws Exception {
        if (task.isSuccessful() && task.getResult() != null) {
            g gVar = (g) task.getResult();
            if (task2.isSuccessful() && !q(gVar, (g) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.f11915f.k(gVar).continueWith(this.f11913d, new Continuation() { // from class: da.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    boolean w10;
                    w10 = com.google.firebase.remoteconfig.a.this.w(task4);
                    return Boolean.valueOf(w10);
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task s(m.a aVar) throws Exception {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task t(Void r12) throws Exception {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u(da.k kVar) throws Exception {
        this.f11919j.l(kVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task v(g gVar) throws Exception {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(Task<g> task) {
        if (task.isSuccessful()) {
            this.f11914e.d();
            if (task.getResult() != null) {
                D(task.getResult().d());
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        this.f11915f.e();
        this.f11916g.e();
        this.f11914e.e();
    }

    void D(JSONArray jSONArray) {
        if (this.f11912c == null) {
            return;
        }
        try {
            this.f11912c.m(C(jSONArray));
        } catch (AbtException e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }

    public Task<Boolean> g() {
        final Task<g> e10 = this.f11914e.e();
        final Task<g> e11 = this.f11915f.e();
        return Tasks.whenAllComplete(e10, e11).continueWithTask(this.f11913d, new Continuation() { // from class: da.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task r10;
                r10 = com.google.firebase.remoteconfig.a.this.r(e10, e11, task);
                return r10;
            }
        });
    }

    public Task<Void> h() {
        return this.f11917h.i().onSuccessTask(k.a(), new SuccessContinuation() { // from class: da.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task s10;
                s10 = com.google.firebase.remoteconfig.a.s((m.a) obj);
                return s10;
            }
        });
    }

    public Task<Boolean> i() {
        return h().onSuccessTask(this.f11913d, new SuccessContinuation() { // from class: da.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task t10;
                t10 = com.google.firebase.remoteconfig.a.this.t((Void) obj);
                return t10;
            }
        });
    }

    public Map<String, l> j() {
        return this.f11918i.d();
    }

    public boolean k(String str) {
        return this.f11918i.e(str);
    }

    public j l() {
        return this.f11919j.c();
    }

    public long o(String str) {
        return this.f11918i.h(str);
    }

    public String p(String str) {
        return this.f11918i.j(str);
    }

    public Task<Void> x(final da.k kVar) {
        return Tasks.call(this.f11913d, new Callable() { // from class: da.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void u10;
                u10 = com.google.firebase.remoteconfig.a.this.u(kVar);
                return u10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(boolean z10) {
        this.f11921l.b(z10);
    }

    public Task<Void> z(int i10) {
        return A(u.a(this.f11910a, i10));
    }
}
