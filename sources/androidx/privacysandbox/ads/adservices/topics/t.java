package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: TopicsManagerImplCommon.kt */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class t extends d {

    /* renamed from: b  reason: collision with root package name */
    private final TopicsManager f6443b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopicsManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f6444f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f6445m;

        /* renamed from: q  reason: collision with root package name */
        int f6447q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6445m = obj;
            this.f6447q |= RecyclerView.UNDEFINED_DURATION;
            return t.e(t.this, null, this);
        }
    }

    public t(TopicsManager topicsManager) {
        qc.q.i(topicsManager, "mTopicsManager");
        this.f6443b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.t r4, androidx.privacysandbox.ads.adservices.topics.a r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.b> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.t.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = (androidx.privacysandbox.ads.adservices.topics.t.a) r0
            int r1 = r0.f6447q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6447q = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = new androidx.privacysandbox.ads.adservices.topics.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6445m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f6447q
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f6444f
            androidx.privacysandbox.ads.adservices.topics.t r4 = (androidx.privacysandbox.ads.adservices.topics.t) r4
            dc.n.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            dc.n.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f6444f = r4
            r0.f6447q = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.m.a(r6)
            androidx.privacysandbox.ads.adservices.topics.b r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.t.e(androidx.privacysandbox.ads.adservices.topics.t, androidx.privacysandbox.ads.adservices.topics.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        this.f6443b.getTopics(getTopicsRequest, new s3.m(), androidx.core.os.s.a(nVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super b> continuation) {
        return e(this, aVar, continuation);
    }

    public GetTopicsRequest c(androidx.privacysandbox.ads.adservices.topics.a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        qc.q.i(aVar, "request");
        adsSdkName = h.a().setAdsSdkName(aVar.a());
        build = adsSdkName.build();
        qc.q.h(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final b d(GetTopicsResponse getTopicsResponse) {
        List topics;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        qc.q.i(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        topics = getTopicsResponse.getTopics();
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic a10 = p.a(it.next());
            taxonomyVersion = a10.getTaxonomyVersion();
            modelVersion = a10.getModelVersion();
            topicId = a10.getTopicId();
            arrayList.add(new c(taxonomyVersion, modelVersion, topicId));
        }
        return new b(arrayList);
    }
}
