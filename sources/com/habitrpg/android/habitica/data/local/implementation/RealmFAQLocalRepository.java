package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.local.FAQLocalRepository;
import com.habitrpg.android.habitica.models.FAQArticle;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import io.realm.g1;
import io.realm.o0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.q;

/* compiled from: RealmFAQLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmFAQLocalRepository extends RealmContentLocalRepository implements FAQLocalRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmFAQLocalRepository(o0 o0Var) {
        super(o0Var);
        q.i(o0Var, "realm");
    }

    @Override // com.habitrpg.android.habitica.data.local.FAQLocalRepository
    public g<FAQArticle> getArticle(int i10) {
        g1 p10 = getRealm().k1(FAQArticle.class).m("position", Integer.valueOf(i10)).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<FAQArticle>> gVar = new g<g1<FAQArticle>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1$2", f = "RealmFAQLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L47
                        int r2 = r2.size()
                        if (r2 <= 0) goto L47
                        r2 = 1
                        goto L48
                    L47:
                        r2 = 0
                    L48:
                        if (r2 == 0) goto L53
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L53
                        return r1
                    L53:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<FAQArticle>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<FAQArticle>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1$2", f = "RealmFAQLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = ec.r.c0(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$getArticle$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super FAQArticle> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.FAQLocalRepository
    public g<List<FAQArticle>> getArticles() {
        g1 p10 = getRealm().k1(FAQArticle.class).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<FAQArticle>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1$2", f = "RealmFAQLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<FAQArticle>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }
}
