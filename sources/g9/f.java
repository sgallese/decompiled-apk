package g9;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g9.j;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import k8.b0;
import k8.r;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes3.dex */
public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final i9.b<k> f16251a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16252b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.b<ca.i> f16253c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f16254d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f16255e;

    private f(final Context context, final String str, Set<g> set, i9.b<ca.i> bVar, Executor executor) {
        this(new i9.b() { // from class: g9.e
            @Override // i9.b
            public final Object get() {
                k j10;
                j10 = f.j(context, str);
                return j10;
            }
        }, set, executor, bVar, context);
    }

    public static k8.c<f> g() {
        final b0 a10 = b0.a(j8.a.class, Executor.class);
        return k8.c.d(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(com.google.firebase.e.class)).b(r.m(g.class)).b(r.l(ca.i.class)).b(r.k(a10)).f(new k8.h() { // from class: g9.d
            @Override // k8.h
            public final Object a(k8.e eVar) {
                f h10;
                h10 = f.h(b0.this, eVar);
                return h10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(b0 b0Var, k8.e eVar) {
        return new f((Context) eVar.a(Context.class), ((com.google.firebase.e) eVar.a(com.google.firebase.e.class)).n(), eVar.g(g.class), eVar.c(ca.i.class), (Executor) eVar.f(b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            k kVar = this.f16251a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                l lVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.c());
                jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() throws Exception {
        synchronized (this) {
            this.f16251a.get().k(System.currentTimeMillis(), this.f16253c.get().a());
        }
        return null;
    }

    @Override // g9.i
    public Task<String> a() {
        if ((!u.a(this.f16252b)) != false) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f16255e, new Callable() { // from class: g9.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i10;
                i10 = f.this.i();
                return i10;
            }
        });
    }

    @Override // g9.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f16251a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public Task<Void> l() {
        if (this.f16254d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if ((!u.a(this.f16252b)) != false) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f16255e, new Callable() { // from class: g9.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k10;
                k10 = f.this.k();
                return k10;
            }
        });
    }

    f(i9.b<k> bVar, Set<g> set, Executor executor, i9.b<ca.i> bVar2, Context context) {
        this.f16251a = bVar;
        this.f16254d = set;
        this.f16255e = executor;
        this.f16253c = bVar2;
        this.f16252b = context;
    }
}
