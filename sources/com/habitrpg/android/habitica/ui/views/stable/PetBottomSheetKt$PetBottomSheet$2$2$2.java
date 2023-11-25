package com.habitrpg.android.habitica.ui.views.stable;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.w;
import j0.g1;
import j0.j1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.a;
import pc.p;
import pc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
public final class PetBottomSheetKt$PetBottomSheet$2$2$2 extends r implements a<w> {
    final /* synthetic */ k0 $coroutineScope;
    final /* synthetic */ j1<String> $feedMessage$delegate;
    final /* synthetic */ g1 $feedValue$delegate;
    final /* synthetic */ g1 $oldFeedValue$delegate;
    final /* synthetic */ a<w> $onDismiss;
    final /* synthetic */ q<Pet, Food, Continuation<? super FeedResponse>, Object> $onFeed;
    final /* synthetic */ Pet $pet;
    final /* synthetic */ j1<Boolean> $showFeedResponse$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetBottomSheet.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt$PetBottomSheet$2$2$2$1", f = "PetBottomSheet.kt", l = {289, 292, 296}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt$PetBottomSheet$2$2$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ j1<String> $feedMessage$delegate;
        final /* synthetic */ g1 $feedValue$delegate;
        final /* synthetic */ g1 $oldFeedValue$delegate;
        final /* synthetic */ a<w> $onDismiss;
        final /* synthetic */ q<Pet, Food, Continuation<? super FeedResponse>, Object> $onFeed;
        final /* synthetic */ Pet $pet;
        final /* synthetic */ j1<Boolean> $showFeedResponse$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar, Pet pet, a<w> aVar, j1<String> j1Var, j1<Boolean> j1Var2, g1 g1Var, g1 g1Var2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onFeed = qVar;
            this.$pet = pet;
            this.$onDismiss = aVar;
            this.$feedMessage$delegate = j1Var;
            this.$showFeedResponse$delegate = j1Var2;
            this.$feedValue$delegate = g1Var;
            this.$oldFeedValue$delegate = g1Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$onFeed, this.$pet, this.$onDismiss, this.$feedMessage$delegate, this.$showFeedResponse$delegate, this.$feedValue$delegate, this.$oldFeedValue$delegate, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r9.label
                r2 = -1
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L30
                if (r1 == r6) goto L2c
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                java.lang.Object r0 = r9.L$0
                com.habitrpg.shared.habitica.models.responses.FeedResponse r0 = (com.habitrpg.shared.habitica.models.responses.FeedResponse) r0
                dc.n.b(r10)
                goto Laf
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                java.lang.Object r1 = r9.L$0
                com.habitrpg.shared.habitica.models.responses.FeedResponse r1 = (com.habitrpg.shared.habitica.models.responses.FeedResponse) r1
                dc.n.b(r10)
                goto L67
            L2c:
                dc.n.b(r10)
                goto L43
            L30:
                dc.n.b(r10)
                pc.q<com.habitrpg.android.habitica.models.inventory.Pet, com.habitrpg.android.habitica.models.inventory.Food, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.FeedResponse>, java.lang.Object> r10 = r9.$onFeed
                r1 = 0
                if (r10 == 0) goto L46
                com.habitrpg.android.habitica.models.inventory.Pet r7 = r9.$pet
                r9.label = r6
                java.lang.Object r10 = r10.invoke(r7, r1, r9)
                if (r10 != r0) goto L43
                return r0
            L43:
                r1 = r10
                com.habitrpg.shared.habitica.models.responses.FeedResponse r1 = (com.habitrpg.shared.habitica.models.responses.FeedResponse) r1
            L46:
                j0.j1<java.lang.String> r10 = r9.$feedMessage$delegate
                if (r1 == 0) goto L50
                java.lang.String r7 = r1.getMessage()
                if (r7 != 0) goto L52
            L50:
                java.lang.String r7 = ""
            L52:
                com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$8(r10, r7)
                j0.j1<java.lang.Boolean> r10 = r9.$showFeedResponse$delegate
                com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$11(r10, r6)
                r9.L$0 = r1
                r9.label = r4
                r7 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r10 = ad.u0.a(r7, r9)
                if (r10 != r0) goto L67
                return r0
            L67:
                j0.g1 r10 = r9.$oldFeedValue$delegate
                j0.g1 r4 = r9.$feedValue$delegate
                int r4 = com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$4(r4)
                com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$2(r10, r4)
                j0.g1 r10 = r9.$feedValue$delegate
                if (r1 == 0) goto L85
                java.lang.Integer r4 = r1.getValue()
                if (r4 != 0) goto L7d
                goto L85
            L7d:
                int r4 = r4.intValue()
                if (r4 != r2) goto L85
                r4 = 1
                goto L86
            L85:
                r4 = 0
            L86:
                if (r4 == 0) goto L8b
                r4 = 50
                goto L9e
            L8b:
                if (r1 == 0) goto L98
                java.lang.Integer r4 = r1.getValue()
                if (r4 == 0) goto L98
                int r4 = r4.intValue()
                goto L9e
            L98:
                j0.g1 r4 = r9.$feedValue$delegate
                int r4 = com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$4(r4)
            L9e:
                com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$5(r10, r4)
                r9.L$0 = r1
                r9.label = r3
                r3 = 1800(0x708, double:8.893E-321)
                java.lang.Object r10 = ad.u0.a(r3, r9)
                if (r10 != r0) goto Lae
                return r0
            Lae:
                r0 = r1
            Laf:
                j0.j1<java.lang.Boolean> r10 = r9.$showFeedResponse$delegate
                com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt.access$PetBottomSheet$lambda$11(r10, r5)
                if (r0 == 0) goto Lc4
                java.lang.Integer r10 = r0.getValue()
                if (r10 != 0) goto Lbd
                goto Lc4
            Lbd:
                int r10 = r10.intValue()
                if (r10 != r2) goto Lc4
                r5 = 1
            Lc4:
                if (r5 == 0) goto Lcb
                pc.a<dc.w> r10 = r9.$onDismiss
                r10.invoke()
            Lcb:
                dc.w r10 = dc.w.f13270a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt$PetBottomSheet$2$2$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PetBottomSheetKt$PetBottomSheet$2$2$2(k0 k0Var, q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar, Pet pet, a<w> aVar, j1<String> j1Var, j1<Boolean> j1Var2, g1 g1Var, g1 g1Var2) {
        super(0);
        this.$coroutineScope = k0Var;
        this.$onFeed = qVar;
        this.$pet = pet;
        this.$onDismiss = aVar;
        this.$feedMessage$delegate = j1Var;
        this.$showFeedResponse$delegate = j1Var2;
        this.$feedValue$delegate = g1Var;
        this.$oldFeedValue$delegate = g1Var2;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExceptionHandlerKt.launchCatching$default(this.$coroutineScope, null, new AnonymousClass1(this.$onFeed, this.$pet, this.$onDismiss, this.$feedMessage$delegate, this.$showFeedResponse$delegate, this.$feedValue$delegate, this.$oldFeedValue$delegate, null), 1, null);
    }
}
