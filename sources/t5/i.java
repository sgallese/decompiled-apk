package t5;

import ad.g0;
import ad.k0;
import dc.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import t5.r;

/* compiled from: FileResponseHandler.kt */
/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: a  reason: collision with root package name */
    private final g f23674a;

    /* renamed from: b  reason: collision with root package name */
    private final r5.b f23675b;

    /* renamed from: c  reason: collision with root package name */
    private final p5.b f23676c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f23677d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f23678e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23679f;

    /* renamed from: g  reason: collision with root package name */
    private final String f23680g;

    /* renamed from: h  reason: collision with root package name */
    private final m5.a f23681h;

    /* compiled from: FileResponseHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$3", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23682f;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23682f == 0) {
                dc.n.b(obj);
                i.this.f23674a.h(i.this.f23679f);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FileResponseHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$1", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23684f;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23684f == 0) {
                dc.n.b(obj);
                i.this.f23674a.h(i.this.f23679f);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FileResponseHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$2", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23686f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ JSONArray f23688p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONArray jSONArray, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f23688p = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new c(this.f23688p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23686f == 0) {
                dc.n.b(obj);
                i.this.f23674a.d(i.this.f23679f, this.f23688p);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FileResponseHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.FileResponseHandler$handleSuccessResponse$1", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23689f;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23689f == 0) {
                dc.n.b(obj);
                i.this.f23674a.h(i.this.f23679f);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i(g gVar, r5.b bVar, p5.b bVar2, k0 k0Var, g0 g0Var, String str, String str2, m5.a aVar) {
        qc.q.i(gVar, "storage");
        qc.q.i(bVar, "eventPipeline");
        qc.q.i(bVar2, "configuration");
        qc.q.i(k0Var, "scope");
        qc.q.i(g0Var, "dispatcher");
        qc.q.i(str, "eventFilePath");
        qc.q.i(str2, "eventsString");
        this.f23674a = gVar;
        this.f23675b = bVar;
        this.f23676c = bVar2;
        this.f23677d = k0Var;
        this.f23678e = g0Var;
        this.f23679f = str;
        this.f23680g = str2;
        this.f23681h = aVar;
    }

    private final void j(String str) {
        Iterator it = yc.j.e(new yc.j("\"insert_id\":\"(.{36})\","), str, 0, 2, null).iterator();
        while (it.hasNext()) {
            this.f23674a.b(((yc.h) it.next()).a().get(1));
        }
    }

    private final void k(List<? extends q5.a> list, int i10, String str) {
        pc.q<q5.a, Integer, String, w> e10;
        for (q5.a aVar : list) {
            pc.q<q5.a, Integer, String, w> b10 = this.f23676c.b();
            if (b10 != null) {
                b10.invoke(aVar, Integer.valueOf(i10), str);
            }
            String t10 = aVar.t();
            if (t10 != null && (e10 = this.f23674a.e(t10)) != null) {
                e10.invoke(aVar, Integer.valueOf(i10), str);
                this.f23674a.b(t10);
            }
        }
    }

    @Override // t5.r
    public void a(q qVar) {
        r.a.a(this, qVar);
    }

    @Override // t5.r
    public void b(h hVar) {
        qc.q.i(hVar, "failedResponse");
        m5.a aVar = this.f23681h;
        if (aVar != null) {
            aVar.b("Handle response, status: " + hVar.b() + ", error: " + hVar.a());
        }
    }

    @Override // t5.r
    public void c(s sVar) {
        qc.q.i(sVar, "successResponse");
        m5.a aVar = this.f23681h;
        if (aVar != null) {
            aVar.b(qc.q.q("Handle response, status: ", sVar.a()));
        }
        try {
            k(o.f(new JSONArray(this.f23680g)), l.SUCCESS.getCode(), "Event sent success.");
            ad.i.d(this.f23677d, this.f23678e, null, new d(null), 2, null);
        } catch (JSONException e10) {
            this.f23674a.h(this.f23679f);
            j(this.f23680g);
            throw e10;
        }
    }

    @Override // t5.r
    public void d(t tVar) {
        qc.q.i(tVar, "timeoutResponse");
        m5.a aVar = this.f23681h;
        if (aVar != null) {
            aVar.b(qc.q.q("Handle response, status: ", tVar.a()));
        }
    }

    @Override // t5.r
    public void e(p pVar) {
        qc.q.i(pVar, "payloadTooLargeResponse");
        m5.a aVar = this.f23681h;
        if (aVar != null) {
            aVar.b("Handle response, status: " + pVar.b() + ", error: " + pVar.a());
        }
        try {
            JSONArray jSONArray = new JSONArray(this.f23680g);
            if (jSONArray.length() != 1) {
                ad.i.d(this.f23677d, this.f23678e, null, new c(jSONArray, null), 2, null);
                return;
            }
            k(o.f(jSONArray), l.PAYLOAD_TOO_LARGE.getCode(), pVar.a());
            ad.i.d(this.f23677d, this.f23678e, null, new b(null), 2, null);
        } catch (JSONException e10) {
            this.f23674a.h(this.f23679f);
            j(this.f23680g);
            throw e10;
        }
    }

    @Override // t5.r
    public void f(u uVar) {
        qc.q.i(uVar, "tooManyRequestsResponse");
        m5.a aVar = this.f23681h;
        if (aVar != null) {
            aVar.b("Handle response, status: " + uVar.b() + ", error: " + uVar.a());
        }
    }

    @Override // t5.r
    public void g(t5.b bVar) {
        qc.q.i(bVar, "badRequestResponse");
        m5.a aVar = this.f23681h;
        if (aVar != null) {
            aVar.b("Handle response, status: " + bVar.d() + ", error: " + bVar.a());
        }
        try {
            List<q5.a> f10 = o.f(new JSONArray(this.f23680g));
            if (f10.size() == 1) {
                k(f10, l.BAD_REQUEST.getCode(), bVar.a());
                this.f23674a.h(this.f23679f);
                return;
            }
            Set<Integer> b10 = bVar.b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (Object obj : f10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    ec.t.r();
                }
                q5.a aVar2 = (q5.a) obj;
                if (!b10.contains(Integer.valueOf(i10)) && !bVar.e(aVar2)) {
                    arrayList2.add(aVar2);
                } else {
                    arrayList.add(aVar2);
                }
                i10 = i11;
            }
            k(arrayList, l.BAD_REQUEST.getCode(), bVar.a());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f23675b.s((q5.a) it.next());
            }
            ad.i.d(this.f23677d, this.f23678e, null, new a(null), 2, null);
        } catch (JSONException e10) {
            this.f23674a.h(this.f23679f);
            j(this.f23680g);
            throw e10;
        }
    }
}
