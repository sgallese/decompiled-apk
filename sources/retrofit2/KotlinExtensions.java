package retrofit2;

import ad.m;
import ad.n;
import com.google.android.gms.ads.RequestConfiguration;
import dc.m;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: KotlinExtensions.kt */
/* loaded from: classes4.dex */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, Continuation<? super T> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        final n nVar = new n(c10, 1);
        nVar.n(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                q.j(call2, "call");
                q.j(th, "t");
                m mVar = m.this;
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(dc.n.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                q.j(call2, "call");
                q.j(response, "response");
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        Object tag = call2.request().tag(Invocation.class);
                        if (tag == null) {
                            q.t();
                        }
                        q.e(tag, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) tag).method();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Response from ");
                        q.e(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        q.e(declaringClass, "method.declaringClass");
                        sb2.append(declaringClass.getName());
                        sb2.append('.');
                        sb2.append(method.getName());
                        sb2.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                        ad.m mVar = ad.m.this;
                        m.a aVar = dc.m.f13253f;
                        mVar.resumeWith(dc.m.a(dc.n.a(kotlinNullPointerException)));
                        return;
                    }
                    ad.m.this.resumeWith(dc.m.a(body));
                    return;
                }
                ad.m mVar2 = ad.m.this;
                HttpException httpException = new HttpException(response);
                m.a aVar2 = dc.m.f13253f;
                mVar2.resumeWith(dc.m.a(dc.n.a(httpException)));
            }
        });
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    public static final <T> Object awaitNullable(Call<T> call, Continuation<? super T> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        final n nVar = new n(c10, 1);
        nVar.n(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                q.j(call2, "call");
                q.j(th, "t");
                ad.m mVar = ad.m.this;
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(dc.n.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                q.j(call2, "call");
                q.j(response, "response");
                if (response.isSuccessful()) {
                    ad.m.this.resumeWith(dc.m.a(response.body()));
                    return;
                }
                ad.m mVar = ad.m.this;
                HttpException httpException = new HttpException(response);
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(dc.n.a(httpException)));
            }
        });
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    public static final <T> Object awaitResponse(Call<T> call, Continuation<? super Response<T>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        final n nVar = new n(c10, 1);
        nVar.n(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                q.j(call2, "call");
                q.j(th, "t");
                ad.m mVar = ad.m.this;
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(dc.n.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                q.j(call2, "call");
                q.j(response, "response");
                ad.m.this.resumeWith(dc.m.a(response));
            }
        });
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        q.j(retrofit, "$this$create");
        q.n(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) retrofit.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            dc.n.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            dc.n.b(r5)
            r0.L$0 = r4
            r0.label = r3
            ad.g0 r5 = ad.a1.a()
            hc.f r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.A0(r2, r3)
            java.lang.Object r4 = ic.b.d()
            java.lang.Object r5 = ic.b.d()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            dc.w r4 = dc.w.f13270a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
