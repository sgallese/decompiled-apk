package com.habitrpg.android.habitica.ui.views.stable;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.a;
import pc.p;
import pc.q;
import qc.r;

/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
final class PetBottomSheetKt$PetBottomSheet$2$2$1 extends r implements a<w> {
    final /* synthetic */ k0 $coroutineScope;
    final /* synthetic */ a<w> $onDismiss;
    final /* synthetic */ q<Pet, Food, Continuation<? super FeedResponse>, Object> $onFeed;
    final /* synthetic */ boolean $ownsSaddles;
    final /* synthetic */ Pet $pet;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetBottomSheet.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt$PetBottomSheet$2$2$1$1", f = "PetBottomSheet.kt", l = {266}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt$PetBottomSheet$2$2$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ q<Pet, Food, Continuation<? super FeedResponse>, Object> $onFeed;
        final /* synthetic */ Pet $pet;
        final /* synthetic */ Food $saddle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar, Pet pet, Food food, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onFeed = qVar;
            this.$pet = pet;
            this.$saddle = food;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$onFeed, this.$pet, this.$saddle, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                q<Pet, Food, Continuation<? super FeedResponse>, Object> qVar = this.$onFeed;
                if (qVar != null) {
                    Pet pet = this.$pet;
                    Food food = this.$saddle;
                    this.label = 1;
                    obj = qVar.invoke(pet, food, this);
                    if (obj == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
            FeedResponse feedResponse = (FeedResponse) obj;
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PetBottomSheetKt$PetBottomSheet$2$2$1(boolean z10, k0 k0Var, a<w> aVar, q<? super Pet, ? super Food, ? super Continuation<? super FeedResponse>, ? extends Object> qVar, Pet pet) {
        super(0);
        this.$ownsSaddles = z10;
        this.$coroutineScope = k0Var;
        this.$onDismiss = aVar;
        this.$onFeed = qVar;
        this.$pet = pet;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$ownsSaddles) {
            Food food = new Food();
            food.setKey("Saddle");
            ExceptionHandlerKt.launchCatching$default(this.$coroutineScope, null, new AnonymousClass1(this.$onFeed, this.$pet, food, null), 1, null);
        } else {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.marketFragment, null, 2, null);
        }
        this.$onDismiss.invoke();
    }
}
