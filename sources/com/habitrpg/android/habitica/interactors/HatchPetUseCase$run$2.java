package com.habitrpg.android.habitica.interactors;

import ad.k0;
import ad.l0;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.d1;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.PetImageviewBinding;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.interactors.SharePetUseCase;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.n;
import dc.w;
import ic.d;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.a;
import pc.p;
import qc.q;
import qc.r;
import w3.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HatchPetUseCase.kt */
/* loaded from: classes4.dex */
public final class HatchPetUseCase$run$2 extends r implements a<w> {
    final /* synthetic */ HatchPetUseCase.RequestValues $requestValues;
    final /* synthetic */ HatchPetUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HatchPetUseCase.kt */
    /* renamed from: com.habitrpg.android.habitica.interactors.HatchPetUseCase$run$2$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ HatchPetUseCase.RequestValues $requestValues;
        final /* synthetic */ HatchPetUseCase this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HatchPetUseCase.kt */
        @f(c = "com.habitrpg.android.habitica.interactors.HatchPetUseCase$run$2$2$1", f = "HatchPetUseCase.kt", l = {63}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.interactors.HatchPetUseCase$run$2$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
            final /* synthetic */ HatchPetUseCase.RequestValues $requestValues;
            int label;
            final /* synthetic */ HatchPetUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HatchPetUseCase hatchPetUseCase, HatchPetUseCase.RequestValues requestValues, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = hatchPetUseCase;
                this.$requestValues = requestValues;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$requestValues, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                InventoryRepository inventoryRepository;
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
                    inventoryRepository = this.this$0.inventoryRepository;
                    String str = this.$requestValues.getEgg().getKey() + "-" + this.$requestValues.getPotion().getKey();
                    this.label = 1;
                    if (inventoryRepository.equip("pet", str, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HatchPetUseCase hatchPetUseCase, HatchPetUseCase.RequestValues requestValues) {
            super(2);
            this.this$0 = hatchPetUseCase;
            this.$requestValues = requestValues;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(this.this$0, this.$requestValues, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HatchPetUseCase.kt */
    /* renamed from: com.habitrpg.android.habitica.interactors.HatchPetUseCase$run$2$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ String $eggName;
        final /* synthetic */ String $petKey;
        final /* synthetic */ String $potionName;
        final /* synthetic */ HatchPetUseCase.RequestValues $requestValues;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HatchPetUseCase.kt */
        @f(c = "com.habitrpg.android.habitica.interactors.HatchPetUseCase$run$2$3$1", f = "HatchPetUseCase.kt", l = {71}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.interactors.HatchPetUseCase$run$2$3$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
            final /* synthetic */ String $eggName;
            final /* synthetic */ String $petKey;
            final /* synthetic */ String $potionName;
            final /* synthetic */ HatchPetUseCase.RequestValues $requestValues;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, HatchPetUseCase.RequestValues requestValues, String str2, String str3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$petKey = str;
                this.$requestValues = requestValues;
                this.$potionName = str2;
                this.$eggName = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$petKey, this.$requestValues, this.$potionName, this.$eggName, continuation);
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
                    SharePetUseCase sharePetUseCase = new SharePetUseCase();
                    String str = this.$petKey;
                    String string = this.$requestValues.getContext().getString(R.string.share_hatched, this.$potionName, this.$eggName);
                    q.h(string, "getString(...)");
                    SharePetUseCase.RequestValues requestValues = new SharePetUseCase.RequestValues(str, string, this.$requestValues.getContext());
                    this.label = 1;
                    if (sharePetUseCase.callInteractor(requestValues, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, HatchPetUseCase.RequestValues requestValues, String str2, String str3) {
            super(2);
            this.$petKey = str;
            this.$requestValues = requestValues;
            this.$potionName = str2;
            this.$eggName = str3;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "hatchingDialog");
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(this.$petKey, this.$requestValues, this.$potionName, this.$eggName, null), 1, null);
            habiticaAlertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPetUseCase$run$2(HatchPetUseCase.RequestValues requestValues, HatchPetUseCase hatchPetUseCase) {
        super(0);
        this.$requestValues = requestValues;
        this.this$0 = hatchPetUseCase;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WeakReference<BaseActivity> currentActivity;
        PetImageviewBinding inflate = PetImageviewBinding.inflate(ContextExtensionsKt.getLayoutInflater(this.$requestValues.getContext()));
        q.h(inflate, "inflate(...)");
        String str = this.$requestValues.getEgg().getKey() + "-" + this.$requestValues.getPotion().getKey();
        PixelArtView pixelArtView = inflate.petImageview;
        q.h(pixelArtView, "petImageview");
        BaseActivity baseActivity = null;
        DataBindingUtilsKt.loadImage$default(pixelArtView, "stable_Pet-" + str, null, 2, null);
        String text = this.$requestValues.getPotion().getText();
        String text2 = this.$requestValues.getEgg().getText();
        HabiticaBaseApplication companion = HabiticaBaseApplication.Companion.getInstance(this.$requestValues.getContext());
        if (companion != null && (currentActivity = companion.getCurrentActivity()) != null) {
            baseActivity = currentActivity.get();
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this.$requestValues.getContext());
        if (baseActivity != null) {
            inflate.backgroundView.setContent(ComposableSingletons$HatchPetUseCaseKt.INSTANCE.m10getLambda2$Habitica_2311256681_prodRelease());
            Window window = habiticaAlertDialog.getWindow();
            if (window != null) {
                FrameLayout root = inflate.getRoot();
                q.h(root, "getRoot(...)");
                e.b(root, baseActivity);
                View decorView = window.getDecorView();
                q.h(decorView, "getDecorView(...)");
                e.b(decorView, baseActivity);
                FrameLayout root2 = inflate.getRoot();
                q.h(root2, "getRoot(...)");
                d1.b(root2, baseActivity);
                View decorView2 = window.getDecorView();
                q.h(decorView2, "getDecorView(...)");
                d1.b(decorView2, baseActivity);
            }
        }
        habiticaAlertDialog.setCelebratory(true);
        habiticaAlertDialog.setTitle(this.$requestValues.getContext().getString(R.string.hatched_pet_title, text, text2));
        habiticaAlertDialog.setAdditionalContentView(inflate.getRoot());
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.equip, true, false, false, (p) new AnonymousClass2(this.this$0, this.$requestValues), 12, (Object) null);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.share, false, false, false, (p) new AnonymousClass3(str, this.$requestValues, text, text2), 12, (Object) null);
        habiticaAlertDialog.setExtraCloseButtonVisibility(0);
        habiticaAlertDialog.enqueue();
    }
}
