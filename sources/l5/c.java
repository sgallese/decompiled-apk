package l5;

import ad.g0;
import ad.k0;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import dc.w;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import p5.f;
import pc.q;
import qc.h;
import t5.g;
import t5.i;
import t5.r;

/* compiled from: AndroidStorage.kt */
/* loaded from: classes.dex */
public final class c implements f, g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f19553f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final m5.a f19554a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f19555b;

    /* renamed from: c  reason: collision with root package name */
    private final File f19556c;

    /* renamed from: d  reason: collision with root package name */
    private final t5.f f19557d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, q<q5.a, Integer, String, w>> f19558e;

    /* compiled from: AndroidStorage.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidStorage.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.android.utilities.AndroidStorage", f = "AndroidStorage.kt", l = {41}, m = "writeEvent")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f19559f;

        /* renamed from: m  reason: collision with root package name */
        Object f19560m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f19561p;

        /* renamed from: r  reason: collision with root package name */
        int f19563r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19561p = obj;
            this.f19563r |= RecyclerView.UNDEFINED_DURATION;
            return c.this.j(null, this);
        }
    }

    public c(Context context, String str, m5.a aVar) {
        qc.q.i(context, "context");
        qc.q.i(str, "apiKey");
        qc.q.i(aVar, "logger");
        this.f19554a = aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences(qc.q.q("amplitude-android-", str), 0);
        qc.q.h(sharedPreferences, "context.getSharedPrefere…y\", Context.MODE_PRIVATE)");
        this.f19555b = sharedPreferences;
        File dir = context.getDir("amplitude-disk-queue", 0);
        qc.q.h(dir, "context.getDir(\"amplitud…e\", Context.MODE_PRIVATE)");
        this.f19556c = dir;
        this.f19557d = new t5.f(dir, str, new l5.a(sharedPreferences));
        this.f19558e = new LinkedHashMap();
    }

    @Override // p5.f
    public List<Object> a() {
        return this.f19557d.h();
    }

    @Override // t5.g
    public void b(String str) {
        qc.q.i(str, "insertId");
        this.f19558e.remove(str);
    }

    @Override // p5.f
    public Object c(Object obj, Continuation<? super String> continuation) {
        return this.f19557d.f((String) obj, continuation);
    }

    @Override // t5.g
    public void d(String str, JSONArray jSONArray) {
        qc.q.i(str, "filePath");
        qc.q.i(jSONArray, "events");
        this.f19557d.m(str, jSONArray);
    }

    @Override // t5.g
    public q<q5.a, Integer, String, w> e(String str) {
        qc.q.i(str, "insertId");
        return this.f19558e.get(str);
    }

    @Override // p5.f
    public String f(f.a aVar) {
        qc.q.i(aVar, "key");
        return this.f19555b.getString(aVar.getRawVal(), null);
    }

    @Override // p5.f
    public Object g(Continuation<? super w> continuation) {
        Object d10;
        Object l10 = this.f19557d.l(continuation);
        d10 = ic.d.d();
        if (l10 == d10) {
            return l10;
        }
        return w.f13270a;
    }

    @Override // t5.g
    public boolean h(String str) {
        qc.q.i(str, "filePath");
        return this.f19557d.j(str);
    }

    @Override // p5.f
    public r i(r5.b bVar, p5.b bVar2, k0 k0Var, g0 g0Var, Object obj, String str) {
        qc.q.i(bVar, "eventPipeline");
        qc.q.i(bVar2, "configuration");
        qc.q.i(k0Var, "scope");
        qc.q.i(g0Var, "dispatcher");
        qc.q.i(obj, "events");
        qc.q.i(str, "eventsString");
        return new i(this, bVar, bVar2, k0Var, g0Var, (String) obj, str, this.f19554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // p5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(q5.a r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l5.c.b
            if (r0 == 0) goto L13
            r0 = r6
            l5.c$b r0 = (l5.c.b) r0
            int r1 = r0.f19563r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19563r = r1
            goto L18
        L13:
            l5.c$b r0 = new l5.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19561p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f19563r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f19560m
            q5.a r5 = (q5.a) r5
            java.lang.Object r0 = r0.f19559f
            l5.c r0 = (l5.c) r0
            dc.n.b(r6)
            goto L52
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            t5.f r6 = r4.f19557d
            t5.n r2 = t5.n.f23696a
            java.lang.String r2 = r2.b(r5)
            r0.f19559f = r4
            r0.f19560m = r5
            r0.f19563r = r3
            java.lang.Object r6 = r6.o(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            pc.q r6 = r5.f()
            if (r6 != 0) goto L59
            goto L68
        L59:
            java.lang.String r5 = r5.t()
            if (r5 != 0) goto L60
            goto L68
        L60:
            java.util.Map<java.lang.String, pc.q<q5.a, java.lang.Integer, java.lang.String, dc.w>> r0 = r0.f19558e
            java.lang.Object r5 = r0.put(r5, r6)
            pc.q r5 = (pc.q) r5
        L68:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.j(q5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p5.f
    public Object k(f.a aVar, String str, Continuation<? super w> continuation) {
        this.f19555b.edit().putString(aVar.getRawVal(), str).apply();
        return w.f13270a;
    }
}
