package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.coroutines.Continuation;

/* compiled from: TopicsManager.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6442a = new a(null);

    /* compiled from: TopicsManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final d a(Context context) {
            qc.q.i(context, "context");
            o3.b bVar = o3.b.f20470a;
            if (bVar.a() >= 5) {
                return new l(context);
            }
            if (bVar.a() == 4) {
                return new g(context);
            }
            return null;
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super b> continuation);
}
