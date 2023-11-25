package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;

/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class l extends t {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            qc.q.i(r2, r0)
            java.lang.Class r0 = androidx.privacysandbox.ads.adservices.topics.e.a()
            java.lang.Object r2 = w0.b.a(r2, r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            qc.q.h(r2, r0)
            android.adservices.topics.TopicsManager r2 = androidx.privacysandbox.ads.adservices.topics.f.a(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.l.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.t
    public GetTopicsRequest c(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        qc.q.i(aVar, "request");
        adsSdkName = h.a().setAdsSdkName(aVar.a());
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(aVar.b());
        build = shouldRecordObservation.build();
        qc.q.h(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
