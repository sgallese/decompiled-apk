package com.habitrpg.android.habitica.interactors;

import ad.k0;
import ad.u0;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.DisplayItemDropUseCase;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DisplayItemDropUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.DisplayItemDropUseCase$run$2", f = "DisplayItemDropUseCase.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DisplayItemDropUseCase$run$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ DisplayItemDropUseCase.RequestValues $requestValues;
    final /* synthetic */ StringBuilder $snackbarText;
    int label;
    final /* synthetic */ DisplayItemDropUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayItemDropUseCase$run$2(DisplayItemDropUseCase.RequestValues requestValues, StringBuilder sb2, DisplayItemDropUseCase displayItemDropUseCase, Continuation<? super DisplayItemDropUseCase$run$2> continuation) {
        super(2, continuation);
        this.$requestValues = requestValues;
        this.$snackbarText = sb2;
        this.this$0 = displayItemDropUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new DisplayItemDropUseCase$run$2(this.$requestValues, this.$snackbarText, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((DisplayItemDropUseCase$run$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SoundManager soundManager;
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
            this.label = 1;
            if (u0.a(3000L, this) == d10) {
                return d10;
            }
        }
        HabiticaSnackbar.Companion.showSnackbar(this.$requestValues.getSnackbarTargetView(), this.$snackbarText, HabiticaSnackbar.SnackbarDisplayType.DROP, (r16 & 8) != 0 ? false : true, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
        soundManager = this.this$0.soundManager;
        soundManager.loadAndPlayAudio(SoundManager.SoundItemDrop);
        return w.f13270a;
    }
}
