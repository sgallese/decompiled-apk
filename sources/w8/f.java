package w8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.n0;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.common.s;
import com.google.firebase.crashlytics.internal.common.t;
import com.google.firebase.crashlytics.internal.common.w;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes3.dex */
public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f25457a;

    /* renamed from: b  reason: collision with root package name */
    private final j f25458b;

    /* renamed from: c  reason: collision with root package name */
    private final g f25459c;

    /* renamed from: d  reason: collision with root package name */
    private final r f25460d;

    /* renamed from: e  reason: collision with root package name */
    private final w8.a f25461e;

    /* renamed from: f  reason: collision with root package name */
    private final k f25462f;

    /* renamed from: g  reason: collision with root package name */
    private final s f25463g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<d> f25464h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<d>> f25465i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsController.java */
    /* loaded from: classes3.dex */
    public class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Void r52) throws Exception {
            JSONObject a10 = f.this.f25462f.a(f.this.f25458b, true);
            if (a10 != null) {
                d b10 = f.this.f25459c.b(a10);
                f.this.f25461e.c(b10.f25446c, a10);
                f.this.q(a10, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f25458b.f25473f);
                f.this.f25464h.set(b10);
                ((TaskCompletionSource) f.this.f25465i.get()).trySetResult(b10);
            }
            return Tasks.forResult(null);
        }
    }

    f(Context context, j jVar, r rVar, g gVar, w8.a aVar, k kVar, s sVar) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f25464h = atomicReference;
        this.f25465i = new AtomicReference<>(new TaskCompletionSource());
        this.f25457a = context;
        this.f25458b = jVar;
        this.f25460d = rVar;
        this.f25459c = gVar;
        this.f25461e = aVar;
        this.f25462f = kVar;
        this.f25463g = sVar;
        atomicReference.set(b.b(rVar));
    }

    public static f l(Context context, String str, w wVar, t8.b bVar, String str2, String str3, u8.f fVar, s sVar) {
        String g10 = wVar.g();
        n0 n0Var = new n0();
        return new f(context, new j(str, wVar.h(), wVar.i(), wVar.j(), wVar, com.google.firebase.crashlytics.internal.common.h.h(com.google.firebase.crashlytics.internal.common.h.o(context), str, str3, str2), str3, str2, t.determineFrom(g10).getId()), n0Var, new g(n0Var), new w8.a(fVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), sVar);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b10 = this.f25461e.b();
                if (b10 != null) {
                    d b11 = this.f25459c.b(b10);
                    if (b11 != null) {
                        q(b10, "Loaded cached settings: ");
                        long a10 = this.f25460d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b11.a(a10)) {
                            n8.f.f().i("Cached settings have expired.");
                        }
                        try {
                            n8.f.f().i("Returning cached settings.");
                            dVar = b11;
                        } catch (Exception e10) {
                            e = e10;
                            dVar = b11;
                            n8.f.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        n8.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    n8.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.h.s(this.f25457a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) throws JSONException {
        n8.f.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.internal.common.h.s(this.f25457a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // w8.i
    public Task<d> a() {
        return this.f25465i.get().getTask();
    }

    @Override // w8.i
    public d b() {
        return this.f25464h.get();
    }

    boolean k() {
        return !n().equals(this.f25458b.f25473f);
    }

    public Task<Void> o(Executor executor) {
        return p(e.USE_CACHE, executor);
    }

    public Task<Void> p(e eVar, Executor executor) {
        d m10;
        if (!k() && (m10 = m(eVar)) != null) {
            this.f25464h.set(m10);
            this.f25465i.get().trySetResult(m10);
            return Tasks.forResult(null);
        }
        d m11 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m11 != null) {
            this.f25464h.set(m11);
            this.f25465i.get().trySetResult(m11);
        }
        return this.f25463g.h(executor).onSuccessTask(executor, new a());
    }
}
